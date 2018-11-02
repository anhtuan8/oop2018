package week7.task1;

public class Numeral extends Expression{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Numeral(int value){
        this.value = value;
    }

    public Numeral(){
        this.value = -1;
    }

    @Override
    public String toString(){
        return String.valueOf(this.getValue());
    }
    @Override
    public int evaluate(){
        return this.value;
    }
}
