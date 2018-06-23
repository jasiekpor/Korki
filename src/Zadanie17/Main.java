package Zadanie17;

public class Main{
    public static void main(String[] args) {
        Article article = new Article(1, "Matma dla opornych", 69.69, "Bardzo pomocna książka");
        article.setId(2);
        System.out.println(article);
        Book book = new Book();
        System.out.println(book.getAuthor());
        System.out.println(book.getReleaseDate());
        System.out.println(book);
    }
}
