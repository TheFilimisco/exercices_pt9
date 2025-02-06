package managementbooks.models;

import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String author;
    private int rating;
    private static int counter = 0;

    public Book(String title, String author, int rating) {
        if (rating >= 0 && rating <=5){
            id = counter++;
            this.title = title;
            this.author = author;
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Please put right values");
        }

    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, rating);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                '}';
    }
    
}
