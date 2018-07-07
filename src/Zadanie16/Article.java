package Zadanie16;

public class Article {
    private static int counter;
    private int id;
    private String name;
    private double price;
    private String description;

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

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Article.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        printChange();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        printChange();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        printChange();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        printChange();
    }

    private void printChange(){
        System.out.println("Zmieniono wartość pola");
    }
}

class Main{
    public static void main(String[] args) {
        Article article = new Article(1, "Matma dla opornych", 69.69, "Bardzo pomocna książka");
        article.setId(2);
    }
}
