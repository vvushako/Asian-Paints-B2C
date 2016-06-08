/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 30, 2016 9:49:19 PM                     ---
 * ----------------------------------------------------------------
 */
package com.asianpaints.core.jalo;

import com.asianpaints.core.constants.AsianpaintsCoreConstants;
import com.asianpaints.core.jalo.AsianpaintsStyleVariantProduct;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.asianpaints.core.jalo.AsianpaintsSizeVariantProduct AsianpaintsSizeVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAsianpaintsSizeVariantProduct extends AsianpaintsStyleVariantProduct
{
	/** Qualifier of the <code>AsianpaintsSizeVariantProduct.size</code> attribute **/
	public static final String SIZE = "size";
	/** Qualifier of the <code>AsianpaintsSizeVariantProduct.addons</code> attribute **/
	public static final String ADDONS = "addons";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AsianpaintsStyleVariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SIZE, AttributeMode.INITIAL);
		tmp.put(ADDONS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsianpaintsSizeVariantProduct.addons</code> attribute.
	 * @return the addons - Adding extra things for selected product.
	 */
	public List<String> getAddons(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, ADDONS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsianpaintsSizeVariantProduct.addons</code> attribute.
	 * @return the addons - Adding extra things for selected product.
	 */
	public List<String> getAddons()
	{
		return getAddons( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AsianpaintsSizeVariantProduct.addons</code> attribute. 
	 * @param value the addons - Adding extra things for selected product.
	 */
	public void setAddons(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, ADDONS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AsianpaintsSizeVariantProduct.addons</code> attribute. 
	 * @param value the addons - Adding extra things for selected product.
	 */
	public void setAddons(final List<String> value)
	{
		setAddons( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsianpaintsSizeVariantProduct.size</code> attribute.
	 * @return the size - Size of the product.
	 */
	public String getSize(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAsianpaintsSizeVariantProduct.getSize requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsianpaintsSizeVariantProduct.size</code> attribute.
	 * @return the size - Size of the product.
	 */
	public String getSize()
	{
		return getSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsianpaintsSizeVariantProduct.size</code> attribute. 
	 * @return the localized size - Size of the product.
	 */
	public Map<Language,String> getAllSize(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SIZE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsianpaintsSizeVariantProduct.size</code> attribute. 
	 * @return the localized size - Size of the product.
	 */
	public Map<Language,String> getAllSize()
	{
		return getAllSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AsianpaintsSizeVariantProduct.size</code> attribute. 
	 * @param value the size - Size of the product.
	 */
	public void setSize(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAsianpaintsSizeVariantProduct.setSize requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AsianpaintsSizeVariantProduct.size</code> attribute. 
	 * @param value the size - Size of the product.
	 */
	public void setSize(final String value)
	{
		setSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AsianpaintsSizeVariantProduct.size</code> attribute. 
	 * @param value the size - Size of the product.
	 */
	public void setAllSize(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AsianpaintsSizeVariantProduct.size</code> attribute. 
	 * @param value the size - Size of the product.
	 */
	public void setAllSize(final Map<Language,String> value)
	{
		setAllSize( getSession().getSessionContext(), value );
	}
	
}
