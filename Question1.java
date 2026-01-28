import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book(1, "Harry Potter","JK Rowling", 2004, 250));
        lib.addBook(new Book(2, "Revolution 2020","Chetan Bhagat", 2006, 200));
        lib.addBook(new Book(3, "The Notebook","Nicholas Sparks", 2001, 200));
        lib.addBook(new Book(4, "The Theory of Everything ","Stephen Hawking", 2002, 400));
        lib.addBook(new Book(5, "Two State ","Chetan Bhagat", 2005, 320));

        System.out.println("Books by Chetan Bhagat: ");
        lib.findBooksByAuthor("Chetan Bhagat").forEach(b -> System.out.println(b));

        System.out.println("\nBook after 2003: ");
        lib.findLatestBooks(2003).forEach(b -> System.out.println(b));

        System.out.println("\nBooks that passed the criteria: ");
        lib.findBooksbyComplexCriteria(2003, 250, "tan").forEach(b -> System.out.println(b));
    }
}

class Book{
    private int id,yearPublished,numberOfPages;
    private String title,author;

    public Book(int id, String title,String author,int yearPublished,int numberOfPages){
        this.id= id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }

    public String toString(){
        return "Book id: "+id+", title: "+title+", author: "+author+", yearPublished: "+yearPublished+", pages: "+numberOfPages;
    }
}

class Library{
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b){
        books.add(b);
    }

    public List<Book> findBooksByAuthor(String author){
        return books.stream()
        .filter(b->b.getAuthor().equals(author))
        .collect(Collectors.toList());
    }

    public List<Book> findLatestBooks(int yearThreshold){
        return books.stream()
        .filter(b->b.getYearPublished()>yearThreshold)
        .collect(Collectors.toList());
    }

    public List<Book> findBooksbyComplexCriteria(int year, int minPages, String authorSubstring){
        return books.stream()
        .filter(b->b.getYearPublished()>year)
        .filter(b->b.getNumberOfPages()>=minPages)
        .filter(b->b.getAuthor().toLowerCase().contains(authorSubstring.toLowerCase()))
        .collect(Collectors.toList());
    }
}