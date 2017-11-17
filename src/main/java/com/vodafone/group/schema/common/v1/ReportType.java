
package com.vodafone.group.schema.common.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide a report on the statictics (aggregate functions) for a specific data set within the bounds of a business object.
 * 
 * <p>Java class for ReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}ExtendedBaseComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ReportItem" type="{http://group.vodafone.com/schema/common/v1}ReportItemType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ReportType", propOrder = {
    "reportItems"
})
public class ReportType
    extends ExtendedBaseComponentType
{

    @XmlElement(name = "ReportItems")
    protected ReportType.ReportItems reportItems;

    /**
     * Gets the value of the reportItems property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType.ReportItems }
     *     
     */
    public ReportType.ReportItems getReportItems() {
        return reportItems;
    }

    /**
     * Sets the value of the reportItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType.ReportItems }
     *     
     */
    public void setReportItems(ReportType.ReportItems value) {
        this.reportItems = value;
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
     *         &lt;element name="ReportItem" type="{http://group.vodafone.com/schema/common/v1}ReportItemType" maxOccurs="unbounded"/&gt;
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
        "reportItem"
    })
    public static class ReportItems {

        @XmlElement(name = "ReportItem", required = true)
        protected List<ReportItemType> reportItem;

        /**
         * Gets the value of the reportItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportItemType }
         * 
         * 
         */
        public List<ReportItemType> getReportItem() {
            if (reportItem == null) {
                reportItem = new ArrayList<ReportItemType>();
            }
            return this.reportItem;
        }

    }

}
