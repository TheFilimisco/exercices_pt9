package managementbooks.test;

import managementbooks.models.Book;
import managementbooks.models.BookManager;
import managementplayers.models.Player;
import managementplayers.models.PlayerManager;

import java.util.Scanner;

public class TestBookManager {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner input = new Scanner(System.in);

        bookManager.addBook(new Book("Alice'world","Idk",3));
        bookManager.addBook(new Book("Hombre tiza","Idasdask",5));
        bookManager.addBook(new Book("It","asdas",4));
        bookManager.addBook(new Book("A traves de mi ventana","uhusd",3));
        bookManager.addBook(new Book("Crepusculo","asffs",4));
        bookManager.addBook(new Book("Crepusculo2","asffs",4));

        var running = true;
        while (running){

            System.out.println("""
                    ==========================================
                    1. Add new Book
                    2. Show All Books
                    3. Get a Book by Title
                    4. Get a Book by Author
                    5. Updated a Book's rating
                    6. Get all Books by Rating
                    7. Get N books by Rating
                    8. Get all Books by Minimum Rating
                    9. Delete a Book by id
                    10. Leave
                    ==========================================
                    """);
            System.out.print("Put your option: ");
            var option = input.nextInt();
            switch (option){
                case 1:
                    input.nextLine();
                    System.out.println("===========Add new Book=============");
                    System.out.print("Enter book's name: ");
                    var newNameBook = input.nextLine();
                    System.out.print("Enter book's author: ");
                    var newAuthorBook = input.nextLine();
                    System.out.print("Enter book's rating: ");
                    var newRatingBook = input.nextInt();
                    bookManager.addBook(new Book(newNameBook,newAuthorBook,newRatingBook));
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("===========Show All Books=============");
                    bookManager.getAllBooks();
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("===========Get Book by Title=============");
                    System.out.print("Enter your title: ");
                    var inputTitle = input.nextLine();
                    bookManager.getBookByTitle(inputTitle);
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("===========Get Book by Author=============");
                    System.out.print("Enter your Author: ");
                    var inputAuthor = input.nextLine();
                    bookManager.getBooksByAuthor(inputAuthor);
                    break;
                case 5:
                    input.nextLine();
                    System.out.println("===========Update a Book's Rating=============");
                    System.out.print("Enter book's title: ");
                    var inputUpdateTitle = input.nextLine();
                    System.out.print("Enter new rating: ");
                    var inputUpdateRating = input.nextInt();
                    bookManager.setBook(inputUpdateTitle,inputUpdateRating);
                    break;
                case 6:
                    input.nextLine();
                    System.out.println("===========Get All Books by Ratings=============");
                    bookManager.getAllBooksByRating();
                    break;
                case 7:
                    System.out.println("===========Get N Books by Rating=============");
                    System.out.print("Enter N Books: ");
                    var inputNBooks = input.nextInt();
                    bookManager.getNBooksByRating(inputNBooks);
                    break;
                case 8:
                    System.out.println("===========Get all Books by Minimum Rating=============");
                    System.out.print("Enter Minimum Rating: ");
                    var inputMinRating = input.nextInt();
                    bookManager.getBooksByMinRating(inputMinRating);
                    break;
                case 9:
                    System.out.println("===========Delete a Book=============");
                    System.out.print("Put your book's id: ");
                    var inputDeleteBook = input.nextInt();
                    bookManager.deleteBook(inputDeleteBook);
                    break;
                case 10:
                    running = false;
                default:
                    System.out.println("Please do write right option!");
            }
        }



    }
}
