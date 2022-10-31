
package com.tsg.netsuite.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-18T14:58:00.457-07:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "unexpectedErrorFault", targetNamespace = "urn:faults_2022_1.platform.webservices.netsuite.com")
public class UnexpectedErrorFault_Exception extends Exception {
    
    private com.tsg.netsuite.client.UnexpectedErrorFault unexpectedErrorFault;

    public UnexpectedErrorFault_Exception() {
        super();
    }
    
    public UnexpectedErrorFault_Exception(String message) {
        super(message);
    }
    
    public UnexpectedErrorFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UnexpectedErrorFault_Exception(String message, com.tsg.netsuite.client.UnexpectedErrorFault unexpectedErrorFault) {
        super(message);
        this.unexpectedErrorFault = unexpectedErrorFault;
    }

    public UnexpectedErrorFault_Exception(String message, com.tsg.netsuite.client.UnexpectedErrorFault unexpectedErrorFault, Throwable cause) {
        super(message, cause);
        this.unexpectedErrorFault = unexpectedErrorFault;
    }

    public com.tsg.netsuite.client.UnexpectedErrorFault getFaultInfo() {
        return this.unexpectedErrorFault;
    }
}