package Main;


import Render.RenderLoop;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class App {

    public static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args){
        try {
            FileHandler handler = new FileHandler("Zombie-Apocalypse.log",true);
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            logger.warning("Failed to initialize logger handler.");
        }
        logger.info("Attempting to initialise rendering...");
        new RenderLoop();
    }
}

