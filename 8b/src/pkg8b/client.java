/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8b;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String args[]) throws IOException {
        Scanner scan =new Scanner(System.in);
        Socket client=new Socket("localhost",4453);
        DataOutputStream data=new DataOutputStream(client.getOutputStream());
        DataInputStream indata=new DataInputStream(client.getInputStream());
        String creceived ="",send;
        System.out.println("ENTER TO START MESSAGE");
        send=scan.nextLine();
        data.writeUTF(send);
        data.flush();
        while(!creceived.equalsIgnoreCase("bye")){
            creceived=indata.readUTF();
           System.out.println("Server:\t"+creceived);
            send=scan.nextLine();
            data.writeUTF(send);
            data.flush();

        }
            client.close();
    }}
