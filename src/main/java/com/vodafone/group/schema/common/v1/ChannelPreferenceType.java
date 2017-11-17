
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.IndicatorType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.NumericType;


/**
 * <p>Java class for ChannelPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelPreferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Consent" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="Channel" type="{http://group.vodafone.com/schema/common/v1}ChannelReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="Explicit" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="ExplicitThreshold" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://group.vodafone.com/schema/common/v1}ValidityPeriodType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelPreferenceType", propOrder = {
    "consent",
    "channel",
    "explicit",
    "explicitThreshold",
    "validityPeriod"
})
public class ChannelPreferenceType
    extends BaseComponentType
{

    @XmlElement(name = "Consent")
    protected IndicatorType consent;
    @XmlElement(name = "Channel")
    protected ChannelReferenceType channel;
    @XmlElement(name = "Explicit")
    protected IndicatorType explicit;
    @XmlElement(name = "ExplicitThreshold")
    protected NumericType explicitThreshold;
    @XmlElement(name = "ValidityPeriod")
    protected ValidityPeriodType validityPeriod;

    /**
     * Gets the value of the consent property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getConsent() {
        return consent;
    }

    /**
     * Sets the value of the consent property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setConsent(IndicatorType value) {
        this.consent = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelReferenceType }
     *     
     */
    public ChannelReferenceType getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelReferenceType }
     *     
     */
    public void setChannel(ChannelReferenceType value) {
        this.channel = value;
    }

    /**
     * Gets the value of the explicit property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getExplicit() {
        return explicit;
    }

    /**
     * Sets the value of the explicit property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setExplicit(IndicatorType value) {
        this.explicit = value;
    }

    /**
     * Gets the value of the explicitThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getExplicitThreshold() {
        return explicitThreshold;
    }

    /**
     * Sets the value of the explicitThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setExplicitThreshold(NumericType value) {
        this.explicitThreshold = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityPeriodType }
     *     
     */
    public ValidityPeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityPeriodType }
     *     
     */
    public void setValidityPeriod(ValidityPeriodType value) {
        this.validityPeriod = value;
    }

}
