package Zadanie11;

public class Main {
    public static void main(String[] args) {
        for (OrderStatus status : OrderStatus.values()){
            System.out.println(showStatus(status));
        }
    }

    public static String showStatus(OrderStatus status) {
        return status.getValue();
    }
}