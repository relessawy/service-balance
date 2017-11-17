
package com.vodafone.group.schema.vbm.service.service_balance.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.vbo.service.service_balance.v1.ServiceBalanceVBOType;


/**
 * Type definition for the GetServiceBalanceList response payload.
 * 
 * <p>Java class for GetServiceBalanceListVBMResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceBalanceListVBMResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceBalanceVBO" type="{http://group.vodafone.com/schema/vbo/service/service-balance/v1}ServiceBalanceVBOType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceBalanceListVBMResponseType", propOrder = {
    "serviceBalanceVBO"
})
public class GetServiceBalanceListVBMResponseType {

    @XmlElement(name = "ServiceBalanceVBO")
    protected List<ServiceBalanceVBOType> serviceBalanceVBO;

    /**
     * Gets the value of the serviceBalanceVBO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceBalanceVBO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceBalanceVBO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceBalanceVBOType }
     * 
     * 
     */
    public List<ServiceBalanceVBOType> getServiceBalanceVBO() {
        if (serviceBalanceVBO == null) {
            serviceBalanceVBO = new ArrayList<ServiceBalanceVBOType>();
        }
        return this.serviceBalanceVBO;
    }

}
