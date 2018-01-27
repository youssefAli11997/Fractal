package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class FractalHandler {

    GraphicsContext graphicsContext;

    public FractalHandler(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
    }

    public void cleanCanvas(){
        double canvasWidth = graphicsContext.getCanvas().getWidth();
        double canvasHeight = graphicsContext.getCanvas().getHeight();
        graphicsContext.setFill(new Color(0,0,0,1));
        graphicsContext.fillRect(0,0, canvasWidth, canvasHeight);
        graphicsContext.setStroke(new Color(0,0,1,1));
    }

    public void drawFractal(int level, double xA, double yA, double xB, double yB){
        if(level == 0){
            graphicsContext.strokeLine(xA, yA, xB, yB);
            return;
        }

        double xC,yC;
        xC = xA + (xB-xA)/2 - (yB-yA)/2;
        yC = yA + (yB-yA)/2 + (xB-xA)/2;

        graphicsContext.setStroke(new Color(1,0,0,1));
        drawFractal(level - 1, xA, yA, xC, yC);
        graphicsContext.setStroke(new Color(0,0,1,1));
        drawFractal(level - 1, xC, yC, xB, yB);
    }

}
