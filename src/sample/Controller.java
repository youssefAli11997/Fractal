package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;

public class Controller {
    public Label levelLabel;
    public Canvas canvas;
    private FractalHandler fractalLogic;

    public void init(){
        fractalLogic = new FractalHandler(canvas.getGraphicsContext2D());

    }
}
