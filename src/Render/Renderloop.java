package Render;

public class Renderloop {
    public Renderloop(){
        System.out.println("Render loop started");
        try {
            new DisplayHandler();
            DisplayHandler.RenderMain();
        }
        catch (Exception ignored) {
            System.out.println("Unable to initialise window");
        }
        while(!DisplayHandler.isCloseRequested()) {
            DisplayHandler.RenderUpdate();
        }
    }
}
