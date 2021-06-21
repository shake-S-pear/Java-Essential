package Lesson1.add_task;

public class AddressEnter {

    public static void main(String[] args) {

        Address myAddress = new Address ();

        myAddress.setCountry("Ukraine");
        myAddress.setIndex(12345);
        myAddress.setCity("Kyiv");
        myAddress.setStreet("Khreshchatyk");
        myAddress.setHouse(20);
        myAddress.setApartment(12);

        System.out.println("Country: " + myAddress.getCountry());
        System.out.println("Index: " + myAddress.getIndex());
        System.out.println("City: " + myAddress.getCity());
        System.out.println("Street: " + myAddress.getStreet());
        System.out.println("House: " + myAddress.getHouse());
        System.out.println("Apartment: " + myAddress.getApartment());

    }

}
