/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.JApplet;

/**
 *
 * @author Sundar
 */
public class NewJApplet extends JApplet {

      @Override
    public void init()
    {
        
    }
    public void paint(Graphics g)
    {
        try{
            System.out.println(getDocumentBase());
            System.out.println(getCodeBase());
            Image img=getImage(new URL("file:C:\\Users\\Sundar\\Desktop\\Jagadeesan"));
            g.drawImage(img,50,50,this);
            g.drawString("hello", 50, 50);
            
        } catch (Exception ex) {
            
        }
    }// TODO overwrite start(), stop() and destroy() methods
}
