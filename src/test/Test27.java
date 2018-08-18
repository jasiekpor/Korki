package test;


import org.junit.Test;
import zadanie27.Article;

public class Test27 {

    @Test(expected = AssertionError.class)
    public void test1(){
        Article.scanArticleCode("-1:Matematyka dla opornych:5.50:Janek");
    }

    @Test(expected = AssertionError.class)
    public void test2(){
        Article.scanArticleCode("1:Matematyka dla opornych:5.50:Janek");
        Article.scanArticleCode("1:Matematyka dla opornych:5.50:Janek");
    }
}
