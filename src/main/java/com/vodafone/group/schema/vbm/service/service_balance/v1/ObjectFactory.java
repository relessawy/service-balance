
package com.vodafone.group.schema.vbm.service.service_balance.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vodafone.group.schema.vbm.service.service_balance.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetServiceBalanceListVBMRequest_QNAME = new QName("http://group.vodafone.com/schema/vbm/service/service-balance/v1", "GetServiceBalanceListVBMRequest");
    private final static QName _GetServiceBalanceListVBMResponse_QNAME = new QName("http://group.vodafone.com/schema/vbm/service/service-balance/v1", "GetServiceBalanceListVBMResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vodafone.group.schema.vbm.service.service_balance.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServiceBalanceListVBMRequestType }
     * 
     */
    public GetServiceBalanceListVBMRequestType createGetServiceBalanceListVBMRequestType() {
        return new GetServiceBalanceListVBMRequestType();
    }

    /**
     * Create an instance of {@link GetServiceBalanceListVBMResponseType }
     * 
     */
    public GetServiceBalanceListVBMResponseType createGetServiceBalanceListVBMResponseType() {
        return new GetServiceBalanceListVBMResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceBalanceListVBMRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/service/service-balance/v1", name = "GetServiceBalanceListVBMRequest")
    public JAXBElement<GetServiceBalanceListVBMRequestType> createGetServiceBalanceListVBMRequest(GetServiceBalanceListVBMRequestType value) {
        return new JAXBElement<GetServiceBalanceListVBMRequestType>(_GetServiceBalanceListVBMRequest_QNAME, GetServiceBalanceListVBMRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceBalanceListVBMResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/service/service-balance/v1", name = "GetServiceBalanceListVBMResponse")
    public JAXBElement<GetServiceBalanceListVBMResponseType> createGetServiceBalanceListVBMResponse(GetServiceBalanceListVBMResponseType value) {
        return new JAXBElement<GetServiceBalanceListVBMResponseType>(_GetServiceBalanceListVBMResponse_QNAME, GetServiceBalanceListVBMResponseType.class, null, value);
    }

}
