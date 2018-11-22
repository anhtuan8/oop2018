package week11;

public class Task1 {
    public static  <T extends Comparable> void sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
//        Integer[] a = {1,5,6,7,5};
//        Float[] a = {0.11f,1.14f,1.0f,0.5f,0011.00f};
        Double[] a = {0.14,55.4,51.0,8.11,0.555,3.145};
        System.out.println("Before sort: ");
        for(Object c : a){
            System.out.print(c + " ");
        }
        System.out.println();
        sort(a);
        System.out.println("After sort: ");
        for(Object c : a){
            System.out.print(c + " ");
        }
    }
}