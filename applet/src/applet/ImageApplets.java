/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sundar
 */
public class ImageApplets extends Applet{
    @Override
    public void init()
    {
        
    }
    public void paint(Graphics g)
    {
        try{
            System.out.println(getDocumentBase());
            System.out.println(getCodeBase());
            Image img=getImage(new URL("file;C:\\Users\\Sundar\\Desktop\\Jagadeesan"));
            g.drawImage(img,50,50,this);
            g.drawString("hello", 50, 50);
            
        } catch (Exception ex) {
            
        }
    }
}
