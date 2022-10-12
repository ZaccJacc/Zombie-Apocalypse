package Render;

public class Renderloop {
    public static void Renderloop(){
        System.out.println("Render loop started");
        DisplayHandler.RenderMain();
            while(!DisplayHandler.isCloseRequested()) {
                DisplayHandler.RenderUpdate();
            }
    }
}
