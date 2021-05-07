package com.jocata.ZC;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
public class App 
{

        public static void main(String args[]) throws Exception 
        {
           BufferedImage bImage = ImageIO.read(new File("F:\\locky.jpg"));
           ByteArrayOutputStream bos = new ByteArrayOutputStream();
           ImageIO.write(bImage, "jpg", bos );
           byte [] data = bos.toByteArray();
           ByteArrayInputStream bis = new ByteArrayInputStream(data);
           BufferedImage bImage2 = ImageIO.read(bis);
           ImageIO.write(bImage2, "jpg", new File("F:\\op.jpg") );
           System.out.println("image created");
        }
}
