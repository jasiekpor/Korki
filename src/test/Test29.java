package test;

import Zadanie29.Article;
import org.junit.Assert;
import org.junit.Test;

public class Test29 {

    @Test
    public void test1(){
        Assert.assertTrue(Article.scanArticleCode("1:name:2.3:asdasd18-08-2018asdasd").isDateInDescription());
    }

    @Test
    public void test2(){
        Assert.assertFalse(Article.scanArticleCode("2:name:2.3:asdasdasdasd").isDateInDescription());
    }
}
