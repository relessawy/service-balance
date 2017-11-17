
package com.vodafone.group.schema.vbo.service.service_balance.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.common.v1.ExtendedBaseComponentType;
import com.vodafone.group.schema.common.v1.RelatedPartyType;
import com.vodafone.group.schema.extension.vbo.service.service_balance.v1.ExtendedRelatedPartyType;
import com.vodafone.group.schema.extension.vbo.service.service_balance.v1.ExtendedServiceBalanceVBOType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.IDType;


/**
 * The Service Balance service is an Entity service providing a capability to retrieve a balance information from the downstream systems. This balance information represent the available amount of a service owned by a certain customer.
 * 
 * <p>Java class for ServiceBalanceVBOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBalanceVBOType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}ExtendedBaseComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceIdentifier" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/&gt;
 *         &lt;element name="Details" type="{http://group.vodafone.com/schema/vbo/service/service-balance/v1}ServiceBalanceDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="RelatedServiceBalances" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RelatedServiceBalance" type="{http://group.vodafone.com/schema/vbo/service/service-balance/v1}RelatedServiceBalanceType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Roles" type="{http://group.vodafone.com/schema/vbo/service/service-balance/v1}ServiceBalanceRolesType" minOccurs="0"/&gt;
 *         &lt;element name="Parts" type="{http://group.vodafone.com/schema/vbo/service/service-balance/v1}ServiceBalancePartsType" minOccurs="0"/&gt;
 *         &lt;element name="RelatedParties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RelatedParty" type="{http://group.vodafone.com/schema/common/v1}RelatedPartyType" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/service/service-balance/v1}ExtendedRelatedPartyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/service/service-balance/v1}ExtendedServiceBalanceVBOType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBalanceVBOType", propOrder = {
    "serviceIdentifier",
    "details",
    "relatedServiceBalances",
    "roles",
    "parts",
    "relatedParties",
    "extension"
})
public class ServiceBalanceVBOType
    extends ExtendedBaseComponentType
{

    @XmlElement(name = "ServiceIdentifier")
    protected IDType serviceIdentifier;
    @XmlElement(name = "Details")
    protected ServiceBalanceDetailsType details;
    @XmlElement(name = "RelatedServiceBalances")
    protected ServiceBalanceVBOType.RelatedServiceBalances relatedServiceBalances;
    @XmlElement(name = "Roles")
    protected ServiceBalanceRolesType roles;
    @XmlElement(name = "Parts")
    protected ServiceBalancePartsType parts;
    @XmlElement(name = "RelatedParties")
    protected ServiceBalanceVBOType.RelatedParties relatedParties;
    @XmlElement(name = "Extension")
    protected ExtendedServiceBalanceVBOType extension;

    /**
     * Gets the value of the serviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the value of the serviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setServiceIdentifier(IDType value) {
        this.serviceIdentifier = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBalanceDetailsType }
     *     
     */
    public ServiceBalanceDetailsType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBalanceDetailsType }
     *     
     */
    public void setDetails(ServiceBalanceDetailsType value) {
        this.details = value;
    }

    /**
     * Gets the value of the relatedServiceBalances property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBalanceVBOType.RelatedServiceBalances }
     *     
     */
    public ServiceBalanceVBOType.RelatedServiceBalances getRelatedServiceBalances() {
        return relatedServiceBalances;
    }

    /**
     * Sets the value of the relatedServiceBalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBalanceVBOType.RelatedServiceBalances }
     *     
     */
    public void setRelatedServiceBalances(ServiceBalanceVBOType.RelatedServiceBalances value) {
        this.relatedServiceBalances = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBalanceRolesType }
     *     
     */
    public ServiceBalanceRolesType getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBalanceRolesType }
     *     
     */
    public void setRoles(ServiceBalanceRolesType value) {
        this.roles = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBalancePartsType }
     *     
     */
    public ServiceBalancePartsType getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBalancePartsType }
     *     
     */
    public void setParts(ServiceBalancePartsType value) {
        this.parts = value;
    }

    /**
     * Gets the value of the relatedParties property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBalanceVBOType.RelatedParties }
     *     
     */
    public ServiceBalanceVBOType.RelatedParties getRelatedParties() {
        return relatedParties;
    }

    /**
     * Sets the value of the relatedParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBalanceVBOType.RelatedParties }
     *     
     */
    public void setRelatedParties(ServiceBalanceVBOType.RelatedParties value) {
        this.relatedParties = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedServiceBalanceVBOType }
     *     
     */
    public ExtendedServiceBalanceVBOType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedServiceBalanceVBOType }
     *     
     */
    public void setExtension(ExtendedServiceBalanceVBOType value) {
        this.extension = value;
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
     *         &lt;element name="RelatedParty" type="{http://group.vodafone.com/schema/common/v1}RelatedPartyType" maxOccurs="unbounded"/&gt;
     *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/service/service-balance/v1}ExtendedRelatedPartyType" minOccurs="0"/&gt;
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
        "relatedParty",
        "extension"
    })
    public static class RelatedParties {

        @XmlElement(name = "RelatedParty", required = true)
        protected List<RelatedPartyType> relatedParty;
        @XmlElement(name = "Extension")
        protected ExtendedRelatedPartyType extension;

        /**
         * Gets the value of the relatedParty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedParty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelatedPartyType }
         * 
         * 
         */
        public List<RelatedPartyType> getRelatedParty() {
            if (relatedParty == null) {
                relatedParty = new ArrayList<RelatedPartyType>();
            }
            return this.relatedParty;
        }

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link ExtendedRelatedPartyType }
         *     
         */
        public ExtendedRelatedPartyType getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExtendedRelatedPartyType }
         *     
         */
        public void setExtension(ExtendedRelatedPartyType value) {
            this.extension = value;
        }

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
     *         &lt;element name="RelatedServiceBalance" type="{http://group.vodafone.com/schema/vbo/service/service-balance/v1}RelatedServiceBalanceType" maxOccurs="unbounded"/&gt;
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
        "relatedServiceBalance"
    })
    public static class RelatedServiceBalances {

        @XmlElement(name = "RelatedServiceBalance", required = true)
        protected List<RelatedServiceBalanceType> relatedServiceBalance;

        /**
         * Gets the value of the relatedServiceBalance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedServiceBalance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedServiceBalance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelatedServiceBalanceType }
         * 
         * 
         */
        public List<RelatedServiceBalanceType> getRelatedServiceBalance() {
            if (relatedServiceBalance == null) {
                relatedServiceBalance = new ArrayList<RelatedServiceBalanceType>();
            }
            return this.relatedServiceBalance;
        }

    }

}
