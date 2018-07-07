package test;

import Zadanie20.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test20 {

    @Test
    public void test(){
        Assert.assertEquals(new Employee().getAuthorization().getClass(), Boolean.class);
    }
}
