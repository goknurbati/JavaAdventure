package Library;

import java.util.ArrayList;

public class BookController {

    String addedBook;
    String removedBook;
    int bookCount;
    int book;

    public BookController(String addedBook,String removedBook,int bookCount, int book){
        this.addedBook=addedBook;
        this.removedBook=removedBook;
        this.bookCount=bookCount;
        this.book=book;
    }

    public static ArrayList<Books> books = new ArrayList<Books>();

    public void addBook(){
        books.add(Books);
    }
    public void updateBook(){

    }
    public void deleteBook(){

    }
    public void getAllBook(){

    }

    public static void main(String[] args){

    }


}

