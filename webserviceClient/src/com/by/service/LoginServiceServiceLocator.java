/**
 * LoginServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.by.service;

public class LoginServiceServiceLocator extends org.apache.axis.client.Service implements com.by.service.LoginServiceService {

    public LoginServiceServiceLocator() {
    }


    public LoginServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoginService
    private java.lang.String LoginService_address = "http://localhost:8080/webservice/services/LoginService";

    public java.lang.String getLoginServiceAddress() {
        return LoginService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoginServiceWSDDServiceName = "LoginService";

    public java.lang.String getLoginServiceWSDDServiceName() {
        return LoginServiceWSDDServiceName;
    }

    public void setLoginServiceWSDDServiceName(java.lang.String name) {
        LoginServiceWSDDServiceName = name;
    }

    public com.by.service.LoginService getLoginService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginService(endpoint);
    }

    public com.by.service.LoginService getLoginService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.by.service.LoginServiceSoapBindingStub _stub = new com.by.service.LoginServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLoginServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginServiceEndpointAddress(java.lang.String address) {
        LoginService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.by.service.LoginService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.by.service.LoginServiceSoapBindingStub _stub = new com.by.service.LoginServiceSoapBindingStub(new java.net.URL(LoginService_address), this);
                _stub.setPortName(getLoginServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LoginService".equals(inputPortName)) {
            return getLoginService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.by.com", "LoginServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.by.com", "LoginService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoginService".equals(portName)) {
            setLoginServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
