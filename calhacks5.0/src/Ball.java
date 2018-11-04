import processing.core.PApplet;

public class Ball extends Shape {
    private PApplet sketch;
    private float x;
    private float y;
    private float radius;

    Ball(PApplet sketch, float x, float y, float r) {
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    public void render() {
        sketch.ellipse(x, y, radius, radius);
    }
}