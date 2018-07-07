package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static zadanie8.Main.*;

public class Test8 {

    static String[] stringTab = {"2", "4", "3"};

    @Test
    public void testParsujTablice() {
        int[] intTab = {2, 4, 3};
        Assert.assertEquals(parsujTablice(stringTab), intTab);
    }

    @Test
    public void testStworzTablice() {
        String[][] stringMacierz =
                {{"0-0", "0-1"},
                        {"1-0", "1-1", "1-2", "1-3"},
                        {"2-0", "2-1", "2-2"}};

        String[][] tab = stworzTablice(parsujTablice(stringTab));

        Assert.assertEquals(tab.length,stringMacierz.length);
        for (int w = 0; w < tab.length; w++) {
            Assert.assertEquals(tab[w].length,stringMacierz[w].length);
            for (int k = 0; k < tab[w].length; k++) {
                Assert.assertEquals(tab[w][k],stringMacierz[w][k]);
            }
        }
    }
}
