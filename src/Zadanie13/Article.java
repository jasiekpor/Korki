package Zadanie13;

public class Article {
    int id;
    String name;
    double price;
    String description;

    Article(int id, String name, double price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public static void main(String[] args) {
        Article article = new Article(1, "Matma dla opornych", 69.69, "Bardzo pomocna książka");
        System.out.println(article.id);
        System.out.println(article.name);
        System.out.println(article.price);
        System.out.println(article.description);
    }
}
