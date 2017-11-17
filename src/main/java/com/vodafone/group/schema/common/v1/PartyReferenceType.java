
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Party reference object used to refer a party.
 * 
 * <p>Java class for PartyReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyReferenceType")
@XmlSeeAlso({
    IndividualRoleType.class,
    OrganisationRoleType.class,
    OrganisationPartyType.class,
    MemberRoleType.class,
    IndividualOrOrganisationPartyRoleReferenceType.class,
    IndividualAndOrganisationPartyRoleReferenceType.class
})
public class PartyReferenceType
    extends BaseComponentType
{


}
