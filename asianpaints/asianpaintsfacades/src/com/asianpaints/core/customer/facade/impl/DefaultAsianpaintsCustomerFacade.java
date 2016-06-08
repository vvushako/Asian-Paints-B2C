/**
 *
 */
package com.asianpaints.core.customer.facade.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.Assert;


/**
 * @author vvushako
 *
 */
public class DefaultAsianpaintsCustomerFacade extends DefaultCustomerFacade
{
	@Resource(name = "modelService")
	ModelService modelService;

	@Override
	public void register(final RegisterData registerData) throws DuplicateUidException
	{
		validateParameterNotNullStandardMessage("registerData", registerData);
		Assert.hasText(registerData.getFirstName(), "The field [FirstName] cannot be empty");
		Assert.hasText(registerData.getLastName(), "The field [LastName] cannot be empty");
		Assert.hasText(registerData.getLogin(), "The field [Login] cannot be empty");

		final CustomerModel newCustomer = getModelService().create(CustomerModel.class);
		newCustomer.setName(getCustomerNameStrategy().getName(registerData.getFirstName(), registerData.getLastName()));

		if (StringUtils.isNotBlank(registerData.getFirstName()) && StringUtils.isNotBlank(registerData.getLastName()))
		{
			newCustomer.setName(getCustomerNameStrategy().getName(registerData.getFirstName(), registerData.getLastName()));
		}
		final TitleModel title = getUserService().getTitleForCode(registerData.getTitleCode());
		newCustomer.setTitle(title);
		setUidForRegister(registerData, newCustomer);


		newCustomer.setContactNumber(registerData.getContactNumber());
		newCustomer.setDateOfBirth(registerData.getDateOfBirth());

		newCustomer.setSessionLanguage(getCommonI18NService().getCurrentLanguage());
		newCustomer.setSessionCurrency(getCommonI18NService().getCurrentCurrency());
		getCustomerAccountService().register(newCustomer, registerData.getPassword());
	}

	public void updateContact(final CustomerData customerData) throws DuplicateUidException
	{
		//validateDataBeforeUpdate(customerData);

		final CustomerModel currentUser = (CustomerModel) getUserService().getCurrentUser();
		currentUser.setContactNumber(customerData.getContactNumber());
		modelService.save(currentUser);

		/*
		 * final String name = getCustomerNameStrategy().getName(customerData.getFirstName(), customerData.getLastName());
		 * final CustomerModel customer = getCurrentSessionCustomer();
		 * customer.setOriginalUid(customerData.getDisplayUid()); getCustomerAccountService().updateProfile(customer,
		 * customerData.getTitleCode(), name, customerData.getUid());
		 */
	}
}
