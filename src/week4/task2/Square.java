package week4.task2;

public class Square extends Rectangle {
    /**
     * Constructor 1
     */
    public Square(){
        super();
    }
    /**
     * Constructor 2
     */
    public Square(double side){
        super(side,side);
    }
    /**
     * Constructor 3
     */

    public Square(double side, String color, boolean filled){
        super(side,side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return super.width;
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }

    public void setLength(double side){
        this.width = side;
        this.length = side;
    }

    public String toString(){
        return super.toString() + "," + this.getSide();
    }
}
