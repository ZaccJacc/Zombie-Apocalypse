package EVENT;
import Render.DisplayHandler;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWKeyCallbackI;
import org.lwjgl.system.Callback;
import org.lwjgl.system.libffi.FFICIF;

import static org.lwjgl.glfw.GLFW.*;

public class InputHandler extends Callback implements GLFWKeyCallbackI {
    /*
    * Consulted ben on this (he is far too hot for me not to), and he said to keep things more explicit, completely
    * use our own InputHandler. I had previously considered doing it with an anonymous GLFWCallBack but to make
    * things more 'modular' in ben's words, chose to do it this way, so we have full control over our callback,
    * so we can make custom responses from the get-go. Look at us being good programmers, huh?
    */

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
        System.out.println(key);
    }
}
