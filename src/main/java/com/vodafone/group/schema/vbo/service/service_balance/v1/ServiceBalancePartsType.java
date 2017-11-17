
package com.vodafone.group.schema.vbo.service.service_balance.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.extension.vbo.service.service_balance.v1.ExtendedServiceBalancePartsType;


/**
 * <p>Java class for ServiceBalancePartsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBalancePartsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerFacingService" type="{http://group.vodafone.com/schema/vbo/service/service-balance/v1}CustomerFacingServiceType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAccount" type="{http://group.vodafone.com/schema/vbo/service/service-balance/v1}CustomerAccountType" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/service/service-balance/v1}ExtendedServiceBalancePartsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBalancePartsType", propOrder = {
    "customerFacingService",
    "customerAccount",
    "extension"
})
public class ServiceBalancePartsType {

    @XmlElement(name = "CustomerFacingService")
    protected CustomerFacingServiceType customerFacingService;
    @XmlElement(name = "CustomerAccount")
    protected CustomerAccountType customerAccount;
    @XmlElement(name = "Extension")
    protected ExtendedServiceBalancePartsType extension;

    /**
     * Gets the value of the customerFacingService property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFacingServiceType }
     *     
     */
    public CustomerFacingServiceType getCustomerFacingService() {
        return customerFacingService;
    }

    /**
     * Sets the value of the customerFacingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFacingServiceType }
     *     
     */
    public void setCustomerFacingService(CustomerFacingServiceType value) {
        this.customerFacingService = value;
    }

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountType }
     *     
     */
    public CustomerAccountType getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountType }
     *     
     */
    public void setCustomerAccount(CustomerAccountType value) {
        this.customerAccount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedServiceBalancePartsType }
     *     
     */
    public ExtendedServiceBalancePartsType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedServiceBalancePartsType }
     *     
     */
    public void setExtension(ExtendedServiceBalancePartsType value) {
        this.extension = value;
    }

}
