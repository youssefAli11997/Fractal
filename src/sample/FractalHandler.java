package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class FractalHandler {

    GraphicsContext graphicsContext;

    public FractalHandler(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
        initGraphicsContext();
    }

    private void initGraphicsContext(){
        double canvasWidth = graphicsContext.getCanvas().getWidth();
        double canvasHeight = graphicsContext.getCanvas().getHeight();
        graphicsContext.setFill(new Color(0,0,0,1));
        graphicsContext.fillRect(0,0, canvasWidth, canvasHeight);
    }

    public static void drawFractal(int level, double xA, double yA, double xB, double yB){

    }

}
