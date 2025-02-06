package managementbooks.models;

import managementplayers.models.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager(ArrayList<Book> books) {
        this.books = books;
    }
    public BookManager() {
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        if (books.contains(book)){
            System.out.println("This book exist!");
            return;
        }
        books.add(book);
        System.out.println("Successful");
    }

    public Book getBookByTitle(String title){
        for (Book book: books){
            if (book.getTitle().equals(title)){
                System.out.println(book);
                return book;
            }
        }
        System.out.println("Don't founded!");
        return null;
    }

    public void getBooksByAuthor(String author){
        var authorBooks = new ArrayList<Book>();
        for (Book book: books){
            if (book.getAuthor().equals(author)){
                authorBooks.add(book);
            }
        }
        authorBooks.forEach(System.out::println);
    }

    public void setBook(String searchBook, int newValue){
        var verified = getBookByTitle(searchBook);
        if (verified != null){
            verified.setRating(newValue);
            System.out.println(verified);
            return;
        }
        System.out.println("Don't possible");
    }

    public void getAllBooksByRating(){
        books.sort(bookComparatorByRating.reversed());
        books.forEach(System.out::println);
    }

    public void getNBooksByRating(int numberGetBooks){
        books.sort(bookComparatorByRating.reversed());
        var subList = books.subList(0,numberGetBooks);
        subList.forEach(System.out::println);

    }

    public ArrayList<Book> getBooksByMinRating(int minRating){
        var newBooks = new ArrayList<Book>();
        for (Book book: books){
            if (book.getRating() > minRating){
                newBooks.add(book);
            }
        }
        newBooks.forEach(System.out::println);
        return newBooks;
    }

    public void deleteBook(int id){
        var verified = books.removeIf(book -> book.getId() == id);
        var message = verified ? "Deleted: " + id : "Don't founded";
        System.out.println(message);
    }

    public Comparator<Book> bookComparatorByRating = Comparator.comparingInt(Book::getRating);
    public Comparator<Book> bookComparatorById = Comparator.comparingInt(Book::getId);

    public void getAllBooks(){
        books.sort(bookComparatorById);
        books.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "books=" + books +
                '}';
    }
}
