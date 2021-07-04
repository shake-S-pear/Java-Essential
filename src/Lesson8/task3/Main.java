package Lesson8.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Price [] arrayOfPrices = new Price[2];
        String nameOfProduct;
        String nameOfStore;
        String whatStore;
        float priceOfProduct;

        for (int i = 0; i < arrayOfPrices.length; i++) {
            int n = i + 1;
            System.out.println("Enter the name of " + n + " product: ");
            Scanner in1 = new Scanner(System.in);
            nameOfProduct = in1.next();

            System.out.println("Enter the name of " + n + " store: ");
            Scanner in2 = new Scanner(System.in);
            nameOfStore = in2.next();

            System.out.println("Enter the price of " + n + " product: ");
            Scanner in3 = new Scanner(System.in);
            priceOfProduct = in3.nextFloat();

            arrayOfPrices[i] = new Price(nameOfProduct, nameOfStore, priceOfProduct);
        }

        System.out.println("- - - - - - - - - - - - - - -");

        for (Price someProduct : arrayOfPrices){
            System.out.println(someProduct.getNameOfProduct() + " " + someProduct.getNameOfStore() + " " + someProduct.getPriceOfProduct());
        }

        System.out.println("- - - - - - - - - - - - - - -");

        Arrays.sort(arrayOfPrices, new SortByNameOfStore());

        System.out.println("Sorted array by store: ");

        for (Price someProduct : arrayOfPrices){
            System.out.println(someProduct.getNameOfProduct() + " " + someProduct.getNameOfStore() + " " + someProduct.getPriceOfProduct());
        }

        System.out.println("- - - - - - - - - - - - - - -");

        System.out.println("Which store's products are interesting for you? Please, enter the name of this store: ");
        Scanner in4 = new Scanner(System.in);
        whatStore = in4.next();

        try {
            int counter = 0;

            for (int i = 0; i < arrayOfPrices.length; i++) {

                if (arrayOfPrices[i].nameOfStore.equals(whatStore)) {
                    System.out.println("In " + whatStore + " you can buy these products: ");
                    System.out.println(arrayOfPrices[i].getNameOfProduct());
                    counter++;
                }
            }

            if (counter == 0){
                throw new StoreException();
            }

        } catch (StoreException storeException){
            storeException.method();
        }

        System.out.println("- - - - - - - - - - - - - - -");

    }

}