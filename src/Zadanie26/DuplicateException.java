package Zadanie26;

public class DuplicateException extends BadArticleIDException {
    DuplicateException(){
        super("Istnieje już artykuł o takim Id!");
    }
}
