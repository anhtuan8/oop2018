package week7.task1;

public class Division extends BinaryExpression {
    public Division(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(){
        return left.toString()+":"+right.toString();
    }
    @Override
    public int evaluate(){
        try {
            if(right.evaluate() !=0) {
                return left.evaluate() + right.evaluate();
            }
            else {
                throw new ArithmeticException("Loi chia cho 0");
            }
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            return -1;
        }
    }
}
