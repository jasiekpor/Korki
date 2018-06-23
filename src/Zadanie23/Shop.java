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
