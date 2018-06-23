package Zadanie26;

public class WrongArgumentException extends RuntimeException {
    WrongArgumentException(){
        super("Błąd przetwarzania ciągu znaków");
    }
}
