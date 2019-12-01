package Library;

import java.util.ArrayList;

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

        ArrayList<Book> books=controller.getBooks();

        controller.updateBook(new Book(4,"python","asd","asd","asd"));

        controller.deleteBook(new Book(1,"asd","asd","asd","asd"));

        System.out.println(controller.getById(1).toString());
        /*for(int i=0;i<books.size();i++){
            System.out.println(books.get(i).getBookID());
            System.out.println(books.get(i).getBookName());
        }*/
    }

}


