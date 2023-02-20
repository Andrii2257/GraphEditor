package editor;

import java.awt.*;

public class Point extends Shape implements Drawable {
    private double x;
    private double y;
    private Color shapeColor;

    public Point(double x, double y, Color shapeColor) {
        this.x = x;
        this.y = y;
        this.shapeColor = shapeColor;
    }

    public Point(double x, double y) {
        this(x, y, Color.BLACK);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public Color getShapeColor() {
        return shapeColor;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public String getShapeName() {
        return "Point";
    }

    @Override
    public String toString() {
        return getShapeName() + " {" +
                "x = " + getX() +
                ", y = " + getY() +
                ", shapeColor = " + getShapeColor() +
                '}';
    }
}
