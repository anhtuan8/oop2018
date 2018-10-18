package week4.task2;

public class Rectangle extends Shape {
    double width = 1.0 , length = 1.0;

    /**
     * constructor 1
     */
    public Rectangle(){
        super();
    }

    /**
     * constructor 2
     * @param width
     * @param length
     */
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor 3
     * @param width
     * @param length
     * @param color
     * @param filled
     */
    public Rectangle(double width, double length, String color,boolean filled){
        this.width = width;
        this.length = length;
        this.filled = filled;
        this.color = color;
    }

    /**
     * getter,setter cho cac thuoc tinh
     * @return
     */
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     *
     * @return Dien tich Hinh chu nhat
     */
    public double getArea(){
        return length*width;
    }

    /**
     *
     * @return Chu vi hinh chu nhat
     */
    public double getPerimeter(){
        return (length+width)*2.0;
    }

    /**
     * to String
     * @return context cua Rectangle
     */
    public String toString() {
        return super.toString() + "," + width + "," + length;
    }
}
