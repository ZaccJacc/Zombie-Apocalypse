package Render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.openvr.Texture;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;



public class Renderer {
public static int i = 0;
public static boolean y = false;
    public static void Render() {

        GL11.glBegin(GL11.GL_LINES);
        GL11.glColor3f(0.4f, 0.0f, 0.4f);
        GL11.glVertex2f(100, 100);
        GL11.glVertex2f(200, 400+ i);
        GL11.glEnd();
        GL11.glBegin(GL11.GL_LINES);
        GL11.glColor3f(0.4f, 0.0f, 0.4f);
        GL11.glVertex2f(1180,100);
        GL11.glVertex2f(1080, 400+ i);
        //System.out.println(i);
        if(!y){
            i++;
        }else{
            i--;
        }

        if(i > 250){
            y = true;
        }else if(i <= 0){
            y = false;
        }

    }
}
