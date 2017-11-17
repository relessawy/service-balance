
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="OBJECT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseCodeType")
@XmlEnum
public enum ResponseCodeType {

    ID,
    OBJECT;

    public String value() {
        return name();
    }

    public static ResponseCodeType fromValue(String v) {
        return valueOf(v);
    }

}
