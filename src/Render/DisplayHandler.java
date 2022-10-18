package Render;
import EVENT.InputHandler;
import org.lwjgl.opengl.*;

import static Main.App.logger;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFW.glfwSetKeyCallback;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;
import org.lwjgl.glfw.GLFWErrorCallback;

public class DisplayHandler{
    public static long window;

    public static void RenderMain(){
        GLFWErrorCallback.createPrint(System.err).set();
        // Initialize GLFW. Most GLFW functions will not work before doing this.

        if ( !glfwInit() )
            throw new IllegalStateException("Unable to initialize GLFW");




        // Configure our window
        glfwDefaultWindowHints(); // optional, the current window hints are already the default
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE); // the window will stay hidden after creation
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE); // the window will be resizable
        int WIDTH = 1280;
        int HEIGHT = 720;


        // Create the window
        window = glfwCreateWindow(WIDTH, HEIGHT, "PlayerClient.Zombie-Apocalypse", NULL, NULL);
        // Attach the input handler
        glfwSetKeyCallback(window, new InputHandler(window));

        if ( window == NULL )
            throw new RuntimeException("Failed to create the GLFW window");

        glfwShowWindow(window);
        glfwMakeContextCurrent(window);
        glfwSwapInterval(1);


    }
    public static boolean isCloseRequested(){
        return glfwWindowShouldClose(window);
    }

    public static void RenderUpdate(){
        // clear the framebuffer

        GL.createCapabilities();
        //set up display system
        GL11.glMatrixMode(GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, 1280, 720, 0, 1, -1);
        GL11.glMatrixMode(GL_MODELVIEW);
        // Set the clear color


        // Run the rendering loop until the user has attempted to close
        // the window or has pressed the ESCAPE key.
        while ( !glfwWindowShouldClose(window) ) {

            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); // clear the framebuffer
            Renderer.Render();
            glfwSwapBuffers(window); // swap the color buffers

            // Poll for window events. The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
        }
    }
}
