
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.AmountType;


/**
 * <p>Java class for OneOffPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OneOffPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}PriceTypeWithID"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Activation" type="{http://group.vodafone.com/schema/common/v1}PriceType" minOccurs="0"/&gt;
 *         &lt;element name="Installation" type="{http://group.vodafone.com/schema/common/v1}PriceType" minOccurs="0"/&gt;
 *         &lt;element name="NetAmount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneOffPriceType", propOrder = {
    "activation",
    "installation",
    "netAmount",
    "taxAmount"
})
@XmlSeeAlso({
    OneOffAmountType.class
})
public class OneOffPriceType
    extends PriceTypeWithID
{

    @XmlElement(name = "Activation")
    protected PriceType activation;
    @XmlElement(name = "Installation")
    protected PriceType installation;
    @XmlElement(name = "NetAmount")
    protected AmountType netAmount;
    @XmlElement(name = "TaxAmount")
    protected AmountType taxAmount;

    /**
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setActivation(PriceType value) {
        this.activation = value;
    }

    /**
     * Gets the value of the installation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getInstallation() {
        return installation;
    }

    /**
     * Sets the value of the installation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setInstallation(PriceType value) {
        this.installation = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetAmount(AmountType value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxAmount(AmountType value) {
        this.taxAmount = value;
    }

}
