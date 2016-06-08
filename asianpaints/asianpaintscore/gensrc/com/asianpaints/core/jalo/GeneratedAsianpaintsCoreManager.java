/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 30, 2016 9:49:19 PM                     ---
 * ----------------------------------------------------------------
 */
package com.asianpaints.core.jalo;

import com.asianpaints.core.constants.AsianpaintsCoreConstants;
import com.asianpaints.core.jalo.ApparelProduct;
import com.asianpaints.core.jalo.ApparelSizeVariantProduct;
import com.asianpaints.core.jalo.ApparelStyleVariantProduct;
import com.asianpaints.core.jalo.AsianpaintsProduct;
import com.asianpaints.core.jalo.AsianpaintsSizeVariantProduct;
import com.asianpaints.core.jalo.AsianpaintsStyleVariantProduct;
import com.asianpaints.core.jalo.ComingSoonCustomer;
import com.asianpaints.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>AsianpaintsCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAsianpaintsCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("contactNumber", AttributeMode.INITIAL);
		tmp.put("dateOfBirth", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("selectedAddons", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactNumber</code> attribute.
	 * @return the contactNumber
	 */
	public String getContactNumber(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.Customer.CONTACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactNumber</code> attribute.
	 * @return the contactNumber
	 */
	public String getContactNumber(final Customer item)
	{
		return getContactNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contactNumber</code> attribute. 
	 * @param value the contactNumber
	 */
	public void setContactNumber(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.Customer.CONTACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contactNumber</code> attribute. 
	 * @param value the contactNumber
	 */
	public void setContactNumber(final Customer item, final String value)
	{
		setContactNumber( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsProduct createAsianpaintsProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSPRODUCT );
			return (AsianpaintsProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AsianpaintsProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsProduct createAsianpaintsProduct(final Map attributeValues)
	{
		return createAsianpaintsProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsSizeVariantProduct createAsianpaintsSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSSIZEVARIANTPRODUCT );
			return (AsianpaintsSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AsianpaintsSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsSizeVariantProduct createAsianpaintsSizeVariantProduct(final Map attributeValues)
	{
		return createAsianpaintsSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsStyleVariantProduct createAsianpaintsStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSSTYLEVARIANTPRODUCT );
			return (AsianpaintsStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AsianpaintsStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsStyleVariantProduct createAsianpaintsStyleVariantProduct(final Map attributeValues)
	{
		return createAsianpaintsStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ComingSoonCustomer createComingSoonCustomer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.COMINGSOONCUSTOMER );
			return (ComingSoonCustomer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ComingSoonCustomer : "+e.getMessage(), 0 );
		}
	}
	
	public ComingSoonCustomer createComingSoonCustomer(final Map attributeValues)
	{
		return createComingSoonCustomer( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth(final SessionContext ctx, final Customer item)
	{
		return (Date)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.Customer.DATEOFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth(final Customer item)
	{
		return getDateOfBirth( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final SessionContext ctx, final Customer item, final Date value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.Customer.DATEOFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final Customer item, final Date value)
	{
		setDateOfBirth( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return AsianpaintsCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.selectedAddons</code> attribute.
	 * @return the selectedAddons
	 */
	public List<String> getSelectedAddons(final SessionContext ctx, final AbstractOrderEntry item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.AbstractOrderEntry.SELECTEDADDONS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.selectedAddons</code> attribute.
	 * @return the selectedAddons
	 */
	public List<String> getSelectedAddons(final AbstractOrderEntry item)
	{
		return getSelectedAddons( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.selectedAddons</code> attribute. 
	 * @param value the selectedAddons
	 */
	public void setSelectedAddons(final SessionContext ctx, final AbstractOrderEntry item, final List<String> value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.AbstractOrderEntry.SELECTEDADDONS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.selectedAddons</code> attribute. 
	 * @param value the selectedAddons
	 */
	public void setSelectedAddons(final AbstractOrderEntry item, final List<String> value)
	{
		setSelectedAddons( getSession().getSessionContext(), item, value );
	}
	
}
