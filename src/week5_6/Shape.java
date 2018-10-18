package week5_6;

public class Shape {
    String color = "red" ;
    boolean filled = true;
    Shape path;

    /**
     * Constructor 1
     */
    public Shape(){

    }

    /**
     * Constructor 2
     * @param color
     * @param filled
     */
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    /**
     * getter,setter cho cac thuoc tinh
     */
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    /**
     * @return context doi tuong Shape
     */
    public String toString() {
        return color +"," + filled;
    }
}
