/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Barath
 */
@WebService(serviceName = "Calc")
public class Calc {

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
    @WebMethod(operationName = "Add")
    public int Add(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int c=a+b;
        return c;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CtoF")
    public float CtoF(@WebParam(name = "celcius") float celcius) {
        //TODO write your implementation code here:
        float f=(float) ((1.8*celcius)+32);
        return f;
    }
}
