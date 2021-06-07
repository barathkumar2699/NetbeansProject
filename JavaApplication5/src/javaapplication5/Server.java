/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author Barath
 */
public class Server {
    public static void main(String args[]) 
    {
        try{
            Naming.rebind("Robj", new Hello("hello world"));
            System.out.println("Server ready");
        }
        catch(RemoteException|MalformedURLException e)
        {
            System.err.println(e);
        }
    }
    
}
