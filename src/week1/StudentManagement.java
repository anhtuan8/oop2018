package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;



public class StudentManagement {
    //------------------------------

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private static Student[] students = new Student[100];

    boolean sameGroup(Student s1, Student s2) {
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
        // TODO:In danh sach hoc sinh theo lop
        try {
            HashMap<Student, String> studentHashMap = new HashMap<>();


        }
        catch(Exception e){
            System.out.println("Exception: " +e);
        }
    }

    void removeStudent(String id) {
        // TODO:Xoa hoc sinh co id = id
        try {
            for(int i=0;i<students.length;i++) {
                if(students[i] == null)
                    break;
                if(students[i].getID()==Integer.parseInt(id)){
                    for(int j=i ;j<students.length -1;j++){
                        students[j] = students[j+1];
                    }
                    i--;
                }
            }

        }
        catch(Exception e){
            System.out.println("Exception: " +e);
        }
    }

    public static <students> void main(String[] args) {
        //------------ Cau 2 -----------
        Student student = new Student();

        //------------- Cau 6 ---------------------
        // TODO: tao ra 1 sinh vien
        students[0] = new Student();

        // TODO: thiet lap cac thong tin cua sinh vien
        students[0].setName("Nguyen Anh Tuan");
        students[0].setID(16021213);
        students[0].setEmail("anhtuan.051998@gmail.com");
        students[0].setGroup("K61CCLC");

        //-------------6c-------------------
        System.out.println(students[0].getName());
        //-------------6d----------------
        System.out.println(students[0].getInfo());
        //TODO:test constructor 1: Student()
        System.out.println("-----------constructor1------------");
        students[1] = new Student();
        System.out.println(students[1].getName());
        System.out.println(students[1].getInfo());

        //TODO: test constructor 2:
        System.out.println("-----------constructor2------------");
        students[2] = new Student("Nguyen Anh Tuan","16021213","anhtuan.051998@gmail.com");
        System.out.println(students[2].getName());
        System.out.println(students[2].getInfo());
        //TODO:test constructor 3: Student(Student s)
        System.out.println("-----------constructor3------------");
        students[3] = new Student(students[0]);
        System.out.println(students[3].getName());
        System.out.println(students[3].getInfo());
        students[4] = new Student();
        students[4].setGroup("INT22041");
        students[5] = new Student();
        students[5].setGroup("INT22041");
        students[6] = (new Student());
        students[6].setGroup("INT22042");
        System.out.println("-----------test sameGroup------------");
        StudentManagement test = new StudentManagement();
        System.out.println("student 4 va student 5 cung lop: " + test.sameGroup(students[4],students[5]));
        System.out.println("student 4 va student 6 cung lop: " + test.sameGroup(students[4],students[6]));
        System.out.println("student 5 va student 6 cung lop: " + test.sameGroup(students[5],students[6]));
        StudentManagement remove = new StudentManagement();
        remove.removeStudent("16021213");
        remove.removeStudent("000");
        for(Student s:students){
            if(s == null)
                break;
            System.out.println(students[10].getInfo());
        }
        students[7] = new Student(students[10]);
        students[7].getInfo();
    }
}
