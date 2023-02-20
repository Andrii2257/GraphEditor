package editor;

import java.awt.*;

public class Rectangle extends Shape implements DrawableScalable, Borderable, Fillable {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double borderWidth;
    private Color shapeColor;
    private double scale;
    private Color fillColor;

    public Rectangle(double x1, double y1, double x2, double y2, double borderWidth, Color shapeColor, double scale, Color fillColor) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.borderWidth = borderWidth;
        this.shapeColor = shapeColor;
        this.scale = scale;
        this.fillColor = fillColor;
    }

    public Rectangle(double x1, double y1, double x2, double y2) {
        this(x1, y1, x2, y2, 1, Color.BLACK, 1, Color.WHITE);
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
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
    public double getX() {
        return getX1();
    }

    @Override
    public double getY() {
        return getY1();
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return getShapeName() + " {x1 = " + getX1() + ", y1 = " + getY1()
                + "\nx2 = " + getX2() + ", y2 = " + getY2()
                + "\n, borderWidth = " + getBorderWidth()
                + "\n, borderColor = " + getShapeColor()
                + "\n, scale = " + getScale()
                + "\n, fillColor = " + getFillColor() + "}";
    }
}
