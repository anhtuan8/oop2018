package week10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public double a[];

    public Task2(int n) {
        a = generate(n);
    }
    public static double[] generate(int size){
        double[] a = new double[size];
        Random random = new Random();
        for(int i =0;i<size;i++){
            a[i] = random.nextDouble();
        }
        return a;
    }

    public static void sort(double[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i-1; j++) {
                if (nums[j] > nums[j + 1]) {
                    double tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
    }

    public boolean isSorted(){
        for (int i = 0;i<a.length-1;i++){
            if(a[i] >a[i+1]){
                System.out.println(i);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Task2 arrays = new Task2(1000);
        sort(arrays.a);
        System.out.println(arrays.isSorted());
    }


}
