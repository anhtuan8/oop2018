package week5_6;

import java.util.ArrayList;

public class Layer {
    ArrayList<Shape> shapes = new ArrayList<>();

    void deleteTriangle(){
        for(Shape shape:shapes){
            if(shape instanceof Triangle){
                shapes.remove(shape);
            }
        }
        MovingShapes.root.getChildren().removeAll(MovingShapes.triangle);
    }

    void init(){
        Point a = new Point(100,100);
        Point b = new Point(40,0);
        Point c = new Point(20,80);
        Point d = new Point(300,300);
        Point e = new Point(300,400);
        Point f = new Point(400,400);
        Point g = new Point(200,200);

        Circle circle = new Circle(30,"red",true);
        circle.setCenter(g);
        shapes.add(circle);

        Triangle triangle1 = new Triangle(a,b,c);
        shapes.add(triangle1);

        Rectangle rectangle = new Rectangle(30,50,a);
        rectangle.color = "Brown";
        shapes.add(rectangle);

        Square square = new Square(100,e);
        shapes.add(square);
    }
}
