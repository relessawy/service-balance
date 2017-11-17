
package com.vodafone.group.schema.vbo.service.service_balance.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.common.v1.BaseComponentType;
import com.vodafone.group.schema.extension.vbo.service.service_balance.v1.ExtendedCustomerFacingServiceType;


/**
 * <p>Java class for CustomerFacingServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFacingServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/service/service-balance/v1}ExtendedCustomerFacingServiceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFacingServiceType", propOrder = {
    "extension"
})
public class CustomerFacingServiceType
    extends BaseComponentType
{

    @XmlElement(name = "Extension")
    protected ExtendedCustomerFacingServiceType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCustomerFacingServiceType }
     *     
     */
    public ExtendedCustomerFacingServiceType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCustomerFacingServiceType }
     *     
     */
    public void setExtension(ExtendedCustomerFacingServiceType value) {
        this.extension = value;
    }

}
