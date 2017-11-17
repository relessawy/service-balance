
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.AmountType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.QuantityType;


/**
 * A type that supports the main body of an Adjustment business object. It supports both a direct credit or debit against an Account as well as a Balance Transfer from another Account.
 * 
 * <p>Java class for AdjustmentPartsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentPartsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Adjusts" type="{http://group.vodafone.com/schema/common/v1}AccountReferenceType"/&gt;
 *         &lt;element name="TransferFrom" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://group.vodafone.com/schema/common/v1}AccountReferenceType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="Quantity" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType"/&gt;
 *                     &lt;element name="Amount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TriggeredBy" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType"&gt;
 *                 &lt;attribute name="businessObjectType" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
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
@XmlType(name = "AdjustmentPartsType", propOrder = {
    "adjusts",
    "transferFrom",
    "triggeredBy"
})
public class AdjustmentPartsType {

    @XmlElement(name = "Adjusts", required = true)
    protected AccountReferenceType adjusts;
    @XmlElement(name = "TransferFrom")
    protected AdjustmentPartsType.TransferFrom transferFrom;
    @XmlElement(name = "TriggeredBy")
    protected AdjustmentPartsType.TriggeredBy triggeredBy;

    /**
     * Gets the value of the adjusts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReferenceType }
     *     
     */
    public AccountReferenceType getAdjusts() {
        return adjusts;
    }

    /**
     * Sets the value of the adjusts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReferenceType }
     *     
     */
    public void setAdjusts(AccountReferenceType value) {
        this.adjusts = value;
    }

    /**
     * Gets the value of the transferFrom property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentPartsType.TransferFrom }
     *     
     */
    public AdjustmentPartsType.TransferFrom getTransferFrom() {
        return transferFrom;
    }

    /**
     * Sets the value of the transferFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentPartsType.TransferFrom }
     *     
     */
    public void setTransferFrom(AdjustmentPartsType.TransferFrom value) {
        this.transferFrom = value;
    }

    /**
     * Gets the value of the triggeredBy property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentPartsType.TriggeredBy }
     *     
     */
    public AdjustmentPartsType.TriggeredBy getTriggeredBy() {
        return triggeredBy;
    }

    /**
     * Sets the value of the triggeredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentPartsType.TriggeredBy }
     *     
     */
    public void setTriggeredBy(AdjustmentPartsType.TriggeredBy value) {
        this.triggeredBy = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}AccountReferenceType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;element name="Quantity" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType"/&gt;
     *           &lt;element name="Amount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "quantity",
        "amount"
    })
    public static class TransferFrom
        extends AccountReferenceType
    {

        @XmlElement(name = "Quantity")
        protected QuantityType quantity;
        @XmlElement(name = "Amount")
        protected AmountType amount;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link QuantityType }
         *     
         */
        public QuantityType getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuantityType }
         *     
         */
        public void setQuantity(QuantityType value) {
            this.quantity = value;
        }

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType"&gt;
     *       &lt;attribute name="businessObjectType" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TriggeredBy
        extends BaseComponentType
    {

        @XmlAttribute(name = "businessObjectType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String businessObjectType;

        /**
         * Gets the value of the businessObjectType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessObjectType() {
            return businessObjectType;
        }

        /**
         * Sets the value of the businessObjectType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessObjectType(String value) {
            this.businessObjectType = value;
        }

    }

}
