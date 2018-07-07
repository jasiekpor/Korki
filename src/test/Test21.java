package test;

import Zadanie21.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test21 {

    @Test
    public void test(){
        Record record = new Record("MP3", 15);
        Assert.assertEquals(record.nextPacket(),new byte[0]);
    }
}
