package Zadanie23;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int[] productsQuantities = {1,2,3,4,5,6,7,8,9,10};
        Shop shop = new Shop(productsQuantities);

        shop.setDownloadable(new Downloadable() {
            @Override
            public int getSize() {
                return 0;
            }

            @Override
            public String getFormat() {
                return null;
            }
        });

        int[] productsQuantitiesInOrder = {0,0,0,0,2,0,1,0,0,10};
        Shop.Order order = shop.new Order(productsQuantitiesInOrder, new Date());
        order.accept();
    }
}
