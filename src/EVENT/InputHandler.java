package EVENT;
import Render.DisplayHandler;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWKeyCallbackI;
import org.lwjgl.system.Callback;
import org.lwjgl.system.libffi.FFICIF;

import static org.lwjgl.glfw.GLFW.*;

public class InputHandler extends Callback implements GLFWKeyCallbackI {

    public InputHandler(long window) { // Constructor for use when creating an anonymous InputHandler that attaches the window and callback on this end
        super(window);
        glfwSetKeyCallback(window, new GLFWKeyCallback() {
            @Override
            public void invoke(long window, int key, int scancode, int action, int mods) {
                System.out.println(key);
            }
        });
    }

    public InputHandler(){ // Constructor for use when using this as an implicit GLFW key callback of its own
        super(DisplayHandler.window);
    }

    @Override
    public FFICIF getCallInterface() {
        return GLFWKeyCallbackI.super.getCallInterface();
    }

    @Override
    public long address() {
        return GLFWKeyCallbackI.super.address();
    }

    @Override
    public void callback(long ret, long args) {
        GLFWKeyCallbackI.super.callback(ret, args);
    }

    @Override
    public void invoke(long window, int key, int scancode, int action, int mods) {

    }
}
