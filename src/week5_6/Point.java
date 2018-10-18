package week5_6;

public class Point {
    double x,y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x,double y){
        this.setX(x);
        this.setY(y);
    }
}
