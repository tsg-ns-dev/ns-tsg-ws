
package com.tsg.netsuite.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeWorkAssignment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeWorkAssignment"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_job"/&gt;
 *     &lt;enumeration value="_position"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeWorkAssignment", namespace = "urn:types.employees_2022_1.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeWorkAssignment {

    @XmlEnumValue("_job")
    JOB("_job"),
    @XmlEnumValue("_position")
    POSITION("_position");
    private final String value;

    EmployeeWorkAssignment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeWorkAssignment fromValue(String v) {
        for (EmployeeWorkAssignment c: EmployeeWorkAssignment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
