package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name, email, group;
    private int id;

    // TODO: khai báo các phương thức getter, setter cho Student

    public String getName(){
        try{
            if(name!= null){
                return name;
            }
            else {
                System.out.prinln("Set name first");
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
            System.out.println("Re-enter argument");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public int getID(){
        if(id!= null){
            return id;
        }
        else{
            system.out.prinln("Set ID first");
            return null;
        }
    }

    public void setID(int n){
        try{
            id = n;
        }
        catch(nullPointerException e){
            System.out.println(e);
        }
        catch(invalidParameterException e){
            System.out.println(e);
        }
    }

    public String getGroup(){
        if(group!= null){
            return name;
        }
        else {
            system.out.prinln("Set group first");
            return null;
        }
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

    String getInfo() {
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
