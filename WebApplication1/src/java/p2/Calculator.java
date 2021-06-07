/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;
import p5.Calculator_Service;

/**
 *
 * @author Barath
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WebApplication1/Calculator.wsdl")
    private Calculator_Service service;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int c=a+b;
        return c;
    }

    private int add_1(int a, int b) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        p5.Calculator port = service.getCalculatorPort();
        return port.add(a, b);
    }
}
