import processing.core.PApplet;

import java.awt.dnd.DragGestureEvent;
import java.util.ArrayList;

public class Sketch<T> extends PApplet {
    private ArrayList<Shape> items = new ArrayList<>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private int red, green, blue;
    private String mode;

    public void settings() {

        size(500, 500);
//        background(255);
        buttons.add(new Button(this,10, 10, 70, 20, "Stroke Thickness"));
        mode = "line";
    }
    public void draw() {
        for(int j = 0; j < buttons.size(); j++) {
            fill(200);
            buttons.get(j).render();
        }
        for(int i = 0; i < items.size(); i++) {
            fill(red, green, blue);
            items.get(i).render();

        }

    }
    public void mouseDragged() {
        if(mode == "line") {
            line(mouseX, mouseY, pmouseX, pmouseY);
        }
    }
    public void mousePressed() {
        for(Button button : buttons) {
            if (button.isOver(mouseX, mouseY)) {
                //items.add(new ColorOptions());
            }
        }
        if (mode == "ball") {
            items.add(new Ball(this, mouseX, mouseY, 10));
        }
    }

    public static void main(String args[]) {
        String[] name = {"Test Sketch"};
        Sketch newSketch = new Sketch();
        PApplet.runSketch(name, newSketch);
    }

}