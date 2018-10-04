package week3;

public class Week3 {

    // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
    public static int max(int m, int n) {
        try {
            if(m>n)
                return m;
            return n;
        }
        catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
    public static int minOfArray(int[] array) {
        try {
            int min = array[0];
            for (int num : array) {
                if (min > num) {
                    min = num;
                }
            }
            return min;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
    public static String calculateBMI(double weight, double height) {
        try{
            if(weight <= 0 || height <=0 ){
                System.out.println("Thông số không phù hợp.");
                return null;
            }
            double bmi= weight / (height*height*1.0);
            if(bmi <18.5)
                return "Thiếu cân";
            if(bmi >=18.5 && bmi <23)
                return "Bình thường";
            if(bmi >=23 && bmi <25 )
                return "Thừa cân";
            else
                return "Béo phì";
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
