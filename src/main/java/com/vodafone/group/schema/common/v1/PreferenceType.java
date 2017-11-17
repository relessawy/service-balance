
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.IDType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.IndicatorType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.NumericType;


/**
 * <p>Java class for PreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}PreferenceReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Explicit" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="ConfidenceRating" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/&gt;
 *         &lt;element name="ExplicitThreshold" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/&gt;
 *         &lt;element name="PreferenceRoleType" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/&gt;
 *         &lt;element name="InferredScore" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/&gt;
 *         &lt;element name="VolunteeredScore" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/&gt;
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
@XmlType(name = "PreferenceType", propOrder = {
    "explicit",
    "confidenceRating",
    "explicitThreshold",
    "preferenceRoleType",
    "inferredScore",
    "volunteeredScore",
    "validityPeriod"
})
@XmlSeeAlso({
    ContactPersonContactPreferenceType.class
})
public class PreferenceType
    extends PreferenceReferenceType
{

    @XmlElement(name = "Explicit")
    protected IndicatorType explicit;
    @XmlElement(name = "ConfidenceRating")
    protected NumericType confidenceRating;
    @XmlElement(name = "ExplicitThreshold")
    protected NumericType explicitThreshold;
    @XmlElement(name = "PreferenceRoleType")
    protected IDType preferenceRoleType;
    @XmlElement(name = "InferredScore")
    protected NumericType inferredScore;
    @XmlElement(name = "VolunteeredScore")
    protected NumericType volunteeredScore;
    @XmlElement(name = "ValidityPeriod")
    protected ValidityPeriodType validityPeriod;

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
     * Gets the value of the confidenceRating property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getConfidenceRating() {
        return confidenceRating;
    }

    /**
     * Sets the value of the confidenceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setConfidenceRating(NumericType value) {
        this.confidenceRating = value;
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
     * Gets the value of the preferenceRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getPreferenceRoleType() {
        return preferenceRoleType;
    }

    /**
     * Sets the value of the preferenceRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setPreferenceRoleType(IDType value) {
        this.preferenceRoleType = value;
    }

    /**
     * Gets the value of the inferredScore property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getInferredScore() {
        return inferredScore;
    }

    /**
     * Sets the value of the inferredScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setInferredScore(NumericType value) {
        this.inferredScore = value;
    }

    /**
     * Gets the value of the volunteeredScore property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getVolunteeredScore() {
        return volunteeredScore;
    }

    /**
     * Sets the value of the volunteeredScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setVolunteeredScore(NumericType value) {
        this.volunteeredScore = value;
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
