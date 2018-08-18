package test;

import Zadanie26.Article;
import Zadanie26.BadArticleIDException;
import Zadanie26.DuplicateException;
import org.junit.Test;

public class Test26 {

    @Test(expected = BadArticleIDException.class)
    public void test1() throws DuplicateException {
        Article.scanArticleCode("-1:Matematyka dla opornych:5.50:Janek");
    }

    @Test(expected = DuplicateException.class)
    public void test2() throws DuplicateException {
        Article.scanArticleCode("1:Matematyka dla opornych:5.50:Janek");
        Article.scanArticleCode("1:Matematyka dla opornych:5.50:Janek");
    }
}
