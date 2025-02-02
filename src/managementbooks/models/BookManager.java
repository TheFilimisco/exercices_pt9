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
        books.add(book);
        System.out.println("Successful");
    }

    public Book getBookByTitle(String title){
        var newBook = new Book();
        for (Book book: books) {
            if (book.getTitle().equals(title)){
                newBook = book;
                break;
            } else {
                newBook = null;
            }
        }
        return newBook;
    }

    public Book getBookByAuthor(String author){
        var newBook = new Book();
        for (Book book: books) {
            if (book.getAuthor().equals(author)){
                newBook = book;
                break;
            } else {
                newBook = null;
            }
        }
        return newBook;
    }

    public void setBook(String searchBook, int newValue){
        if (getBookByAuthor(searchBook) != null){
            getBookByAuthor(searchBook).setRating(newValue);
            System.out.println("Successfully");
        } else if(getBookByTitle(searchBook) != null) {
            getBookByTitle(searchBook).setRating(newValue);
            System.out.println("Successfully");
        } else {
            System.out.println("Don't found");
        }
    }

    public void getAllBooksByRating(){
        books.sort(bookComparatorByRating.reversed());
        getAllBooks();
        books.sort(bookComparatorById);
    }

    public void getBooksByNumber(int numberGetBooks){

    }

    public ArrayList<Book> getBooksByMinRating(int minRating){
        var newBooks = new ArrayList<Book>();
        for (Book book: books){
            if (book.getRating() > minRating){
                newBooks.add(book);
            }
        }
        return newBooks;
    }

    public void deleteBook(int id){
        books.removeIf(book -> book.getId() == id);
        System.out.println("Successfully");
    }

    public Comparator<Book> bookComparatorByRating = Comparator.comparingInt(Book::getRating);
    public Comparator<Book> bookComparatorById = Comparator.comparingInt(Book::getId);

    public void getAllBooks(){
        for (Book book: books) System.out.println(book);
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "books=" + books +
                '}';
    }
}
