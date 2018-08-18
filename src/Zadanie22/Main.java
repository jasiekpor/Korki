package Zadanie22;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] productsQuantities = {1,2,3,4,5,6,7,8,9,10};
        Shop shop = new Shop(productsQuantities);

        int[] productsQuantitiesInOrder = {0,0,0,0,2,0,1,0,0,10};
        Shop.Order order = shop.new Order(productsQuantitiesInOrder, new Date());
        order.accept();
    }
}
