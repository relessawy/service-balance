
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.CodeType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.QuantityType;


/**
 * <p>Java class for PriceFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceFrequencyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntervalQuantity" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="IntervalsQuantity" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="IntervalUnitCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceFrequencyType", propOrder = {
    "intervalQuantity",
    "intervalsQuantity",
    "intervalUnitCode"
})
public class PriceFrequencyType {

    @XmlElement(name = "IntervalQuantity")
    protected QuantityType intervalQuantity;
    @XmlElement(name = "IntervalsQuantity")
    protected QuantityType intervalsQuantity;
    @XmlElement(name = "IntervalUnitCode")
    protected CodeType intervalUnitCode;

    /**
     * Gets the value of the intervalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getIntervalQuantity() {
        return intervalQuantity;
    }

    /**
     * Sets the value of the intervalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setIntervalQuantity(QuantityType value) {
        this.intervalQuantity = value;
    }

    /**
     * Gets the value of the intervalsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getIntervalsQuantity() {
        return intervalsQuantity;
    }

    /**
     * Sets the value of the intervalsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setIntervalsQuantity(QuantityType value) {
        this.intervalsQuantity = value;
    }

    /**
     * Gets the value of the intervalUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getIntervalUnitCode() {
        return intervalUnitCode;
    }

    /**
     * Sets the value of the intervalUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setIntervalUnitCode(CodeType value) {
        this.intervalUnitCode = value;
    }

}
