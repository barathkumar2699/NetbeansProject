/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8b;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    public static void main(String args[]) throws IOException {
        Scanner scan=new Scanner(System.in);
        ServerSocket server = new ServerSocket(4453);
        Socket connection = server.accept();
        DataInputStream data = new DataInputStream(connection.getInputStream());
        String received="",send;
        DataOutputStream outdata =new DataOutputStream(connection.getOutputStream());
            while (!received.equalsIgnoreCase("bye")){
                received=data.readUTF();
                System.out.println("Client\t"+received);
                send=scan.nextLine();
                outdata.writeUTF(send);
                outdata.flush();


            }
            server.close();
            connection.close();



    }
}