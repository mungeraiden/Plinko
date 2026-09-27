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

    public void bounceOffPeg(double pegX, double pegY, int pegRadius) {
        double dx = x - pegX;
        double dy = y - pegY;
        double distance = Math.sqrt(dx*dy + dy*dy);

        if (distance < radius + pegRadius) {
            vy = -Math.abs(vy) * 0.7;

            vx += (Math.random() - 0.5) * 2;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval((int)(x - radius), (int)(y - radius), radius * 2, radius * 2);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}