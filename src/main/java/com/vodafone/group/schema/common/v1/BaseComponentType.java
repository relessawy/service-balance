
package com.vodafone.group.schema.common.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.vbo.service.service_balance.v1.CustomerAccountType;
import com.vodafone.group.schema.vbo.service.service_balance.v1.CustomerFacingServiceType;
import com.vodafone.group.schema.vbo.service.service_balance.v1.RelatedServiceBalanceType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.CodeType;


/**
 * Base type for all business objects and some components.
 * 
 * <p>Java class for BaseComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseComponentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}InfoComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Categories" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Category" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;urn:un:unece:uncefact:documentation:standard:CoreComponentType:2&gt;CodeType"&gt;
 *                           &lt;attribute name="listHierarchyID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseComponentType", propOrder = {
    "type",
    "categories",
    "status"
})
@XmlSeeAlso({
    ActorReferenceType.class,
    SpecificationType.class,
    SalesOpportunityReferenceType.class,
    SalesAccountReferenceType.class,
    SalesPartnerAccountReferenceType.class,
    MarketingCampaignReferenceType.class,
    MarketSegmentReferenceType.class,
    SalesLeadReferenceType.class,
    SalesOrderReferenceType.class,
    DocumentsReferenceType.class,
    EventType.class,
    ContactPersonType.class,
    ProductOfferingReferenceType.class,
    SolutionOfferingReferenceType.class,
    ConditionReferenceType.class,
    ProductCatalogueReferenceType.class,
    ApprovalReferenceType.class,
    ChannelPreferenceType.class,
    ChannelReferenceType.class,
    PermissionType.class,
    PreferenceReferenceType.class,
    PreferencesType.class,
    ContactPreferenceType.class,
    ContentReferenceType.class,
    ContactPointReferenceType.class,
    ContactReferenceType.class,
    MarketingPreferenceType.class,
    InterestPreferenceType.class,
    LanguagePreferenceType.class,
    UserType.class,
    SubscribedServiceType.class,
    ConsentPermissionType.class,
    CustomerAccountReferenceType.class,
    CustomerAgreementReferenceType.class,
    ArtefactReferenceType.class,
    AttachmentType.class,
    NoteType.class,
    CredentialsGroupType.class,
    PartyReferenceType.class,
    com.vodafone.group.schema.common.v1.AdjustmentPartsType.TriggeredBy.class,
    AccountReferenceType.class,
    ScheduleType.class,
    RelatedPartyType.class,
    RelatedPartyWithContactPersonType.class,
    ExtendedBaseComponentType.class,
    RelatedServiceBalanceType.class,
    CustomerFacingServiceType.class,
    CustomerAccountType.class
})
public class BaseComponentType
    extends InfoComponentType
{

    @XmlElement(name = "Type")
    protected CodeType type;
    @XmlElement(name = "Categories")
    protected BaseComponentType.Categories categories;
    @XmlElement(name = "Status")
    protected CodeType status;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setType(CodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link BaseComponentType.Categories }
     *     
     */
    public BaseComponentType.Categories getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseComponentType.Categories }
     *     
     */
    public void setCategories(BaseComponentType.Categories value) {
        this.categories = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatus(CodeType value) {
        this.status = value;
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
     *         &lt;element name="Category" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;urn:un:unece:uncefact:documentation:standard:CoreComponentType:2&gt;CodeType"&gt;
     *                 &lt;attribute name="listHierarchyID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "category"
    })
    public static class Categories {

        @XmlElement(name = "Category", required = true)
        protected List<BaseComponentType.Categories.Category> category;

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaseComponentType.Categories.Category }
         * 
         * 
         */
        public List<BaseComponentType.Categories.Category> getCategory() {
            if (category == null) {
                category = new ArrayList<BaseComponentType.Categories.Category>();
            }
            return this.category;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;urn:un:unece:uncefact:documentation:standard:CoreComponentType:2&gt;CodeType"&gt;
         *       &lt;attribute name="listHierarchyID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Category
            extends CodeType
        {

            @XmlAttribute(name = "listHierarchyID")
            protected String listHierarchyID;

            /**
             * Gets the value of the listHierarchyID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getListHierarchyID() {
                return listHierarchyID;
            }

            /**
             * Sets the value of the listHierarchyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setListHierarchyID(String value) {
                this.listHierarchyID = value;
            }

        }

    }

}
