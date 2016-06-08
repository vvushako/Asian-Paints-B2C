/**
 *
 */
package com.asianpaints.facades.populators;

import de.hybris.platform.commercefacades.order.converters.populator.OrderEntryPopulator;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;


/**
 * @author vvushako
 *
 */
public class AsianpaintsOrderEntryPopulator extends OrderEntryPopulator
{
	@Override
	public void populate(final AbstractOrderEntryModel source, final OrderEntryData target)
	{
		//
		super.populate(source, target);
		if (source.getSelectedAddons() != null)
		{
			target.setAddonsOrderEntry(source.getSelectedAddons());

			//	target.setAddonsOrderEntry(((CartEntryModel) source).getCartAddons());
		}

	}
}
