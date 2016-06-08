/**
 *
 */
package com.asianpaints.core.comingsoon.facade;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import com.asianpaints.facades.product.data.ComingSoonCustomerData;


/**
 * @author vvushako
 *
 */
public interface AsianpaintsProductFacade
{
	//List<ProductData> getComingSoonProducts();
	List<ProductModel> getComingSoonProducts();

	/**
	 * @param <SaveCustomerDataForm>
	 * @param data
	 * @return
	 *
	 */

	/**
	 * @param data
	 */
	void saveNotifyMeProducts(ComingSoonCustomerData data);
}
