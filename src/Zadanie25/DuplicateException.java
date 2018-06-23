package Zadanie25;

public class DuplicateException extends Exception {
    DuplicateException(){
        super("Istnieje już artykuł o takim Id!");
    }
}
