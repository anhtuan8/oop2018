package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static <T extends Comparable> T max(ArrayList<T> a){
        T max = a.get(0);
        for(T item: a){
            if(max.compareTo(item) < 0)
                max = item;
        }
        return max;
    }
    public static void main(String[] args) {
        Double[] a = {0.5,5.44,8.511,515.1,00.44};
        String[] b = {"ad","asd","cat","zipper","zod","yes it is", "hell no"};
        ArrayList<Double> dblArray = new ArrayList<>(Arrays.asList(a));
        ArrayList<String> strArray = new ArrayList<>(Arrays.asList(b));
        System.out.println("max item: " + max(dblArray) + " & " + max(strArray));
    }
}
