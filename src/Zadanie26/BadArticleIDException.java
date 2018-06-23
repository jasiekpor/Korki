package Zadanie26;

public class BadArticleIDException extends RuntimeException{
    BadArticleIDException(String message){
        super(message);
    }
    BadArticleIDException() {
        super("Id can not be lower than 0!");
    }
}
