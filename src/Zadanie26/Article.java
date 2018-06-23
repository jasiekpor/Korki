package Zadanie26;

import java.util.ArrayList;
import java.util.List;

public /*final*/ class Article {
    private static int counter;
    private int id;
    private String name;
    private double price;
    private String description;

    private static List<Article> articles = new ArrayList<>();

    Article(){
        counter++;
        articles.add(this);
    }

    Article(int id, String name, double price, String description){
        this.id = id;
        this.name = name;
        this.price = price;

        this.description = description;
        counter++;
        articles.add(this);
    }

    static Article scanArticleCode(String line) throws DuplicateException {
        String args[] = line.split(":");
        if (args.length != 4){
            throw new WrongArgumentException();
        }
        int id = Integer.parseInt(args[0]);

        if (id < 0){
            throw new BadArticleIDException();
        }

        for(Article a : articles){
            if (a.id == id){
                throw new DuplicateException();
            }
        }
        /*
        if (counter >= id){
            throw new DuplicateException();
        }
        */
        double price = Double.parseDouble(args[2]);

        return new Article(id, args[1], price, args[3]);
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

    protected void printChange(){
        System.out.println("Zmieniono wartość pola");
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'';
    }
}
