package week1;

import java.util.ArrayList;
import java.util.List;


public class StudentManagement {

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:

        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        //------------ Cau 2 -----------
        Student student = new Student();
        //------------------------------

        // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
        List<Student> students = new ArrayList<>(100);

        //------------- Cau 6 ---------------------
        // TODO: tao ra 1 sinh vien
        students.add(new Student());

        // TODO: thiet lap cac thong tin cua sinh vien
        students.get(0).setName("Nguyen Anh Tuan");
        students.get(0).setID(16021213);
        students.get(0).setEmail("anhtuan.051998@gmail.com");
        students.get(0).setGroup("K61CCLC");
        //-------------6c-------------------
        System.out.println(students.get(0).getName());
        //-------------6d----------------
        System.out.println(students.get(0).getInfo());
    }
}
