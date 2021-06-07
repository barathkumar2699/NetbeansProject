/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.rmi.Naming;

/**
 *
 * @author Barath
 */
public class Client {
    public static void main(String args[])
    {
        try{
            HelloInterface hello=(HelloInterface)Naming.lookup("Robj");
            System.out.println(hello.say());
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
    
}
