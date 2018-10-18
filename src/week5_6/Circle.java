package week5_6;

public class Circle extends Shape {
    double radius = 1.0;
    final double PI = 3.14159265359;
    Point center;

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    /**
     * Constructor 1
     */
    public Circle(){
        super();
    }

    /**
     * Constructor 2
     * @param radius
     */
    public Circle(double radius){
        super();
        this.radius = radius;
    }

    /**
     * Constructor 3
     * @param radius
     * @param color
     * @param filled
     */
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    /**
     * getter,setter cho radius
     * @return
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return Dien tich hinh tron
     */
    public double getArea(){
        return PI*radius*radius;
    }

    /**
     * @return chu vi hinh tron
     */
    public double getParimeter(){
        return 2.0*PI*radius;
    }

    /**
     *
     * @return context doi tuong Circle
     */
    public String toString(){
        return super.toString() +"," + radius;
    }
}

