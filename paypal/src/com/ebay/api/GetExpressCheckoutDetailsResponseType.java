
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetExpressCheckoutDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetExpressCheckoutDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}GetExpressCheckoutDetailsResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetExpressCheckoutDetailsResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "getExpressCheckoutDetailsResponseDetails"
})
public class GetExpressCheckoutDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "GetExpressCheckoutDetailsResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected GetExpressCheckoutDetailsResponseDetailsType getExpressCheckoutDetailsResponseDetails;

    /**
     * Gets the value of the getExpressCheckoutDetailsResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GetExpressCheckoutDetailsResponseDetailsType }
     *     
     */
    public GetExpressCheckoutDetailsResponseDetailsType getGetExpressCheckoutDetailsResponseDetails() {
        return getExpressCheckoutDetailsResponseDetails;
    }

    /**
     * Sets the value of the getExpressCheckoutDetailsResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetExpressCheckoutDetailsResponseDetailsType }
     *     
     */
    public void setGetExpressCheckoutDetailsResponseDetails(GetExpressCheckoutDetailsResponseDetailsType value) {
        this.getExpressCheckoutDetailsResponseDetails = value;
    }

}
