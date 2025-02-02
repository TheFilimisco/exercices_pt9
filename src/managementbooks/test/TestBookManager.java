package managementbooks.test;

import managementbooks.models.Book;
import managementbooks.models.BookManager;

public class TestBookManager {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        System.out.println("===========add=========");
        bookManager.addBook(new Book("Alice'world","Idk",3));
        bookManager.addBook(new Book("Hombre tiza","Idasdask",5));
        bookManager.addBook(new Book("It","asdas",4));
        bookManager.addBook(new Book("A traves de mi ventana","uhusd",3));
        bookManager.addBook(new Book("Crepusculo","asffs",4));
        System.out.println("==========Show============");
        bookManager.getAllBooks();
        System.out.println("==============Get Book by Title==========");
        System.out.println(bookManager.getBookByTitle("Alice'world"));
        System.out.println(bookManager.getBookByTitle("Alice"));
        System.out.println("==============Get Book by Author==========");
        System.out.println(bookManager.getBookByAuthor("Idasdask"));
        System.out.println(bookManager.getBookByAuthor("a"));
        System.out.println("===================Set Value a Book==========");
        bookManager.setBook("It", 2);
        bookManager.getAllBooks();
        bookManager.setBook("ASDSADASD", 2);
        bookManager.getAllBooks();
        System.out.println("===================Order By Rating==========");
        bookManager.getAllBooksByRating();
        System.out.println("===================Get Books by Min Rating==========");
        System.out.println(bookManager.getBooksByMinRating(4));
        System.out.println("===================Delete Book==========");
        bookManager.deleteBook(1);
        bookManager.getAllBooks();



    }
}
