package week2.task3;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Book{
    //TODO: khai bao thuoc tinh cho class Books
    String name =null;
    String author =null;
    int release_year = -1;

    //TODO: getter, setter cho cac thuoc tinh
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

    public String getAuthor(){
        try{
            if(author!= null){
                return author;
            }
            else {
                System.out.println("Set author first.");
                return null;
            }
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public void setAuthor(String n){
        try{
            author = n;
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public int getReleaseYear(){
        try{
            if(release_year >= 0){
                return release_year;
            }
            else {
                System.out.println("Set release year first.");
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
            release_year = n;
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    //TODO: Tao mang books
    Book books[] = new Book[100];

    //TODO: In danh muc sach cua tac gia X
    public void printBookof(String author){
        for(Book book:books) {
            if(book.getAuthor().equals(author)) {
                System.out.println(book.getName());
            }
        }
    }

    //TODO: In danh muc sach xuat ban sau nam X
    public void printBookafter(int year){
        for(Book book:books) {
            if(book.getReleaseYear() > year) {
                System.out.println("Name: " + book.getName() +"\nAuthor: " + book.getAuthor());
            }
        }
    }

    //TODO: Xoa sach xuat ban truoc nam X ra khoi mang
    public void removeBookBefore(int year){
        for(int i=0;i<books.length;i++) {
            if(books[i] == null)
                break;
            if(books[i].getReleaseYear() < year){
                for(int j=i ;j<books.length -1;j++){
                    books[j] = books[j+1];
                }
                i--;
            }
        }
    }

}

class Friend{
    //TODO: khai bao thuoc tinh cho class Books
    String name = null;
    String number= null;
    String email = null;

    Friend friends[] = new Friend[1000];
    //TODO: getter, setter cho cac thuoc tinh
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

    public String getNumber(){
        try{
            if(number!=null){
                return number;
            }
            else {
                System.out.println("Set number first.");
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

    public void setNumber(String n){
        try{
            number = n;
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    //TODO: In contact(number + email) cua ban ten A
    public void contact(String name){
        try{
            if(this.name.equals(name)){
                System.out.println("Email: " + this.email + "\nNumber: " + this.number);
            }
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    //TODO: Unfriend ban A
    public void unfriend(Friend A){
        try {
            for(int i=0;i<friends.length;i++) {
                if(friends[i] == null)
                    break;
                if(friends[i] == A){
                    for(int j=i ;j<friends.length -1;j++){
                        friends[j] = friends[j+1];
                    }
                    i--;
                }
            }

        }
        catch(Exception e){
            System.out.println("Exception: " +e);
        }

    }

    //TODO: Gui tin nhan "I love you" cho ban A
    public void confess(Friend A){
        try {
            // Recipient's email ID needs to be mentioned.
            String to = "abcd@gmail.com";

            // Sender's email ID needs to be mentioned
            String from = "web@gmail.com";

            // Assuming you are sending email from localhost
            String host = "localhost";

            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.setProperty("mail.smtp.host", host);

            // Get the default Session object.
            Session session = Session.getDefaultInstance(properties);


        }
        catch(MessagingException mex){
            mex.printStackTrace();
        }
    }

}
class Phone{
    //TODO: khai bao thuoc tinh cho class Books
    String brand;
    int price;
    int screensize;

    //TODO: getter, setter cho cac thuoc tinh
}
