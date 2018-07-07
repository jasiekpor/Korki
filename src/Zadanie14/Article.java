package Zadanie14;

import Zadanie15.Order;

public class Article {
    public static int counter;
    int id;
    String name;
    double price;
    String description;

    public Article(){
        counter++;
    }

    public Article(int id, String name, double price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        counter++;
    }

    public static void main(String[] args) {
        new Article(1, "Matma dla opornych", 69.69, "Bardzo pomocna książka");
        new Article();
        System.out.println(Article.counter);
        new Order();
    }
}
