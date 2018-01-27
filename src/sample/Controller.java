package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Label levelLabel;
    public Canvas canvas;
    private FractalHandler fractalLogic;

    private int currentLevel = 0;

    public void init(){
        fractalLogic = new FractalHandler(canvas.getGraphicsContext2D());
        drawFractal();
    }

    public void increaseLevelBtnClicked(MouseEvent mouseEvent) {
        currentLevel++;
        if(currentLevel == 15){
            levelLabel.setText("Level: " + currentLevel + " (Maximum Level)");
        }
        else if(currentLevel > 15){
            return;
        }
        else {
            levelLabel.setText("Level: " + currentLevel);
        }
        drawFractal();
    }

    public void decreaseLevelBtnClicked(MouseEvent mouseEvent) {
        if(currentLevel == 0){
            return;
        }
        currentLevel--;
        levelLabel.setText("Level: " + currentLevel);
        drawFractal();
    }
    private void drawFractal(){
        fractalLogic.cleanCanvas();
        fractalLogic.drawFractal(currentLevel,
                canvas.getWidth()/2 - Constants.offset, canvas.getHeight()/2, //point1
                canvas.getWidth()/2 + Constants.offset, canvas.getHeight()/2 //point2
        );
    }

}
