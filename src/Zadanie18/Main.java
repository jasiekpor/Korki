package Zadanie18;

import java.util.Date;

public class Main{
    public static void main(String[] args) {
        Article article = new Article(1, "Matma dla opornych", 69.69, "Bardzo pomocna książka");
        article.setId(2);
        System.out.println(article);
        Book book = new Book("Maja", new Date());
        System.out.println(book);

//        Book book2 = (Book) article;
        Article article2 = (Article) book;

//        System.out.println(book2);
        System.out.println(article2);

    }
}
