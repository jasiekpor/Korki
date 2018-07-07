package test;

import Zadanie18.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class Test18 {

    static Date date = new Date();
    static Book book = new Book("Maja", date);

    @Test
    public void testToString() {
        Assert.assertEquals(book.toString(), "id=0, name='null', price=0.0, description='null'author='Maja', releaseDate=" + date);
    }

    @Test
    public void testRzutowanie() {
        Article article = (Article) book;
        Assert.assertEquals(article.toString(), "id=0, name='null', price=0.0, description='null'author='Maja', releaseDate=" + date);
    }

}
