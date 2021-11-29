package nl.novi.hallo.model;


import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    // atitributen

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    private String title;
    private String author;
    private String isbn;


    //constructor is niet nodig in dit geval. maar als je de mogelijkheid wilt hebben dat meerdere maar niet alle gegeven opgevraagd kunnen
    //worden dan moet je wel een constructor maken. Dan moet je sowieso een lege(de default), een volle en de contuctor die je wilt maken.


    //getter en setter


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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
