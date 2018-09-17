package week1;

import java.util.ArrayList;
import java.util.List;


public class StudentManagement {

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        try {
            return s1.getGroup().equals(s2.getGroup());
        }
        catch(Exception e){
            System.out.println("Exception: " +e);
            return false;
        }
    }

    void studentsByGroup() {
        // TODO:
        try {

        }
        catch(Exception e){
            System.out.println("Exception: " +e);
        }
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
        //TODO:test constructor 1: Student()
        System.out.println("-----------constructor1------------");
        students.add(new Student());
        System.out.println(students.get(1).getName());
        System.out.println(students.get(1).getInfo());

        //TODO: test constructor 2:
        System.out.println("-----------constructor2------------");
        students.add(new Student("Nguyen Anh Tuan","16021213","anhtuan.051998@gmail.com"));
        System.out.println(students.get(2).getName());
        System.out.println(students.get(2).getInfo());
        //TODO:test constructor 3: Student(Student s)
        System.out.println("-----------constructor3------------");
        students.add(new Student(students.get(0)));
        System.out.println(students.get(3).getName());
        System.out.println(students.get(3).getInfo());
        students.add(new Student());
        students.get(4).setGroup("INT22041");
        students.add(new Student());
        students.get(5).setGroup("INT22041");
        students.add(new Student());
        students.get(6).setGroup("INT22042");
        System.out.println("-----------test sameGroup------------");
        System.out.println("student 4 va student 5 cung lop: " + sameGroup(students.get(4),students.get(5)));
        System.out.println("student 4 va student 6 cung lop: " + sameGroup(students.get(4),students.get(6)));
        System.out.println("student 5 va student 6 cung lop: " + sameGroup(students.get(5),students.get(6)));
    }
}
