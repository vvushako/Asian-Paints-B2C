/**
 *
 */

package com.asianpaints.storefront.forms.validation;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.asianpaints.storefront.forms.UpdateContactNumberForm;


/**
 * @author vvushako
 *
 */

@Component(value = "asianpaintsContactNumberValidator")
public class AsianpaintsContactNumberValidator implements Validator
{
	@Override
	public void validate(final Object object, final Errors errors)
	{
		final UpdateContactNumberForm updateContactNumberForm = (UpdateContactNumberForm) object;
		final String contactNumber = updateContactNumberForm.getContactNumber();
		final String chkContactNumber = updateContactNumberForm.getChkContactNumber();
		final String password = updateContactNumberForm.getPassword();
		//final String chkPassword = updateContactNumberForm.getChkPassword();

		if (StringUtils.isEmpty(contactNumber))
		{
			errors.rejectValue("contactNumber", "profile.contactNumber.invalid");
		}
		else if (StringUtils.length(contactNumber) != 10)
		{
			errors.rejectValue("contactNumber", "profile.contactNumber.invalid");
		}

		if (StringUtils.isEmpty(chkContactNumber))
		{
			errors.rejectValue("chkContactNumber", "profile.chkContactNumber.invalid");
		}

		if (StringUtils.isEmpty(password))
		{
			errors.rejectValue("password", "profile.pwd.invalid");
		}
		/*
		 * if (StringUtils.isEmpty(chkPassword)) { errors.rejectValue("chkPassword", "profile.chkPassword.invalid"); }
		 */
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(final Class<?> class1)
	{
		// YTODO Auto-generated method stub
		return false;
	}
}
