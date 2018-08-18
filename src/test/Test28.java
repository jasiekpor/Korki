package test;

import Zadanie28.Article;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class Test28 {

    @Test
    public void test1(){
        ByteArrayInputStream in = new ByteArrayInputStream("my book:2.3:1:Janek".getBytes());
        System.setIn(in);
        Article article = Article.scanArticleCode();
        Assert.assertEquals(article.getId(),1);
        Assert.assertEquals(article.getName(),"my book");
        Assert.assertEquals(article.getPrice(),2.3,1e-15);
        Assert.assertEquals(article.getDescription(),"Janek");
        System.setIn(System.in);
    }
}
