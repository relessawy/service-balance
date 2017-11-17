
package com.vodafone.group.schema.common.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.TextType;


/**
 * <p>Java class for RelatedPartyWithContactPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedPartyWithContactPersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Role" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/&gt;
 *         &lt;element name="ContactPersons" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ContactPerson" type="{http://group.vodafone.com/schema/common/v1}ContactPersonType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedPartyWithContactPersonType", propOrder = {
    "role",
    "contactPersons"
})
public class RelatedPartyWithContactPersonType
    extends BaseComponentType
{

    @XmlElement(name = "Role", required = true)
    protected TextType role;
    @XmlElement(name = "ContactPersons")
    protected RelatedPartyWithContactPersonType.ContactPersons contactPersons;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setRole(TextType value) {
        this.role = value;
    }

    /**
     * Gets the value of the contactPersons property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPartyWithContactPersonType.ContactPersons }
     *     
     */
    public RelatedPartyWithContactPersonType.ContactPersons getContactPersons() {
        return contactPersons;
    }

    /**
     * Sets the value of the contactPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPartyWithContactPersonType.ContactPersons }
     *     
     */
    public void setContactPersons(RelatedPartyWithContactPersonType.ContactPersons value) {
        this.contactPersons = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ContactPerson" type="{http://group.vodafone.com/schema/common/v1}ContactPersonType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contactPerson"
    })
    public static class ContactPersons {

        @XmlElement(name = "ContactPerson", required = true)
        protected List<ContactPersonType> contactPerson;

        /**
         * Gets the value of the contactPerson property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactPerson().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactPersonType }
         * 
         * 
         */
        public List<ContactPersonType> getContactPerson() {
            if (contactPerson == null) {
                contactPerson = new ArrayList<ContactPersonType>();
            }
            return this.contactPerson;
        }

    }

}
