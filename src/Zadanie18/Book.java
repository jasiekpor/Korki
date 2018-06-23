package Zadanie18;

import java.util.Date;

public class Book extends Article {
    private String author;
    private Date releaseDate;

    public Book(){
    }

    public Book(String author, Date releaseDate){
        super();
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "author='" + author + '\'' +
                ", releaseDate=" + releaseDate;
    }
}
