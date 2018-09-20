package week2.task1;

public class Task1 {

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

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0 || n==1)
            return 1;
        return fibonacci(n-2)+fibonacci(n-1);
    }

    public static void main(String args[]){
        System.out.println(gcd(15,-30));
        System.out.println(fibonacci(5));
    }
}
