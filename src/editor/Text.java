package editor;

import java.awt.*;

public class Text extends Shape implements DrawableScalable  {
private String value;
private double scale;
private double x;
private double y;
private Color shapeColor;

    public Text(String value, double scale, double x, double y) {
        this.value = value;
        this.scale = scale;
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Text(String value, double x, double y) {
        this(value, 1, x, y);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
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
        return "Text";
    }

    @Override
    public String toString() {
        return getShapeName() + "{" +
                "value=" + getValue() +
                "\n, scale=" + getScale() +
                "\n, x=" + getX() +
                "\n, y=" + getY() +
                "}";
    }
}
