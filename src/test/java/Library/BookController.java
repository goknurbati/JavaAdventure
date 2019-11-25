package Library;

import java.util.ArrayList;

//iş yapan classım
public class BookController {

    private ArrayList<Book> books = new ArrayList<Book>();

   public int addBook(Book book){
       books.add(book);
       return book.getBookID();
   }

}

