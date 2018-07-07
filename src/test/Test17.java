package test;

import Zadanie17.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test17 {

    @Test
    public void test(){
        Book book = new Book();
        Assert.assertNull(book.getAuthor());
        Assert.assertNull(book.getReleaseDate());
        Assert.assertEquals(book.toString(),"Article{id=0, name='null', price=0.0, description='null'}");
    }
}
