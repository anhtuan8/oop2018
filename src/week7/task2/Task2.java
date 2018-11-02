package week7.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task2 {
    String s = null;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void exc1()throws NullPointerException{
        if(s.equals("wqeqwe")){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }

    public void exc2()throws ArrayIndexOutOfBoundsException{
        int[] a = {0,1,2,3,4};
        System.out.println(a[5]);
    }

    public void exc3()throws ArithmeticException{
        double a = 0;
        System.out.println(10/a);
    }

    public void exc4()throws ClassCastException{
        Object a = "abcd";
        System.out.println((int) a);
    }

    public void exc5() throws IOException{
        Scanner scanner = new Scanner(new File(".\\E_V.ddd"));

    }

    public void exc6() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(".\\abcd.txt"));
        while(scanner.hasNextInt()) {
            int s = scanner.nextInt();
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        Task2 tester = new Task2();

        //NullPointerException
       try {
           tester.exc1();
       }catch (NullPointerException e){
           System.out.println(e);
       }

       //ArrayIndexOutOfBoundsException
       try{
           tester.exc2();
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }

       //Divide by 0 exception
       try{
            tester.exc3();
       }catch (ArithmeticException e){
           System.out.println(e);
       }

       //Classcast exception
        try{
            tester.exc4();
        }catch (ClassCastException e){
            System.out.println(e);
        }

        //IOException
        try{
            tester.exc5();
        }catch (IOException e){
            System.out.println(e);
        }

        try{
            tester.exc6();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }

    }
}
