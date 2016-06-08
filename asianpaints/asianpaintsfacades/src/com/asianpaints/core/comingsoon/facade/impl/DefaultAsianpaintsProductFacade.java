/**
 *
 */
package com.asianpaints.core.comingsoon.facade.impl;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.asianpaints.core.comingsoon.facade.AsianpaintsProductFacade;
import com.asianpaints.core.comingsoon.service.AsianpaintsProductService;
import com.asianpaints.facades.product.data.ComingSoonCustomerData;


public class DefaultAsianpaintsProductFacade implements AsianpaintsProductFacade
{
	AsianpaintsProductService asianpaintsProductService;
	private Converter<ProductModel, ProductData> productConverter;

	@Override
	public List<ProductModel> getComingSoonProducts()
	{
		final List<ProductModel> productModel = getAsianpaintsProductService().getComingSoonProducts();
		//return Converters.convertAll(productModel, getProductConverter());
		return productModel;
	}

	/**
	 * @return the productConverter
	 */
	public Converter<ProductModel, ProductData> getProductConverter()
	{
		return productConverter;
	}

	/**
	 * @param productConverter
	 *           the productConverter to set
	 */
	public void setProductConverter(final Converter<ProductModel, ProductData> productConverter)
	{
		this.productConverter = productConverter;
	}

	/**
	 * @return the asianpaintsProductService
	 */
	public AsianpaintsProductService getAsianpaintsProductService()
	{
		return asianpaintsProductService;
	}

	/**
	 * @param asianpaintsProductService
	 *           the asianpaintsProductService to set
	 */

	@Required
	public void setAsianpaintsProductService(final AsianpaintsProductService asianpaintsProductService)
	{
		this.asianpaintsProductService = asianpaintsProductService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.asianpaints.core.comingsoon.facade.AsianpaintsProductFacade#saveNotifyMeProducts(com.asianpaints.facades.
	 * product .data.ComingSoonCustomerData)
	 */
	@Override
	public void saveNotifyMeProducts(final ComingSoonCustomerData data)
	{
		// YTODO Auto-generated method stub
		getAsianpaintsProductService().saveNotifyMeProducts(data);

	}



}