package Zadanie20;

public abstract class Person {
    private int id;
    private String name;
    private int counter;

    public Person(){
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Boolean getAuthorization();
}
