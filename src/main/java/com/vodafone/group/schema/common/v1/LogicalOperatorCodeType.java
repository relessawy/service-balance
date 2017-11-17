
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogicalOperatorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogicalOperatorCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="AND"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogicalOperatorCodeType")
@XmlEnum
public enum LogicalOperatorCodeType {

    AND,
    OR;

    public String value() {
        return name();
    }

    public static LogicalOperatorCodeType fromValue(String v) {
        return valueOf(v);
    }

}
