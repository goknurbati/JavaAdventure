package Library;

public class Main {

    public static void main(String[] args){
        Book book1=new Book(1,"asd","asd","asd","asd");
        Book book2=new Book(2,"asd","asd","asd","asd");
        Book book3=new Book(3,"asd","asd","asd","asd");
        Book book4=new Book(4,"asd","asd","asd","asd");

        BookController controller=new BookController();
        controller.addBook(book1);
        controller.addBook(book2);
        controller.addBook(book3);
        controller.addBook(book4);
    }

}


