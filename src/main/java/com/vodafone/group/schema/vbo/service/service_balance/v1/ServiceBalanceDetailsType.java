
package com.vodafone.group.schema.vbo.service.service_balance.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.extension.vbo.service.service_balance.v1.ExtendedServiceBalanceDetailsType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.AmountType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.CodeType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.DateTimeType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.QuantityType;


/**
 * A type definition for ServiceBalance Details
 * 
 * <p>Java class for ServiceBalanceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBalanceDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Amount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/&gt;
 *           &lt;element name="Allowance" maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Type" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/&gt;
 *                     &lt;element name="Category" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;urn:un:unece:uncefact:documentation:standard:CoreComponentType:2&gt;CodeType"&gt;
 *                             &lt;attribute name="listHierarchyID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="AvailableAllowance" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/&gt;
 *                     &lt;element name="UsedAllowance" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="BalanceAmount" type="{http://group.vodafone.com/schema/vbo/service/service-balance/v1}BalanceAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LastPaymentDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="ResetDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/service/service-balance/v1}ExtendedServiceBalanceDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBalanceDetailsType", propOrder = {
    "amount",
    "allowance",
    "balanceAmount",
    "lastPaymentDate",
    "resetDate",
    "extension"
})
public class ServiceBalanceDetailsType {

    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "Allowance")
    protected List<ServiceBalanceDetailsType.Allowance> allowance;
    @XmlElement(name = "BalanceAmount")
    protected List<BalanceAmountType> balanceAmount;
    @XmlElement(name = "LastPaymentDate")
    protected DateTimeType lastPaymentDate;
    @XmlElement(name = "ResetDate")
    protected DateTimeType resetDate;
    @XmlElement(name = "Extension")
    protected ExtendedServiceBalanceDetailsType extension;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the allowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceBalanceDetailsType.Allowance }
     * 
     * 
     */
    public List<ServiceBalanceDetailsType.Allowance> getAllowance() {
        if (allowance == null) {
            allowance = new ArrayList<ServiceBalanceDetailsType.Allowance>();
        }
        return this.allowance;
    }

    /**
     * Gets the value of the balanceAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceAmountType }
     * 
     * 
     */
    public List<BalanceAmountType> getBalanceAmount() {
        if (balanceAmount == null) {
            balanceAmount = new ArrayList<BalanceAmountType>();
        }
        return this.balanceAmount;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setLastPaymentDate(DateTimeType value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the resetDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getResetDate() {
        return resetDate;
    }

    /**
     * Sets the value of the resetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setResetDate(DateTimeType value) {
        this.resetDate = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedServiceBalanceDetailsType }
     *     
     */
    public ExtendedServiceBalanceDetailsType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedServiceBalanceDetailsType }
     *     
     */
    public void setExtension(ExtendedServiceBalanceDetailsType value) {
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
     *         &lt;element name="Type" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/&gt;
     *         &lt;element name="Category" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;urn:un:unece:uncefact:documentation:standard:CoreComponentType:2&gt;CodeType"&gt;
     *                 &lt;attribute name="listHierarchyID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AvailableAllowance" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/&gt;
     *         &lt;element name="UsedAllowance" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/&gt;
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
        "type",
        "category",
        "availableAllowance",
        "usedAllowance"
    })
    public static class Allowance {

        @XmlElement(name = "Type")
        protected CodeType type;
        @XmlElement(name = "Category")
        protected ServiceBalanceDetailsType.Allowance.Category category;
        @XmlElement(name = "AvailableAllowance")
        protected QuantityType availableAllowance;
        @XmlElement(name = "UsedAllowance")
        protected QuantityType usedAllowance;

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
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceBalanceDetailsType.Allowance.Category }
         *     
         */
        public ServiceBalanceDetailsType.Allowance.Category getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceBalanceDetailsType.Allowance.Category }
         *     
         */
        public void setCategory(ServiceBalanceDetailsType.Allowance.Category value) {
            this.category = value;
        }

        /**
         * Gets the value of the availableAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link QuantityType }
         *     
         */
        public QuantityType getAvailableAllowance() {
            return availableAllowance;
        }

        /**
         * Sets the value of the availableAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuantityType }
         *     
         */
        public void setAvailableAllowance(QuantityType value) {
            this.availableAllowance = value;
        }

        /**
         * Gets the value of the usedAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link QuantityType }
         *     
         */
        public QuantityType getUsedAllowance() {
            return usedAllowance;
        }

        /**
         * Sets the value of the usedAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuantityType }
         *     
         */
        public void setUsedAllowance(QuantityType value) {
            this.usedAllowance = value;
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
