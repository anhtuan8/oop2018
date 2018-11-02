package week7.task1;

public class Square extends Expression {
    Expression expression;

    public Square(Expression e){
        this.expression = e;
    }

    @Override
    public String toString(){
        return "("+expression.toString()+")"+"^2";
    }
    @Override
    public int evaluate(){
        return expression.evaluate()*expression.evaluate();
    }

}
