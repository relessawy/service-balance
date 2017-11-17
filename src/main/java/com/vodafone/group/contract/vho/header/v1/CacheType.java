
package com.vodafone.group.contract.vho.header.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Mandatory cache parameter support by all services
 * 				(a service must understand the directive even if no caching support
 * 				in the service – this allows for future extensibility of the service
 * 				implementation)
 * 			
 * 
 * <p>Java class for CacheType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CacheType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UseCache" type="{http://group.vodafone.com/contract/vho/header/v1}CacheOptions"/&gt;
 *         &lt;element name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CacheType", propOrder = {
    "useCache",
    "maxAge",
    "lastModified"
})
public class CacheType {

    @XmlElement(name = "UseCache", required = true)
    @XmlSchemaType(name = "token")
    protected CacheOptions useCache;
    @XmlElement(name = "MaxAge")
    protected BigInteger maxAge;
    @XmlElement(name = "LastModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;

    /**
     * Gets the value of the useCache property.
     * 
     * @return
     *     possible object is
     *     {@link CacheOptions }
     *     
     */
    public CacheOptions getUseCache() {
        return useCache;
    }

    /**
     * Sets the value of the useCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link CacheOptions }
     *     
     */
    public void setUseCache(CacheOptions value) {
        this.useCache = value;
    }

    /**
     * Gets the value of the maxAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAge() {
        return maxAge;
    }

    /**
     * Sets the value of the maxAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAge(BigInteger value) {
        this.maxAge = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

}
