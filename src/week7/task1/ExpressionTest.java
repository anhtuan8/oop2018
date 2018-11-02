package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Numeral ten = new Numeral(10);
        Numeral one = new Numeral(1);
        Numeral two = new Numeral(2);
        Numeral three = new Numeral(3);
        Numeral zero = new Numeral(0);

//        Expression divide = new Division(three,zero);
//        System.out.println(divide);
//        System.out.println(divide.evaluate());
        Expression e1 = new Square(ten);
        Expression e2 = new Multiplication(two,three);
        Expression e3 = new Subtraction(e1,one);
        Expression e4 = new Addition(e3,e2);
        Expression e5 = new Square(e4);
        System.out.println(e5.toString() + "= " + e5.evaluate());
    }
}
