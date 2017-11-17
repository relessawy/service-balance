
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultSeverityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultSeverityCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Critical"/&gt;
 *     &lt;enumeration value="Major"/&gt;
 *     &lt;enumeration value="Minor"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Information"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FaultSeverityCodeType")
@XmlEnum
public enum FaultSeverityCodeType {

    @XmlEnumValue("Critical")
    CRITICAL("Critical"),
    @XmlEnumValue("Major")
    MAJOR("Major"),
    @XmlEnumValue("Minor")
    MINOR("Minor"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Information")
    INFORMATION("Information");
    private final String value;

    FaultSeverityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultSeverityCodeType fromValue(String v) {
        for (FaultSeverityCodeType c: FaultSeverityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
