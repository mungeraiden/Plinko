import java.awt.Color;
import java.awt.Graphics;


public class Ball {
    private double x;
    private double y;
    private double vx;
    private double vy;
    private final int radius = 8;
    private final double gravity = 0.3;

    public Ball(double startX, double startY) {
        this.x = startX;
        this.y = startY;
        this.vx = 0;
        this.vy = 0;
    }

    public void update() {

        vy += gravity;

        x += vx;
        y += vy;
    }

}