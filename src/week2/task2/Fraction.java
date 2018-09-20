package week2.task2;

import javax.xml.stream.FactoryConfigurationError;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator,denominator;

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(b!=0) {
            int r = Math.abs(a) % Math.abs(b);
            if (r == 0)
                return Math.abs(b);
            return gcd(b, r);
        }
        return a;
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        if(denominator != 0){
            this.numerator = numerator;
            this.denominator = denominator;
        }
        else{
            System.out.println("DENOMINATOR CANT BE ZERO!!!!");
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        try{
            int n= this.numerator*other.denominator + this.denominator*other.numerator;
            int d = this.denominator*other.denominator;
            int a = gcd(n,d);
            Fraction f = new Fraction(n/a,d/a);
            return f;
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception" + e +" .Enter fraction" );
            return null;
        }
        catch(Exception e){
            System.out.println("In adding fractions: Exception " + e);
            return null;
        }

    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        try{
            int n= this.numerator*other.denominator - this.denominator*other.numerator;
            int d = this.denominator*other.denominator;
            int a = gcd(n,d);
            Fraction f;
            f = new Fraction(n/a,d/a);
            return f;
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception" + e +" .Enter fraction" );
            return null;
        }
        catch(Exception e){
            System.out.println("In subtracting fractions: Exception " + e);
            return null;
        }
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        try{
            int n = this.numerator*other.numerator;
            int d = this.denominator*other.denominator;
            int a = gcd(n,d);
            Fraction f;
            f = new Fraction(n/a,d/a);
            return f;
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception" + e +" .Enter fraction" );
            return null;
        }
        catch(Exception e){
            System.out.println("In multiplying fractions: Exception " + e);
            return null;
        }

    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        try{
            int n = this.numerator*other.denominator;
            int d = this.denominator*other.numerator;
            int a = gcd(n,d);
            Fraction f;
            f = new Fraction(n/a,d/a);
            return f;
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception" + e +" .Enter fraction" );
            return null;
        }
        catch(Exception e){
            System.out.println("In dividing fractions: Exception " + e);
            return null;
        }
    }

    public boolean equals(Fraction other){
        try{
            int a1=gcd(this.denominator,this.numerator);
            int a2=gcd(other.denominator,other.numerator);
            return (this.denominator/a1 == other.denominator/a2)&&(this.numerator == other.numerator);
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception" + e +" .Enter fraction" );
            return false;
        }
        catch(Exception e){
            System.out.println("In comparing fractions: Exception " + e);
            return false;
        }
    }

    public void printFraction(){
        if(this.numerator % this.denominator ==0){
            System.out.println(this.numerator/this.denominator);
        }
        else{
            System.out.println(this.numerator + "/" + this.denominator);
        }
    }

    public static void main(String args[]){
        Fraction fract1= new Fraction(48,0);
        Fraction fract2 = new Fraction(-55,68);
        Fraction fract3 = fract1.add(fract2);
        Fraction fract4 = fract1.subtract(fract2);
        Fraction fract5 = fract1.multiply(fract2);
        Fraction fract6 = fract1.divide(fract2);
        fract3.printFraction();
        fract4.printFraction();
        fract5.printFraction();
        fract6.printFraction();
        System.out.println(fract1.equals(fract2));
    }
}
