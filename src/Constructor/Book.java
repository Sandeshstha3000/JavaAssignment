package Constructor;

public class Book {
    int pageNo = 55;
    public Book(){
        System.out.println("this is non parameterized constructor: ");
    }

    public Book(String name){
        System.out.println("this is parameterized constructor: " + name);
    }
    public void displayPage(){
        System.out.println("page number is " + pageNo);
    }

    public void displayPage(String name){
        System.out.println("page number is " + name);
    }
}

