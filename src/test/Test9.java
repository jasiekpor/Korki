package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static zadanie9.Main.switchRowsOf;

public class Test9 {

    @Test
    public void testSwitchRowsOf() {
        int[][] tab = {{1, 1, 1}, {3, 3, 3}, {2, 2, 2}};
        int[][] intTab = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        switchRowsOf(intTab, 1, 2);
        Assert.assertEquals(intTab, tab);
    }
    @Test
    public void testSwitchRowsOf2() {
        int[][] tab = {{1, 1, 1}, {3, 3, 3}, {2, 2, 2}};
        int[][] intTab = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        switchRowsOf(intTab, 1, -1);
        Assert.assertNotEquals(intTab, tab);
    }
}
