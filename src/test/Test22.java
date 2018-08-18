package test;

import Zadanie22.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class Test22 {

    private static Shop shop;

    @Before
    public void reset(){
        int[] productsQuantities = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shop = new Shop(productsQuantities);
    }

    @Test
    public void test1() throws Exception {
        int[] productsQuantitiesInOrder = {0, 0, 0, 0, 2, 0, 1, 0, 0, 10};
        Shop.Order order = shop.new Order(productsQuantitiesInOrder, new Date());
        order.accept();

        assertThat(shop.getProductsQuantities(), is(new int[] {1, 2, 3, 4, 3, 6, 6, 8, 9, 0}));
    }

    @Test(expected = Exception.class)
    public void test2() throws Exception {
        int[] productsQuantitiesInOrder = {5, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Shop.Order order = shop.new Order(productsQuantitiesInOrder, new Date());
        order.accept();
    }
}
