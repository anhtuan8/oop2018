package week2.task3;

public class Task3 {
    static Friend[] friends = new Friend[1000];
    static Book[] books = new Book[1000];
    static Phone[] phones = new Phone[1000];
    public static void main(String args[]){
        //Test Book's methods
        /*books[0] = new Book();
        books[0].setName("Harry Potter 1");books[0].setAuthor("J.K.Rowling");books[0].setReleaseYear(1997);
        books[1] = new Book();
        books[1].setName("Harry Potter 2");books[1].setAuthor("J.K.Rowling");books[1].setReleaseYear(1998);
        books[2] = new Book();
        books[2].setName("Kokoro");books[2].setAuthor("Natsume Soseki");books[2].setReleaseYear(1914);

        Book manipulate = new Book();
        manipulate.printBookafter(1950);
        manipulate.printBookof("J.K.Rowling");
        manipulate.removeBookBefore(1997);
        for(Book book: books){
            if(book == null)
                break;
            System.out.println(book.getName()+" " +book.getAuthor() + " " + book.getReleaseYear());
        }*/

        //Friend's methods
        /*friends[0] = new Friend();
        friends[0].setName("Harry Potter");friends[0].setEmail("potter247@gmail.com");friends[0].setNumber("01214782114");
        friends[1] = new Friend();
        friends[1].setName("Ishihara");friends[1].setEmail("i_love_xxx@gmail.com");friends[1].setNumber("0123456789");
        friends[2] = new Friend();
        friends[2].setName("Uvuwewe Osas");friends[2].setEmail("longthings@gmail.com");friends[2].setNumber("84214785455");
        friends[3] = new Friend();
        friends[3].setName("Uvuwewe Osas");friends[3].setEmail("longthings@gmail.com");friends[3].setNumber("84214785455");

        Friend task = new Friend();
        task.contact("Ishihara");
        System.out.println("------------------------");

        task.unfriend(friends[2]);
        for(Friend friend: friends){
            if(friend == null)
                break;
            System.out.println(friend.getName()+" " +friend.getNumber() + " " + friend.getEmail());
        }
        System.out.println("------------------------");
        friends[4] = new Friend();
        friends[4].setName("Ishihara");friends[4].setEmail("i_love_xxx@gmail.com");friends[4].setNumber("0123456789");
        if(friends[4].appeared()){
            System.out.println("Appeared");
        }*/

        //Phone's methods
        phones[0] = new Phone();
        phones[0].setBrand("Iphone");phones[0].setPrice(2000);phones[0].setScreensize(10);

        phones[1] = new Phone();
        phones[1].setBrand("Samsung");phones[1].setPrice(3000);phones[1].setScreensize(9);

        phones[2] = new Phone();
        phones[2].setBrand("Bphone");phones[2].setPrice(2500);phones[2].setScreensize(15);

        phones[3] = new Phone();
        phones[3].setBrand("Iphone");phones[3].setPrice(1000);phones[3].setScreensize(12);

        Phone phone = new Phone();
        System.out.println(phone.LowestPrice().getBrand()+"\t"+phone.LowestPrice().getPrice()+"\t"+phone.LowestPrice().getScreensize());
        System.out.println("------------------");

        phone.PhoneList("Iphone", 2000);

        System.out.println("Number of Iphone phones: " + phone.PhoneBrand("Iphone"));

    }
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

class Book{
    //TODO: khai bao thuoc tinh cho class Books
    private String name = " ";
    private String author = " ";
    private int release_year = -1;

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

    public void setReleaseYear(int n){
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

    //TODO: In danh muc sach cua tac gia X
    public void printBookof(String author){
        try{
            System.out.print("Books of " + author + ": ");
            for(Book book:Task3.books) {
                if(book == null)
                    break;
                if(book.getAuthor().equals(author)) {
                    System.out.print(book.getName() + "\t");
                }
            }
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e + "asdsadad");
        }
    }

    //TODO: In danh muc sach xuat ban sau nam X
    public void printBookafter(int year){
        try{
            for(Book book:Task3.books) {
                if(book == null)
                    break;
                if(book.getReleaseYear() > year) {
                    System.out.println("Name: " + book.getName() +"\nAuthor: " + book.getAuthor());
                }
            }
        }
        catch (Exception e){
            System.out.println(e+"aaaaa");
        }
    }

