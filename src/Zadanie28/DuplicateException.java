package Zadanie28;

public class DuplicateException extends BadArticleIDException {
    DuplicateException(int id){
        super("Istnieje już artykuł o Id: " + id + "!");
    }
}
