package week5_6;

public class Square extends Shape {
    /**
     * Constructor 1
     */
    Point upper_left;
    double width = 1.0 , length = 1.0;
    public Square(){
        super();
    }

    public Square(double side, Point upper_left){
        this.setSide(side);
        this.upper_left = upper_left;
    }

    public double getSide(){
        return width;
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
