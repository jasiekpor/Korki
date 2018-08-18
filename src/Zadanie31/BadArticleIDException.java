package Zadanie31;

public class BadArticleIDException extends RuntimeException{
    BadArticleIDException(String message){
        super(message);
    }
    BadArticleIDException(int id) {
        super("Id: "+ id +" is lower than 0!");
    }
}
