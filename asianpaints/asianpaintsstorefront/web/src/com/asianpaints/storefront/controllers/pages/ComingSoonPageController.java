package com.asianpaints.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asianpaints.core.comingsoon.facade.AsianpaintsProductFacade;
import com.asianpaints.facades.product.data.ComingSoonCustomerData;
import com.asianpaints.storefront.forms.SaveCustomerDataForm;


@Controller
public class ComingSoonPageController extends AbstractPageController
{
	/*
	 * comingSoon in below should be same as u provided in cms-content.impex (coredata) in #Functional Content Pages
	 */
	protected static final String COMINGSOON_CMS_PAGE = "comingSoon";

	@Resource(name = "defaultAsianpaintsProductFacade")
	private AsianpaintsProductFacade asianpaintsProductFacade;

	@Resource(name = "accountBreadcrumbBuilder")
	private ResourceBreadcrumbBuilder accountBreadcrumbBuilder;


	@RequestMapping(value = "/comingSoonProducts", method = RequestMethod.GET)
	public String comingSoonProducts(final Model model) throws CMSItemNotFoundException
	{
		{
			//final List<ProductData> productData = asianpaintsProductFacade.getComingSoonProducts();

			final List<ProductModel> productData = asianpaintsProductFacade.getComingSoonProducts();
			/* storeCmsPageInModel(model, getContentPageForLabelOrId(COMINGSOON_CMS_PAGE)); */
			/* setUpMetaDataForContentPage(model, getContentPageForLabelOrId(COMINGSOON_CMS_PAGE)); */
			try
			{
				storeCmsPageInModel(model, getContentPageForLabelOrId(COMINGSOON_CMS_PAGE));
			}
			catch (final CMSItemNotFoundException e)
			{
				// YTODO Auto-generated catch block
				e.printStackTrace();
			}
			try
			{
				setUpMetaDataForContentPage(model, getContentPageForLabelOrId(COMINGSOON_CMS_PAGE));
			}
			catch (final CMSItemNotFoundException e)
			{
				// YTODO Auto-generated catch block
				e.printStackTrace();
			}

			model.addAttribute("breadcrumbs", accountBreadcrumbBuilder.getBreadcrumbs("text.comingsoon.products"));
			model.addAttribute("metaRobots", "no-index,no-follow");
			model.addAttribute("comingSoonProductData", productData);
			//return "comingSoonProductLayoutPage";
			return getViewForPage(model);

		}
	}

	/**
	 *
	 * @param form
	 *           >> contains all attributes
	 * @param model
	 * @return
	 * @throws CMSItemNotFoundException
	 */

	@RequestMapping(value = "/saveNotifyMeProducts", method = RequestMethod.POST)
	@ResponseBody
	public String saveCustomerData(final SaveCustomerDataForm form, final Model model) throws CMSItemNotFoundException
	{
		final ComingSoonCustomerData data = new ComingSoonCustomerData();
		data.setFirstName(form.getFirstName());
		data.setLastName(form.getLastName());
		data.setEmailId(form.getEmailId());
		data.setProductName(form.getProductName());
		data.setProductCode(form.getProductCode());


		//asianpaintsProductFacade.saveNotifyMeProducts(data);

		storeCmsPageInModel(model, getContentPageForLabelOrId(COMINGSOON_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(COMINGSOON_CMS_PAGE));
		/*
		 * In result m storing a string success which gets called in ajax in ComingSoonPageLayout.jsp
		 */
		String result = null;

		try
		{
			if (form.getFirstName().isEmpty() || form.getLastName().isEmpty() || form.getEmailId().isEmpty())
			{
				model.addAttribute("notifyStatus", "failed");
				//return "FAILED";
				result = "Please provide all the details";
			}
			else
			{
				asianpaintsProductFacade.saveNotifyMeProducts(data);
				//GlobalMessages.addConfMessage(model, "comingsoon.success.entry");
				//return "SUCCESS";
				result = "Data saved successfully";
			}
		}

		catch (final ModelSavingException e)
		{
			GlobalMessages.addErrorMessage(model, "comingsoon.error.duplicate.entry");
			result = "Duplicate entry not allowed ";
		}

		model.addAttribute("breadcrumbs", accountBreadcrumbBuilder.getBreadcrumbs("text.notifyme.products"));
		model.addAttribute("metaRobots", "no-index,no-follow");

		//return comingSoonProducts(model);
		return result;
	}
}
