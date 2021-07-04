package Lesson8.task3;

import java.util.Comparator;

public class Price {

    String nameOfProduct;
    String nameOfStore;
    float priceOfProduct;

    public Price(String nameOfProduct, String nameOfStore, float priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.nameOfStore = nameOfStore;
        this.priceOfProduct = priceOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getNameOfStore() {
        return nameOfStore;
    }

    public float getPriceOfProduct() {
        return priceOfProduct;
    }
}

class SortByNameOfStore implements Comparator<Price>
{
    public int compare(Price a, Price b)
    {
        return a.nameOfStore.compareTo(b.nameOfStore);
    }
}

class StoreException extends Exception {
    public void method() {
        System.out.println("Such a store is not in this array.");
    }
}
