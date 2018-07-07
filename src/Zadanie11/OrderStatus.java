package Zadanie11;

public enum OrderStatus {
    New,
    Pending,
    InProgress("Pilne"),
    Sent,
    Returned("Kontakt!");

    private String message;

    OrderStatus(){}
    OrderStatus(String message){
        this.message = message;
    }

    public String getValue(){
        if (message == null){
            return this.toString();
        } else {
            return message;
        }
    }
}
