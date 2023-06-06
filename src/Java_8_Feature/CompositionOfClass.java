package Java_8_Feature;

import java.util.ArrayList;
import java.util.List;

class Book{
    public String title;
    public String author;

    Book(String title,String author){
        this.title = title;
        this.author = author;
    }
}

class Library{
    private final List<Book> books;

    Library(List<Book> books){
        this.books = books;
    }
    public List<Book> getTotalBooksInLibrary(){
        return books;
    }
}

public class CompositionOfClass {

    public static void main(String[] args) {

        Book b1  =new Book("Understanding the universe","stephen hacking");
        Book b2  =new Book("Java Core Concpets","E.Balagurusamy");
        Book b3  =new Book("Prepration of OCA/OCP","Kathy Sierra");

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library = new Library(books);
        List<Book> bks = library.getTotalBooksInLibrary();

        for(Book bk: bks){
            System.out.println("Title :"+bk.title+" and "+" author by "+bk.author);
        }

    }

}
