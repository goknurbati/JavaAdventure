package Library;

public class Book {
    int bookID;
    String bookName;
    String author;
    String type;
    String publisher;

    public Book(){
        this.bookID=bookID;
        this.bookName=bookName;
        this.author= author;
        this.type=type;
        this.publisher=publisher;
    }
    public int getBookID(){
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPublisher() {

        return publisher;
    }
    public void setPublisher(String publisher) {

        this.publisher = publisher;
    }

    public static class Main{
        public static void main(String[] args){

            BookController controller = new BookController();
            controller.addBook();
            controller.getAllBook();
            controller.deleteBook();
            controller.updateBook();
        }
    }
}
