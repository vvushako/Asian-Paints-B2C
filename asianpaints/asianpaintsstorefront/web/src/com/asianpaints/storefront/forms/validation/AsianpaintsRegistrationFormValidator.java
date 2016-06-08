/**
 *
 */
package com.asianpaints.storefront.forms.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.asianpaints.storefront.forms.AsianpaintsRegisterForm;


/**
 * @author vvushako
 *
 */
@Component(value = "asianpaintsRegistrationFormValidator")
public class AsianpaintsRegistrationFormValidator implements Validator
{
	public static final Pattern EMAIL_REGEX = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");

	@Override
	public boolean supports(final Class<?> aClass)
	{
		return AsianpaintsRegisterForm.class.equals(aClass);
	}

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final AsianpaintsRegisterForm asianpaintsRegisterForm = (AsianpaintsRegisterForm) object;
		final String titleCode = asianpaintsRegisterForm.getTitleCode();
		final String firstName = asianpaintsRegisterForm.getFirstName();
		final String lastName = asianpaintsRegisterForm.getLastName();
		final String email = asianpaintsRegisterForm.getEmail();
		final String pwd = asianpaintsRegisterForm.getPwd();
		final String checkPwd = asianpaintsRegisterForm.getCheckPwd();
		final String contactNumber = asianpaintsRegisterForm.getContactNumber();
		//final String dateOfbirth = asianpaintsRegisterForm.g

		if (StringUtils.isEmpty(titleCode))
		{
			errors.rejectValue("titleCode", "register.title.invalid");
		}
		else if (StringUtils.length(titleCode) > 255)
		{
			errors.rejectValue("titleCode", "register.title.invalid");
		}

		if (StringUtils.isBlank(firstName))
		{
			errors.rejectValue("firstName", "register.firstName.invalid");
		}
		else if (StringUtils.length(firstName) > 255)
		{
			errors.rejectValue("firstName", "register.firstName.invalid");
		}

		if (StringUtils.isBlank(lastName))
		{
			errors.rejectValue("lastName", "register.lastName.invalid");
		}
		else if (StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.lastName.invalid");
		}

		if (StringUtils.length(firstName) + StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.name.invalid");
			errors.rejectValue("firstName", "register.name.invalid");
		}

		if (StringUtils.isEmpty(email))
		{
			errors.rejectValue("email", "register.email.invalid");
		}
		else if (StringUtils.length(email) > 255 || !validateEmailAddress(email))
		{
			errors.rejectValue("email", "register.email.invalid");
		}

		if (StringUtils.isEmpty(pwd))
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}
		else if (StringUtils.length(pwd) < 6 || StringUtils.length(pwd) > 255)
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}

		if (StringUtils.isNotEmpty(pwd) && StringUtils.isNotEmpty(checkPwd) && !StringUtils.equals(pwd, checkPwd))
		{
			errors.rejectValue("checkPwd", "validation.checkPwd.equals");
		}
		else
		{
			if (StringUtils.isEmpty(checkPwd))
			{
				errors.rejectValue("checkPwd", "register.checkPwd.invalid");
			}
		}
		if (StringUtils.isEmpty(contactNumber))
		{
			errors.rejectValue("contactNumber", "register.title.invalid");
		}
		else if (StringUtils.length(contactNumber) != 10)
		{
			errors.rejectValue("contactNumber", "register.contactNumber.invalid");
		}
	}

	public boolean validateEmailAddress(final String email)
	{
		final Matcher matcher = EMAIL_REGEX.matcher(email);
		return matcher.matches();
	}
}
