package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Zadanie14.Article;

public class Test14 {

    @Test
    public void testCounter(){
        new Article(1, "Matma dla opornych", 69.69, "Bardzo pomocna książka");
        new Article();
        Assert.assertEquals(Article.counter,2);
    }
}
