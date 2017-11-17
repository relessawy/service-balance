
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.NumericType;


/**
 * Type definition of Customer Language Preference
 * 				Reference
 * 
 * <p>Java class for InterestPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestPreferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Confidence" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/&gt;
 *         &lt;element name="InferredScore" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/&gt;
 *         &lt;element name="VolunteeredScore" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://group.vodafone.com/schema/common/v1}UserType" minOccurs="0"/&gt;
 *         &lt;element name="SubscribedService" type="{http://group.vodafone.com/schema/common/v1}SubscribedServiceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestPreferenceType", propOrder = {
    "confidence",
    "inferredScore",
    "volunteeredScore",
    "user",
    "subscribedService"
})
public class InterestPreferenceType
    extends BaseComponentType
{

    @XmlElement(name = "Confidence")
    protected NumericType confidence;
    @XmlElement(name = "InferredScore")
    protected NumericType inferredScore;
    @XmlElement(name = "VolunteeredScore")
    protected NumericType volunteeredScore;
    @XmlElement(name = "User")
    protected UserType user;
    @XmlElement(name = "SubscribedService")
    protected SubscribedServiceType subscribedService;

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setConfidence(NumericType value) {
        this.confidence = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the subscribedService property.
     * 
     * @return
     *     possible object is
     *     {@link SubscribedServiceType }
     *     
     */
    public SubscribedServiceType getSubscribedService() {
        return subscribedService;
    }

    /**
     * Sets the value of the subscribedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscribedServiceType }
     *     
     */
    public void setSubscribedService(SubscribedServiceType value) {
        this.subscribedService = value;
    }

}
