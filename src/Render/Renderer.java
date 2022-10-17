package Render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.openvr.Texture;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;



public class Renderer {
public int i = 0;
public boolean y = false;

    public Renderer() {

        GL11.glBegin(GL11.GL_LINES);
        GL11.glColor3f(0.4f, 0.0f, 0.4f);
        GL11.glVertex2f(100, 100);
        GL11.glVertex2f(200, 400+ i);
        GL11.glEnd();
        GL11.glBegin(GL11.GL_LINES);
        GL11.glColor3f(0.4f, 0.0f, 0.4f);
        GL11.glVertex2f(1180,100);
        GL11.glVertex2f(1080, 400+ i);
        GL11.glEnd();
        int id = RenderUtil.getInstance().loadTexture("src/Resources/zombie.png");

        GL11.glPushMatrix();
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);

        GL11.glBindTexture(GL11.GL_TEXTURE_2D, id);
        // translate to the right location and prepare to draw
        GL11.glTranslatef(20, 20, 0);
        GL11.glColor3f(0, 0, 0);

        // draw a quad textured to match the sprite
        GL11.glBegin(GL11.GL_QUADS);
        {
            GL11.glTexCoord2f(0, 0);
            GL11.glVertex2f(0, 0);
            GL11.glTexCoord2f(0, 64);
            GL11.glVertex2f(0, 720);
            GL11.glTexCoord2f(64, 64);
            GL11.glVertex2f(1280, 720);
            GL11.glTexCoord2f(64, 0);
            GL11.glVertex2f(1280, 0);
        }
        GL11.glEnd();
        GL11.glPopMatrix();
    }
}
