package test;


import Zadanie16.Article;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test16 {

    Article article = new Article(1, "Matma dla opornych", 69.69, "Bardzo pomocna książka");

    @Test
    public void testId(){
        article.setId(2);
        Assert.assertEquals(article.getId(),2);
    }
    @Test
    public void testName(){
        article.setName("cos");
        Assert.assertEquals(article.getName(),"cos");
    }
    @Test
    public void testPrice(){
        article.setPrice(2.0);
        Assert.assertEquals(article.getPrice(),2d);
    }
    @Test
    public void testDescription(){
        article.setDescription("nic");
        Assert.assertEquals(article.getDescription(),"nic");
    }
}
