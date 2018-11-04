import processing.core.PApplet;

public class Button extends Shape{
    private float x, y, w, h;
    private boolean isOver;
    private PApplet sketch;
    private String name;

    Button(PApplet sketch, float x, float y, float w, float h, String name) {
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.name = name;
    }

    void render() {
        sketch.fill(200);
        sketch.rect(x, y, w, h);
        sketch.fill(0);
        sketch.text(name, x + 12, y + 12);
    }

    boolean isOver(int mouseX, int mouseY) {
        return (mouseX >= x && mouseX <= x + w && mouseX >= y && mouseY <= y + h);
    }
}
