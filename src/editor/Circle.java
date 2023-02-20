package editor;

import java.awt.*;

public class Circle extends Shape implements DrawableScalable, Borderable, Fillable {
    private double x;
    private double y;
    private double radius;
    private double borderWidth;
    private Color shapeColor;
    private double scale;
    private Color fillColor;

    public Circle(double x, double y, double radius, double width, Color shapeColor, double scale, Color fillColor) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.borderWidth = width;
        this.shapeColor = shapeColor;
        this.scale = scale;
        this.fillColor = fillColor;
    }

    public Circle(double x, double y, double radius) {
        this(x, y, radius, 1.0, Color.BLACK, 1.0, Color.WHITE);
    }

    @Override
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }

    @Override
    public Color getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public String toString() {
        return getShapeName() + " {" +
                "x=" + getX() +
                "\n, y=" + getY() +
                "\n, radius=" + getRadius() +
                "\n, borderWidth=" + getBorderWidth() +
                "\n, shapeColor=" + getShapeColor() +
                "\n, scale=" + getScale() +
                "\n, fillColor=" + getFillColor() +
                '}';
    }
}
