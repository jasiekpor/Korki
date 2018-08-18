package test;
import Zadanie25.Article;
import Zadanie25.DuplicateException;
import Zadanie25.WrongArgumentException;
import org.junit.Test;
public class Test25 {

    @Test(expected = WrongArgumentException.class)
    public void test1() throws DuplicateException {
        Article.scanArticleCode(":::::");
    }

    @Test(expected = DuplicateException.class)
    public void test2() throws DuplicateException {
        Article.scanArticleCode("1:Matematyka dla opornych:5.50:Janek");
        Article.scanArticleCode("1:Matematyka dla opornych:5.50:Janek");
    }
}
