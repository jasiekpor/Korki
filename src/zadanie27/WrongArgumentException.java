package zadanie27;

public class WrongArgumentException extends RuntimeException {
    WrongArgumentException(){
        super("Błąd przetwarzania ciągu znaków");
    }
}
