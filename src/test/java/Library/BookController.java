package Library;

import java.util.ArrayList;

public class BookController {

    public static String addedBook;
    public static String removedBook;
    public static int bookCount;
    public static int bookID;

    public BookController(){
        this.addedBook=addedBook;
        this.removedBook=removedBook;
        this.bookCount=bookCount;
        this.bookID=bookID;
    }

    public static ArrayList<Integer> books = new ArrayList<Integer>();

    public void addBook(){

        books.add(bookID);
    }
    public void updateBook(){

        books.addAll(books);
        books.get(bookID);
        books.remove(bookID);

    }
    public void deleteBook(){

        books.remove(bookID);
    }
    public void getAllBook(){

        books.get(bookCount);
    }

    public static class Main{
        public static void main(String[] args){

            Book book = new Book();
        }
    }


}

