<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/desktop/formElement" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<c:url var="contactNumberUrl" value="/my-account/update-contactNumber" />
<div class="span-24">
	<div class="span-20 last">	
		<div class="accountContentPane clearfix">
			<div class="headline"><spring:theme code="text.account.change.email.address" text="Profile"/></div>
			<div class="required right"><spring:theme code="form.required" text="Fields marked * are required"/></div>
			<div class="description"><spring:theme code="text.account.profile.updateContactNumberAddress" text="Enter your new Contact Number and confirm with your password"/></div>
			
			<form:form action="update-contactNumber" method="post" commandName="updateContactNumberForm">

				<formElement:formInputBox idKey="profile.contactNumber" labelKey="profile.contactNumber" path="contactNumber" inputCSS="text" mandatory="true"/>
				<formElement:formInputBox idKey="profile.checkContactNumber"  labelKey="profile.checkContactNumber" path="chkContactNumber" inputCSS="text" mandatory="true"/>
				<formElement:formPasswordBox idKey="profile.pwd" labelKey="profile.pwd" path="password" inputCSS="text" mandatory="true"/>
				<input type="hidden" id="recaptchaChallangeAnswered" value="${requestScope.recaptchaChallangeAnswered}"/>
					
				<div class="form_field-elements control-group js-recaptcha-captchaaddon"></div>
				<div class="form-actions">
					<button type="button" class="negative" onclick="window.location='${contactNumberUrl}'"><spring:theme code="text.account.profile.cancel" text="Cancel"/></button>
					<ycommerce:testId code="myAccount_profile_SaveUpdates_button">
						<button class="positive" type="submit"><spring:theme code="text.account.profile.saveUpdates" text="Save Updates"/></button>
					</ycommerce:testId>
				</div>
			</form:form>
			
		</div>
	</div>
</div>
