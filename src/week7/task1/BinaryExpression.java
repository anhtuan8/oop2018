package week7.task1;

public abstract class BinaryExpression extends Expression{
    Expression left,right;
    public Expression left(){
        return this.left();
    }
    public Expression right(){
        return this.right();
    }
}
