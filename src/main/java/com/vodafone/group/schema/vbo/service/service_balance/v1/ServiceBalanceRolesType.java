
package com.vodafone.group.schema.vbo.service.service_balance.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.extension.vbo.service.service_balance.v1.ExtendedServiceBalanceRolesType;


/**
 * <p>Java class for ServiceBalanceRolesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBalanceRolesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/service/service-balance/v1}ExtendedServiceBalanceRolesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBalanceRolesType", propOrder = {
    "extension"
})
public class ServiceBalanceRolesType {

    @XmlElement(name = "Extension")
    protected ExtendedServiceBalanceRolesType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedServiceBalanceRolesType }
     *     
     */
    public ExtendedServiceBalanceRolesType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedServiceBalanceRolesType }
     *     
     */
    public void setExtension(ExtendedServiceBalanceRolesType value) {
        this.extension = value;
    }

}
