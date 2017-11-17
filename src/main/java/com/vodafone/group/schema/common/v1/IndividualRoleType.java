
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.CodeType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.DateType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.IndicatorType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.TextType;


/**
 * <p>Java class for IndividualRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualRoleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}PartyReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IndividualName" type="{http://group.vodafone.com/schema/common/v1}IndividualNameType" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType" minOccurs="0"/&gt;
 *         &lt;element name="BloodType" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DeathDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType" minOccurs="0"/&gt;
 *         &lt;element name="DeathIndicator" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="Ethnicity" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatus" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Nationality" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DesignatedIndicator" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="TPSRegistration" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="FamilyGeneration" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualRoleType", propOrder = {
    "individualName",
    "birthDate",
    "bloodType",
    "deathDate",
    "deathIndicator",
    "ethnicity",
    "gender",
    "language",
    "maritalStatus",
    "nationality",
    "designatedIndicator",
    "tpsRegistration",
    "familyGeneration"
})
public class IndividualRoleType
    extends PartyReferenceType
{

    @XmlElement(name = "IndividualName")
    protected IndividualNameType individualName;
    @XmlElement(name = "BirthDate")
    protected DateType birthDate;
    @XmlElement(name = "BloodType")
    protected TextType bloodType;
    @XmlElement(name = "DeathDate")
    protected DateType deathDate;
    @XmlElement(name = "DeathIndicator")
    protected IndicatorType deathIndicator;
    @XmlElement(name = "Ethnicity")
    protected TextType ethnicity;
    @XmlElement(name = "Gender")
    protected TextType gender;
    @XmlElement(name = "Language")
    protected TextType language;
    @XmlElement(name = "MaritalStatus")
    protected TextType maritalStatus;
    @XmlElement(name = "Nationality")
    protected TextType nationality;
    @XmlElement(name = "DesignatedIndicator")
    protected IndicatorType designatedIndicator;
    @XmlElement(name = "TPSRegistration")
    protected IndicatorType tpsRegistration;
    @XmlElement(name = "FamilyGeneration")
    protected CodeType familyGeneration;

    /**
     * Gets the value of the individualName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameType }
     *     
     */
    public IndividualNameType getIndividualName() {
        return individualName;
    }

    /**
     * Sets the value of the individualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameType }
     *     
     */
    public void setIndividualName(IndividualNameType value) {
        this.individualName = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBirthDate(DateType value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the bloodType property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBloodType() {
        return bloodType;
    }

    /**
     * Sets the value of the bloodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBloodType(TextType value) {
        this.bloodType = value;
    }

    /**
     * Gets the value of the deathDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDeathDate() {
        return deathDate;
    }

    /**
     * Sets the value of the deathDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDeathDate(DateType value) {
        this.deathDate = value;
    }

    /**
     * Gets the value of the deathIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getDeathIndicator() {
        return deathIndicator;
    }

    /**
     * Sets the value of the deathIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setDeathIndicator(IndicatorType value) {
        this.deathIndicator = value;
    }

    /**
     * Gets the value of the ethnicity property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getEthnicity() {
        return ethnicity;
    }

    /**
     * Sets the value of the ethnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setEthnicity(TextType value) {
        this.ethnicity = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setGender(TextType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLanguage(TextType value) {
        this.language = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setMaritalStatus(TextType value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setNationality(TextType value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the designatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getDesignatedIndicator() {
        return designatedIndicator;
    }

    /**
     * Sets the value of the designatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setDesignatedIndicator(IndicatorType value) {
        this.designatedIndicator = value;
    }

    /**
     * Gets the value of the tpsRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getTPSRegistration() {
        return tpsRegistration;
    }

    /**
     * Sets the value of the tpsRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setTPSRegistration(IndicatorType value) {
        this.tpsRegistration = value;
    }

    /**
     * Gets the value of the familyGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFamilyGeneration() {
        return familyGeneration;
    }

    /**
     * Sets the value of the familyGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFamilyGeneration(CodeType value) {
        this.familyGeneration = value;
    }

}
