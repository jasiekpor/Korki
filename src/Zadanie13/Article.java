package Zadanie13;

public class Article {
    int id;
    String name;
    double price;
    String description;

    public static void main(String[] args) {
        Article article = new Article();
        article.id = 1;
        article.name = "Matma dla opornych";
        article.price = 69.69;
        article.description = "bardzo dobry artykol";

        System.out.println(article.id);
        System.out.println(article.name);
        System.out.println(article.price);
        System.out.println(article.description);
    }
}
