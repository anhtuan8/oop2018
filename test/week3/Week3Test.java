package week3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class Week3Test {

    int[] arrayInit(int min){
        Random rand = new Random();
        int n = rand.nextInt(100);
        int[] a = new int[n+1];
        a[n] = min;
        for(int i = n-1 ; i>=0 ; i--){
            a[i] = rand.nextInt(100) + min;
        }
        return a;
    }

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(1514, Week3.max(15, 1514));
        assertEquals(0, Week3.max(-6, 0));
        assertEquals(3, Week3.max(3, 3));
        assertEquals(10, Week3.max(10, 0));
        assertEquals(-15, Week3.max(-21, -15));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] a0 = new int[]{};
        int[] a1 = arrayInit(6);
        int[] a2 = arrayInit(-15);
        int[] a3 = arrayInit(10);
        int[] a4 = arrayInit(100);
        int[] a5 = arrayInit(10);

        assertEquals(-1,Week3.minOfArray(a0));
        assertEquals(6,Week3.minOfArray(a1));
        assertEquals(-15,Week3.minOfArray(a2));
        assertEquals(10,Week3.minOfArray(a3));
        assertEquals(100,Week3.minOfArray(a4));
        assertEquals(10,Week3.minOfArray(a5));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        assertEquals("Thừa cân",Week3.calculateBMI(60,1.60));
        assertEquals("Bình thường",Week3.calculateBMI(49,1.60));
        assertEquals("Thiếu cân",Week3.calculateBMI(52,1.70));
        assertEquals("Béo phì",Week3.calculateBMI(90,1.70));
        assertNull(Week3.calculateBMI(-5,1.60));
    }
}
