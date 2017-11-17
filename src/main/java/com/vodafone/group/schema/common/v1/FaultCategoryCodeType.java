
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultCategoryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultCategoryCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Technical"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FaultCategoryCodeType")
@XmlEnum
public enum FaultCategoryCodeType {

    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Technical")
    TECHNICAL("Technical");
    private final String value;

    FaultCategoryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultCategoryCodeType fromValue(String v) {
        for (FaultCategoryCodeType c: FaultCategoryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
