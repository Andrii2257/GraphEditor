package editor;

import java.awt.*;

public class Quad extends Shape implements DrawableScalable, Borderable, Fillable {
    private double x;
    private double y;
    private double sideLength;
    private double borderWidth;
    private Color shapeColor;
    private double scale;
    private Color fillColor;

    public Quad(double x, double y, double sideLength, double borderWidth, Color shapeColor, double scale, Color fillColor) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
        this.borderWidth = borderWidth;
        this.shapeColor = shapeColor;
        this.scale = scale;
        this.fillColor = fillColor;
    }

    public Quad(double x, double y, double sideLength) {
        this(x, y, sideLength, 1, Color.BLUE, 1, Color.GREEN);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }



    @Override
    public double getBorderWidth() {
        return borderWidth;
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
    public double getScale() {
        return scale;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public String getShapeName() {
        return "Quad";
    }

    @Override
    public String toString() {
        return getShapeName() + "{" +
                "x=" + getX() +
                "\n, y=" + getY() +
                "\n, sideLength=" + getSideLength() +
                "\n, borderWidth=" + getBorderWidth() +
                "\n, shapeColor=" + getShapeColor() +
                "\n, scale=" + getScale() +
                "\n, fillColor=" + getFillColor() +
                '}';
    }
}
