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
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
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
