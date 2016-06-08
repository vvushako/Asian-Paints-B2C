/**
 *
 */
package com.asianpaints.core.comingsoon.dao.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import javax.annotation.Resource;

import com.asianpaints.core.comingsoon.dao.AsianpaintsProductDao;



//public class DefaultAsianpaintsProductDao extends DefaultProductDao implements AsianpaintsProductDao
public class DefaultAsianpaintsProductDao implements AsianpaintsProductDao
{
	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

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
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	public DefaultAsianpaintsProductDao()
	{
		super();
		// YTODO Auto-generated constructor stub
	}

	@Override
	public List<ProductModel> getComingSoonProducts()
	{
		final String query = "Select {PK} From {Product} Where {isComingSoon} = true";
		final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
		final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
		return searchResult.getResult();
	}


}
