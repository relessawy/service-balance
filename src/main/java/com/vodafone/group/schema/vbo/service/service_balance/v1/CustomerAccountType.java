
package com.vodafone.group.schema.vbo.service.service_balance.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.common.v1.BaseComponentType;
import com.vodafone.group.schema.extension.vbo.service.service_balance.v1.ExtendedCustomerAccountType;


/**
 * Indicates the account for which the balance was queried
 * 
 * <p>Java class for CustomerAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/service/service-balance/v1}ExtendedCustomerAccountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountType", propOrder = {
    "extension"
})
public class CustomerAccountType
    extends BaseComponentType
{

    @XmlElement(name = "Extension")
    protected ExtendedCustomerAccountType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCustomerAccountType }
     *     
     */
    public ExtendedCustomerAccountType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCustomerAccountType }
     *     
     */
    public void setExtension(ExtendedCustomerAccountType value) {
        this.extension = value;
    }

}
