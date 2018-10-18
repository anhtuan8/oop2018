package week4.task2;

public class Main {

    public static void main(String[] args){
        //Initalize shapes
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("blue",false);
        //Initialize rectangles
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10.0,11.5);
        Rectangle rectangle3 = new Rectangle(20.5,13.9,"black",false);
        //Initialize circlese
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.8);
        Circle circle3 = new Circle(5.4,"red",true);
        //Initalize squares
        Square square1 = new Square();
        Square square2 = new Square(5.0);
        Square square3 = new Square(15.0,"orange",true);


        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());
    }
}
