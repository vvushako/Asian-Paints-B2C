/**
 *
 */
package com.asianpaints.core.cart.facade;

import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.order.impl.DefaultCartFacade;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;


/**
 * @author Dell
 *
 */
public class DefaultAsianpaintsCartFacade extends DefaultCartFacade
{
	public CartModificationData addToCart(final String code, final long quantity, final List<String> addons)
			throws CommerceCartModificationException
	{
		final ProductModel product = getProductService().getProductForCode(code);
		final CartModel cartModel = getCartService().getSessionCart();
		final CommerceCartParameter parameter = new CommerceCartParameter();
		parameter.setEnableHooks(true);
		parameter.setCart(cartModel);
		parameter.setQuantity(quantity);
		parameter.setProduct(product);
		parameter.setUnit(product.getUnit());
		parameter.setCreateNewEntry(false);
		//parameter.setCartAddons(addons);
		parameter.setSelectedAddons(addons);


		final CommerceCartModification modification = getCommerceCartService().addToCart(parameter);

		return getCartModificationConverter().convert(modification);
	}
}
