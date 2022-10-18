package EVENT;
import Render.DisplayHandler;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWKeyCallbackI;
import org.lwjgl.system.Callback;
import org.lwjgl.system.libffi.FFICIF;

import static Main.App.logger;
import static org.lwjgl.glfw.GLFW.*;

public class InputHandler extends Callback implements GLFWKeyCallbackI {

    private final int PRESSED = 1; // For the int action states on a GLFwKeyCallbackI invoke
    private final int RELEASED = 0;

    public InputHandler(long window){
        super(window);
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
        System.out.println(glfwGetKeyName(key, scancode));
        try {
            if (action==PRESSED) {
                switch (glfwGetKeyName(key, scancode).toLowerCase()) {
                    case "w":
                        System.out.println("Forwards motion triggered");
                        // Do some code
                        // Replicate for the other movement keys and controls? idfk.
                }
            } // put this if thing in so the movement is only triggered when the key is pressed, the release trigger
              // should call something to stop the movement... probably easiest.
            else {
                System.out.println("Movement stop requested");
                // This SHOULD NOT be to stop all movement, it still needs to be dependent on the key released.
            }
        } catch (Exception e){
            logger.warning("Unable to reference key from code and scan: "+key+"|"+scancode);
        }
    }
}