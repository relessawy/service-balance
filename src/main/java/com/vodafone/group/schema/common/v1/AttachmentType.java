
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.BinaryObjectType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.MeasureType;


/**
 * <p>Java class for AttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BinaryObject" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}BinaryObjectType" minOccurs="0"/&gt;
 *         &lt;element name="Size" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Reference" type="{http://group.vodafone.com/schema/common/v1}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", propOrder = {
    "binaryObject",
    "size",
    "reference"
})
public class AttachmentType
    extends BaseComponentType
{

    @XmlElement(name = "BinaryObject")
    protected BinaryObjectType binaryObject;
    @XmlElement(name = "Size")
    protected MeasureType size;
    @XmlElement(name = "Reference")
    protected ReferenceType reference;

    /**
     * Gets the value of the binaryObject property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getBinaryObject() {
        return binaryObject;
    }

    /**
     * Sets the value of the binaryObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setBinaryObject(BinaryObjectType value) {
        this.binaryObject = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSize(MeasureType value) {
        this.size = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setReference(ReferenceType value) {
        this.reference = value;
    }

}
