package Zadanie23;

import java.util.Date;

public class Shop {
    private int[] productsQuantities = new int[10];
    private Downloadable downloadable;

    public Shop(int[] productsQuantities) {
        int length = this.productsQuantities.length;
        if (this.productsQuantities.length > productsQuantities.length) {
            length = productsQuantities.length;
        }
        for (int i =0;i < length;i++){
            this.productsQuantities[i] = productsQuantities[i];
        }
    }

    public Downloadable getDownloadable() {
        return downloadable;
    }

    public void setDownloadable(Downloadable downloadable) {
        this.downloadable = downloadable;
    }

    public class Order{
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

        public void accept() throws Exception {
            for (int i = 0; i < productsQuantities.length;i++){
                if (quantities[i] > productsQuantities[i]){
                    throw new Exception("Not enough products in store!");
                }
                productsQuantities[i] -= quantities[i];
            }
        }
    }
}
