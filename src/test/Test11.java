package test;

import Zadanie11.OrderStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Zadanie11.Main.showStatus;

public class Test11 {

    @Test
    public void testInProgress(){
        Assert.assertEquals(showStatus(OrderStatus.InProgress), "Pilne");
    }

    @Test
    public void testReturned(){
        Assert.assertEquals(showStatus(OrderStatus.Returned), "Kontakt!");
    }

    @Test
    public void testNew(){
        Assert.assertEquals(showStatus(OrderStatus.New), OrderStatus.New.toString());
    }

    @Test
    public void testPending(){
        Assert.assertEquals(showStatus(OrderStatus.Pending), OrderStatus.Pending.toString());
    }

    @Test
    public void testSent(){
        Assert.assertEquals(showStatus(OrderStatus.Sent), OrderStatus.Sent.toString());
    }
}
