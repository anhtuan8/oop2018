package week5_6;

public class Triangle extends Shape {
    private Point a,b,c;
    private double AB,BC,AC;

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double getAB() {
        return AB;
    }

    public double getBC() {
        return BC;
    }

    public double getAC() {
        return AC;
    }

    public void setAB(double AB) {
        this.AB = AB;
    }

    public void setBC(double BC) {
        this.BC = BC;
    }

    public void setAC(double AC) {
        this.AC = AC;
    }

    public Point getC() {
        return c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Triangle(Point a,Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
