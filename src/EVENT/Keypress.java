package EVENT;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keypress implements KeyListener{

    //this isn't really going to work as an independent class, although i could probably do it via an uplink-style
    //variable

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        System.out.println("ajkdsajdklad");
        switch(key){
            case KeyEvent.VK_W:
            case KeyEvent.VK_LEFT:
                // apply this idea onwards with the keys wanted and the code required for movement

            default:
                System.out.println("Invalid key choice"); //debugging statement
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public Keypress(){}

    /*public static void main(String[] args){
        Keypress press = new Keypress();
    }*/

    //at the moment all the keypress stuff redirects from the DisplayHandler to here, but the display handler has
    // to implement a keylistener afaik so im not sure what the point in trying to handle these events seperately is.
    // I would say that we should have the keylistener as an implementation for the rendered window, and have it
    // reference the movement logic from there.

}
