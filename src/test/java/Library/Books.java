package Library;

public class Books {
    int bookID;
    String bookName;
    String author;
    String type;
    String publisher;

    public Books(int bookID, String bookname, String author, String type, String bookName){
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

    public static void main(String[] args){
      Books books=new Books(1,"bookname","author","type","publisher");
        System.out.println(books.toString());
    }
}
