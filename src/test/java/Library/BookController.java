package Library;

import java.util.ArrayList;

//iş yapan classım
public class BookController {

    private ArrayList<Book> books = new ArrayList<Book>();

   public int addBook(Book book){
       books.add(book);
       return book.getBookID();
   }
   public ArrayList<Book> getBooks(){
       return books;
   }

   public int updateBook(Book book){
        Book oldBook=getById(book.getBookID());
        oldBook.setBookName(book.getBookName());
        return book.getBookID();
   }

   public int deleteBook(Book book){
       books.remove(getById(1));
       return book.getBookID();
   }

   public Book getById(int id){
       for(int i=0;i<books.size();i++){
           if(books.get(i).getBookID()==id){
               return books.get(i);
           }
       }
       throw new RuntimeException();
   }


}

