import PlayerClient.Dave;
import Render.DisplayHandler;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glVertex2f;
import static org.lwjgl.opengl.GL15C.*;

public class GameLoop {
    public static void Renderloop(){
        System.out.println("Render loop started");
        Dave dave = new Dave();
        DisplayHandler.RenderMain();
            while(!DisplayHandler.isCloseRequested()) {
                DisplayHandler.RenderUpdate();



                GL11.glBegin(GL11.GL_LINES);
                GL11.glVertex2f(43, 65);
                GL11.glVertex2f(90, 200);
                GL11.glEnd();
                dave.getX();
            }
    }


}
