package Zadanie11;

enum OrderStatus {
    New,
    Pending,
    InProgress,
    Sent,
    Returned,
}

public class Main {
    public static void main(String[] args) {
        for (OrderStatus status : OrderStatus.values()){
            showStatus(status);
        }
    }

    static void showStatus(OrderStatus status) {
        switch (status){
            case InProgress:
                System.out.println("Pilne!");
                break;
            case Returned:
                System.out.println("Kontakt!");
                break;
            default:
                System.out.println(status);
        }
    }
}