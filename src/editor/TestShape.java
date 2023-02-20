package editor;

import java.awt.Color;



public class TestShape implements Surface {
    @Override
    public void draw(Drawable draw) {
        System.out.println("Drawing at x = " + draw.getX() + ", y = " + draw.getY());
        if (draw instanceof Shape) {
            System.out.println("Shape name = " + ((Shape) draw).getShapeName());
            System.out.println("Set shape's color = " + ((Shape) draw).getShapeColor());
        }
        if (draw instanceof DrawableScalable) {
            System.out.println("Set scale = " + ((DrawableScalable) draw).getScale());
        }
        if (draw instanceof Borderable) {
            System.out.println("Set border = " + ((Borderable) draw).getBorderWidth());
        }
        if (draw instanceof Fillable) {
            System.out.println("Set fill = " + ((Fillable) draw).getFillColor());
        }
        System.out.println("------------------------------");

    }

    public static void main(String[] args) {
        TestShape testShape = new TestShape();
        Drawable rect1 = new Rectangle(5,10,115,14, 1.5, Color.red, 2.2, Color.gray);
        Drawable line1= new Line(26, 17, 90, 17);
        Drawable point1 = new Point(12, 15, Color.yellow);
        Drawable circle1 = new Circle(60,70, 25, 1, Color.red, 1, Color.gray);
        Drawable text1 = new Text("Good morning Ukraine!!!", 1, 120, 150);
        Drawable quad1 = new Quad(77, 88, 15, 1, Color.black, 1, Color.blue);
        Drawable[] shapes = {rect1, line1, point1, circle1, text1, quad1};
        for (Drawable shape : shapes) {
            testShape.draw(shape);
        }
    }
}
