package com.company;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.Scanner;
import java.util.UUID;

public class imgdwld {
    public static void main(String[] args){
        BufferedImage image = null;
        String uuid = UUID.randomUUID().toString();
        String name = uuid+".png";
        String path = "C:\\Users\\"+System.getProperty("user.name")+"\\Downloads\\"+name;
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter The Url");
            String ul = in.nextLine();
            URL url = new URL(ul);

            image = ImageIO.read(url);
            ImageIO.write(image, "png", new File(path));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
