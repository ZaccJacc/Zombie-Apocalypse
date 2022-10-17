package Render;

import static Main.App.logger;

public class RenderLoop {
    public RenderLoop() {
        try {
            DisplayHandler.RenderMain();
        } catch (Exception e) {
            logger.warning("Could not initialize RenderLoop, JVM gave error: " + e.getMessage());
        }
        while (!DisplayHandler.isCloseRequested()) {
            DisplayHandler.RenderUpdate();
        }
    }
}