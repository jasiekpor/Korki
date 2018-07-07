package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Zadanie10.Main.*;

public class Test10 {

    int[][] liczby = {{1},{2}};
    int[][] jedenZero = {{1},{0}};

    @Test
    public void testDodawanie(){
        int[] wynik = doMath(liczby, new char[]{'+'});
        Assert.assertEquals(wynik.length, liczby[0].length);
        Assert.assertEquals(wynik[0],3);
    }

    @Test
    public void testOdejmowanie(){
        int[] wynik = doMath(liczby, new char[]{'-'});
        Assert.assertEquals(wynik.length, liczby[0].length);
        Assert.assertEquals(wynik[0],-1);
    }

    @Test
    public void testMnozenie(){
        int[] wynik = doMath(liczby, new char[]{'*'});
        Assert.assertEquals(wynik.length, liczby[0].length);
        Assert.assertEquals(wynik[0],2);
    }

    @Test
    public void testDzielenie(){
        int[] wynik = doMath(liczby, new char[]{'/'});
        Assert.assertEquals(wynik.length, liczby[0].length);
        Assert.assertEquals(wynik[0],0);
    }

    @Test
    public void testX(){
        int[] wynik = doMath(liczby, new char[]{'x'});
        Assert.assertEquals(wynik.length, liczby[0].length);
        Assert.assertEquals(wynik[0],3);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDzieleniePrzez0(){
        int[] wynik = doMath(jedenZero, new char[]{'/'});
    }
}
