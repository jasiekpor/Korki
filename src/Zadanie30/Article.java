package Zadanie30;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public /*final*/ class Article {
    private static int counter;
    private int id;
    private String name;
    private double price;
    private String description;

    private static List<Article> articles = new ArrayList<>();

    Article() {
        counter++;
        articles.add(this);
    }

    Article(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;

        this.description = description;
        counter++;
        articles.add(this);
    }

    public static Article scanArticleCode(String line) throws WrongArgumentException {
        String args[] = line.split(":");
        if (args.length != 4) {
            throw new WrongArgumentException();
        }
        int id = Integer.parseInt(args[0]);
        assert (id > 0);

        for (Article article : articles) {
            assert (article.id != id);
        }
        double price = Double.parseDouble(args[2]);

        return new Article(id, args[1], price, args[3]);
    }

    public static Article scanArticleCode() throws WrongArgumentException {
        System.out.println("Enter article code");
        Scanner scanner = new Scanner(System.in);
        String args[] = scanner.nextLine().split(":");
        if (args.length != 4) {
            throw new WrongArgumentException();
        }

        int id = 0;
        double price = 0.0;
        String name = null;
        String description = null;
        for (String s : args) {
            try {
                id = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                try {
                    price = Double.parseDouble(s);
                }catch (NumberFormatException f){
                    if (name == null) {
                        name = s;
                    } else {
                        description = s;
                    }
                }
            }
        }
        assert (id > 0);
        for (Article article : articles) {
            assert (article.id != id);
        }

        return new Article(id, name, price, description);
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

    protected void printChange() {
        System.out.println("Zmieniono wartość pola");
    }

    public Boolean isDateInDescription(){
        return description.matches(".*((0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-\\d{4}).*");
    }

    @Override
    public String toString() {
        StringBuilder sbuf = new StringBuilder();
        Formatter fmt = new Formatter(sbuf);
        fmt.format("|%-20s|", "Name");
        fmt.format("|%20s|%n", name);
        fmt.format("|%-20s|", "Description");
        fmt.format("|%20s|%n", description);
        fmt.format("|%-20s|", "Price");
        fmt.format("|%20.2f|%n", price);
        fmt.format("|%-20s|", "Id");
        fmt.format("|%20d|%n", id);
        return sbuf.toString();
    }
}
