package Zadanie28;

public class WrongArgumentException extends RuntimeException {
    WrongArgumentException(){
        super("Błąd przetwarzania ciągu znaków");
    }
}
