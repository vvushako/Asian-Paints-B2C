/**
 *
 */
package com.asianpaints.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.asianpaints.core.model.AsianpaintsSizeVariantProductModel;



/**
 * @author vvushako
 *
 */
public class AsianpaintsAddonPopulator<SOURCE extends ProductModel, TARGET extends ProductData> extends
		ProductBasicPopulator<ProductModel, ProductData>
{
	@Override
	public void populate(final ProductModel source, final ProductData target) throws ConversionException
	{
		super.populate(source, target);
		if (source instanceof AsianpaintsSizeVariantProductModel)
		{
			target.setAddons(((AsianpaintsSizeVariantProductModel) source).getAddons());
		}
	}
}
