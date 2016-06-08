/**
 *
 */
package com.paypal.hybris.cockpit.services.search.meta.impl;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cscockpit.model.data.impl.DefaultDataObject;
import de.hybris.platform.cscockpit.services.search.CsSearchCommand;
import de.hybris.platform.cscockpit.services.search.Pageable;
import de.hybris.platform.cscockpit.services.search.generic.CsFlexibleSearchQueryBuilder;
import de.hybris.platform.cscockpit.services.search.meta.PostSearchMetaProcessor;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import com.paypal.hybris.cockpit.model.data.PayPalTransactionEntry;


/**
 * @author Aliaksei_Sery (EPAM Systems)
 *
 */
public class PayPalTransactionPostProcessor implements PostSearchMetaProcessor
{
	private FlexibleSearchService flexibleSearchService;
	private CsFlexibleSearchQueryBuilder flexibleSearchQueryBuilder;

	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	/**
	 * @return the flexibleSearchQueryBuilder
	 */
	public CsFlexibleSearchQueryBuilder getFlexibleSearchQueryBuilder()
	{
		return flexibleSearchQueryBuilder;
	}

	/**
	 * @param flexibleSearchQueryBuilder
	 *           the flexibleSearchQueryBuilder to set
	 */
	@Required
	public void setFlexibleSearchQueryBuilder(final CsFlexibleSearchQueryBuilder flexibleSearchQueryBuilder)
	{
		this.flexibleSearchQueryBuilder = flexibleSearchQueryBuilder;
	}

	protected FlexibleSearchQuery buildFlexibleSearchQuery(final CsSearchCommand command, final Pageable pageable)
	{
		return (FlexibleSearchQuery) getFlexibleSearchQueryBuilder().translateQuery(command, pageable);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.cscockpit.services.search.meta.PostSearchMetaProcessor#populateMetaData(java.util.List,
	 * java.lang.Object)
	 */
	@Override
	public void populateMetaData(final List metaItems, final Object searchResult)
	{
		for (final Iterator it = metaItems.iterator(); it.hasNext();)
		{
			final DefaultDataObject metaItem = (DefaultDataObject) it.next();
			final PayPalTransactionEntry transactionEntry = (PayPalTransactionEntry) metaItem.getItem();
			final ItemModel orderItem = (ItemModel) searchOrderByTransaction(transactionEntry);
			if (orderItem != null)
			{
				metaItem.getMetaData().register(orderItem, ItemModel.class);
			}
		}
	}

	protected Object searchOrderByTransaction(final PayPalTransactionEntry entry)
	{
		final StringBuilder query = new StringBuilder(300);

		query.append("SELECT DISTINCT {o:pk}, {o.code} ");
		query.append("FROM {Order AS o} WHERE {o:PK} IN "
				+ "({{SELECT DISTINCT {pt.order} FROM {PaymentTransaction AS pt} WHERE {pt:PK} IN "
				+ "( {{SELECT DISTINCT {pte.paymentTransaction} FROM {PaymentTransactionEntry AS pte} WHERE {pte.requestId} = ?requestId}}) }})");

		final Map<String, Object> queryParams = new HashMap<String, Object>();
		queryParams.put("requestId", entry.getTransactionId());
		final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString(), queryParams);

		final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
		final List items = searchResult.getResult();

		if (items != null && !items.isEmpty())
		{
			return items.get(0);
		}

		return null;
	}
}
