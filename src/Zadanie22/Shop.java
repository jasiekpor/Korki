package Zadanie22;

import java.util.Date;

public class Shop {
    private int[] productsQuantities = new int[10];

    public Shop(int[] productsQuantities) {
        int length = this.productsQuantities.length;
        if (this.productsQuantities.length > productsQuantities.length) {
            length = productsQuantities.length;
        }
        for (int i =0;i < length;i++){
            this.productsQuantities[i] = productsQuantities[i];
        }
    }

    class Order{
        int[] quantities = new int[10];
        Date date;

        public Order(int[] quantities, Date date) {
            int length = this.quantities.length;
            if (this.quantities.length > productsQuantities.length) {
                length = productsQuantities.length;
            }
            for (int i =0;i < length;i++){
                this.quantities[i] = quantities[i];
            }
            this.date = date;
        }

        void accept(){
            for (int i = 0; i < productsQuantities.length;i++){
                productsQuantities[i] -= quantities[i];
            }
        }
    }
}
