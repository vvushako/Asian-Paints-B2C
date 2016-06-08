/**
 *
 */

package com.asianpaints.core.comingsoon.service.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.asianpaints.core.comingsoon.dao.AsianpaintsProductDao;
import com.asianpaints.core.comingsoon.service.AsianpaintsProductService;
import com.asianpaints.core.model.ComingSoonCustomerModel;
import com.asianpaints.facades.product.data.ComingSoonCustomerData;


/**
 * @author vvushako
 *
 */

public class DefaultAsianpaintsProductService implements AsianpaintsProductService
{
	AsianpaintsProductDao asianpaintsProductDao;
	private ModelService modelService;

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Override
	public List<ProductModel> getComingSoonProducts()
	{

		final List<ProductModel> products = asianpaintsProductDao.getComingSoonProducts();
		return products;

	}

	/**
	 * @return the asianpaintsProductDao
	 */
	public AsianpaintsProductDao getAsianpaintsProductDao()
	{
		return asianpaintsProductDao;
	}

	/**
	 * @param asianpaintsProductDao
	 *           the asianpaintsProductDao to set
	 */

	@Required
	public void setAsianpaintsProductDao(final AsianpaintsProductDao asianpaintsProductDao)
	{
		this.asianpaintsProductDao = asianpaintsProductDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asianpaints.core.comingsoon.service.AsianpaintsProductService#saveNotifyMeProducts()
	 */
	@Override
	public void saveNotifyMeProducts(final ComingSoonCustomerData data)
	{
		// YTODO Auto-generated method stub
		final ComingSoonCustomerModel comingSoonCustomerModel = modelService.create(ComingSoonCustomerModel.class);
		comingSoonCustomerModel.setFirstName(data.getFirstName());
		comingSoonCustomerModel.setLastName(data.getLastName());
		comingSoonCustomerModel.setEmailId(data.getEmailId());
		comingSoonCustomerModel.setProductName(data.getProductName());
		comingSoonCustomerModel.setProductCode(data.getProductCode());

		getModelService().save(comingSoonCustomerModel);

	}


}
