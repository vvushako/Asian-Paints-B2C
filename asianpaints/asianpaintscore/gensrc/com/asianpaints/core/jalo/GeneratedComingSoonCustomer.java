/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 30, 2016 9:49:19 PM                     ---
 * ----------------------------------------------------------------
 */
package com.asianpaints.core.jalo;

import com.asianpaints.core.constants.AsianpaintsCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ComingSoonCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedComingSoonCustomer extends GenericItem
{
	/** Qualifier of the <code>ComingSoonCustomer.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>ComingSoonCustomer.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>ComingSoonCustomer.emailId</code> attribute **/
	public static final String EMAILID = "emailId";
	/** Qualifier of the <code>ComingSoonCustomer.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	/** Qualifier of the <code>ComingSoonCustomer.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>ComingSoonCustomer.isExported</code> attribute **/
	public static final String ISEXPORTED = "isExported";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(EMAILID, AttributeMode.INITIAL);
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(ISEXPORTED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.emailId</code> attribute.
	 * @return the emailId
	 */
	public String getEmailId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.emailId</code> attribute.
	 * @return the emailId
	 */
	public String getEmailId()
	{
		return getEmailId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.emailId</code> attribute. 
	 * @param value the emailId
	 */
	public void setEmailId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.emailId</code> attribute. 
	 * @param value the emailId
	 */
	public void setEmailId(final String value)
	{
		setEmailId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.isExported</code> attribute.
	 * @return the isExported - Products which are coming soon.
	 */
	public Boolean isIsExported(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISEXPORTED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.isExported</code> attribute.
	 * @return the isExported - Products which are coming soon.
	 */
	public Boolean isIsExported()
	{
		return isIsExported( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.isExported</code> attribute. 
	 * @return the isExported - Products which are coming soon.
	 */
	public boolean isIsExportedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsExported( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.isExported</code> attribute. 
	 * @return the isExported - Products which are coming soon.
	 */
	public boolean isIsExportedAsPrimitive()
	{
		return isIsExportedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.isExported</code> attribute. 
	 * @param value the isExported - Products which are coming soon.
	 */
	public void setIsExported(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISEXPORTED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.isExported</code> attribute. 
	 * @param value the isExported - Products which are coming soon.
	 */
	public void setIsExported(final Boolean value)
	{
		setIsExported( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.isExported</code> attribute. 
	 * @param value the isExported - Products which are coming soon.
	 */
	public void setIsExported(final SessionContext ctx, final boolean value)
	{
		setIsExported( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.isExported</code> attribute. 
	 * @param value the isExported - Products which are coming soon.
	 */
	public void setIsExported(final boolean value)
	{
		setIsExported( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final String value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
}
