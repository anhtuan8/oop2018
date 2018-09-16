package week1;

import java.sql.SQLOutput;

public class Student {
    // -------- Cau 1 + 3----------
    // TODO: khai báo các thuộc tính cho Student
    private String name = null, email = null, group = null;
    private int id = -1;

    // --------- Cau 4 -------------
    // TODO: khai báo các phương thức getter, setter cho Student

    public String getName(){
        try{
            if(name!= null){
                return name;
            }
            else {
                System.out.println("Set name first.");
                return null;
            }
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public void setName(String n){
        try{
            name = n;
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public int getID(){
        try{
            if(id > 0){
                return id;
            }
            else {
                System.out.println("Set id first.");
                return -1;
            }
        }
        catch(Exception e){
            System.out.println(e);
            return -1;
        }
    }

    public void setID(int n){
        try{
            id = n;
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public String getGroup() {
        try{
            if(group!= null){
                return group;
            }
            else {
                System.out.println("Set group first.");
                return null;
            }
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }


    public void setGroup(String n){
        try{
            group = n;
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument.");
            }
        catch(Exception e){
                System.out.println(e);
        }
    }

    public String getEmail(){
        try{
            if(email!= null){
                return email;
            }
            else {
                System.out.println("Set email first.");
                return null;
            }
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public void setEmail(String n){
        try{
            email = n;
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    //-------------------- Cau 7 -----------------------------
    /**
     * Constructor 1
     */
    public Student(){
        // TODO:
        try {
            name = "Student";
            id = 000;
            group = "INT22041";
            email = "uet@vnu.edu.vn";
        }
        catch(Exception e){
            System.out.println("Exception: " + e );
            name = null;
            id = -1;
            email = null;
            group = null;
        }

    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n, String sid, String em) {
        // TODO:
        try{
            name = n;
            id = Integer.parseInt(sid);
            email = em;
            group = "INT22041";
        }
        catch(Exception e){
            System.out.println("Exception: " + e );
            name = null;
            id = -1;
            email = null;
            group = null;
        }
    }

    /**
     * Constructor 3
     * @param s
     */
    public Student(Student s) {
        // TODO:
        try {
            if (s.getInfo() != null && s.getEmail() != null && s.getID() > 0 && s.getGroup() != null) {
                name = s.getName();
                id = s.getID();
                email = s.getEmail();
                group = s.getGroup();
            }
            else {
                System.out.println("Set info for student s first");
                name = null;
                id = -1;
                email = null;
                group = null;
            }
        }
        catch(Exception e){
            System.out.println("Exception: " + e );
            name = null;
            id = -1;
            email = null;
            group = null;
        }
    }
    //------------- Cau 5 -------------------------------------
    String getInfo() {
        // TODO:
        if(name != null && group != null && id > 0 && email != null) {
            return name + " " + group + " " + id + " " + email;
        }
        else{
            System.out.println("Please enter student's info first");
            return "";
        }
    }
}