    //TODO: Xoa sach xuat ban truoc nam X ra khoi mang
    public void removeBookBefore(int year){
        for(int i=0;i<Task3.books.length;i++) {
            if(Task3.books[i] == null)
                break;
            if(Task3.books[i].getReleaseYear() < year){
                for(int j=i ;j<Task3.books.length -1;j++){
                    Task3.books[j] = Task3.books[j+1];
                }
                i--;
            }
        }
    }

}

class Friend{
    //TODO: khai bao thuoc tinh cho class Books
    private String name = null;
    private String number= null;
    private String email = null;

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
            System.out.println(name + "'s contact: ");
            for(Friend friend: Task3.friends){
                if(friend == null)
                    break;
                if(friend.getName().equals(name))
                    System.out.println(friend.getEmail()+"\t" + friend.getNumber());
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

    //TODO: Unfriend cac doi tuong co thuoc tinh giong A
    public void unfriend(Friend A){
        try {
            for(int i=0;i<Task3.friends.length;i++) {
                if(Task3.friends[i] == null)
                    break;
                if(     Task3.friends[i].getEmail().equals(A.getEmail())
                        &&Task3.friends[i].getNumber().equals(A.getNumber())
                        &&Task3.friends[i].getName().equals(A.getName())   )
                {
                    for(int j=i ;j<Task3.friends.length -1;j++){
                        Task3.friends[j] = Task3.friends[j+1];
                    }
                    i--;
                }
            }

        }
        catch(Exception e){
            System.out.println("Exception con cac: " +e);
        }

    }

    //TODO: Kiem tra doi tuong co thuoc tinh giong friend A da xuat hien trong mang
    public boolean appeared(){
        try {
            for(int i=0;i<Task3.friends.length;i++) {
                if(Task3.friends[i] == null)
                    break;
                if(Task3.friends[i].getEmail().equals(this.email) &&
                        Task3.friends[i].getName().equals(this.name) &&
                        Task3.friends[i].getNumber().equals(this.number)){
                    return true;
                }
            }
            return false;
        }
        catch(Exception e){
            System.out.println("Exception: " +e);
            return false;
        }
    }

}

class Phone{
    //TODO: khai bao thuoc tinh cho class Phone
    private String brand = "";
    private int price = -1;
    private int screensize = -1;

    //TODO: getter, setter cho cac thuoc tinh
    public String getBrand(){
        try{
            if(brand!= null){
                return brand;
            }
            else {
                System.out.println("Set brand first.");
                return null;
            }
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public int getPrice(){
        try{
            if(price >= 0){
                return price;
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

    public int getScreensize(){
        try{
            if(screensize >= 0){
                return screensize;
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

    public void setBrand(String n){
        try{
            brand = n;
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void setPrice(int n){
        try{
            if(n>0)
                price = n;
            else
                System.out.println("Inappropriate price.");
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void setScreensize(int n){
        try{
            if(n>0)
                screensize = n;
            else
                System.out.println("Inappropriate screen size.");
        }
        catch(NullPointerException | IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Re-enter argument");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    //TODO: tra ve Phone co gia re nhat
    public Phone LowestPrice(){
        try {
            if(Task3.phones[0] != null) {
                Phone cheapest = Task3.phones[0];
                for (Phone phone : Task3.phones) {
                    if(phone == null)
                        break;
                    if (phone.getPrice() < cheapest.getPrice())
                        cheapest = phone;
                }
                return cheapest;
            }
            return new Phone();
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    //TODO: in ra Phone brand, gia re hon hoac bang input
    public void PhoneList(String brand, int price) {
        try {
            for (Phone phone : Task3.phones) {
                if(phone == null)
                    break;
                if(phone.getBrand().equals(brand)&& phone.price <= price)
                    System.out.println(phone.brand + " " + phone.price + " " + phone.screensize);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //TODO: tra ve so luong Phone brand = input
    public int PhoneBrand(String brand){
        try {
            int count = 0;
            for (Phone phone : Task3.phones) {
                if(phone == null)
                    break;
                if(phone.getBrand().equals(brand))
                    count++;
            }
            return count;

        }
        catch (Exception e){
            System.out.println(e);
            return -1;
        }
    }
}
