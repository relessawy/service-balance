
package com.vodafone.group.schema.vbo.service.service_balance.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.AmountType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.CodeType;


/**
 * Indicates the account for which the balance was queried
 * 
 * <p>Java class for BalanceAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceAmountType"&gt;
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
 *         &lt;element name="Amount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceAmountType", propOrder = {
    "type",
    "category",
    "amount"
})
public class BalanceAmountType {

    @XmlElement(name = "Type")
    protected CodeType type;
    @XmlElement(name = "Category")
    protected BalanceAmountType.Category category;
    @XmlElement(name = "Amount")
    protected AmountType amount;

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
     *     {@link BalanceAmountType.Category }
     *     
     */
    public BalanceAmountType.Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmountType.Category }
     *     
     */
    public void setCategory(BalanceAmountType.Category value) {
        this.category = value;
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
