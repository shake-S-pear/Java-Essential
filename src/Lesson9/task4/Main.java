package Lesson9.task4;

public class Main {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor(15, 24);
        Monitor monitor2 = new Monitor(15, 24);
        Monitor monitor3 = new Monitor(45, 5);

        EthernetAdapter ethernetAdapter1 = new EthernetAdapter(123, "GHJ789");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter(321, "DFG001");
        EthernetAdapter ethernetAdapter3 = new EthernetAdapter(123, "GHJ789");

        System.out.println("Monitors 'equals': ");
        System.out.println(monitor1.equals(monitor2));
        System.out.println(monitor1.equals(monitor3));
        System.out.println(monitor2.equals(monitor3));
        System.out.println("- - - - - - - - - - - - - - ");

        System.out.println("Monitors 'hash code': ");
        System.out.println(monitor1.hashCode());
        System.out.println(monitor2.hashCode());
        System.out.println(monitor3.hashCode());
        System.out.println("- - - - - - - - - - - - - - ");

        System.out.println("Ethernet adapters 'equals': ");
        System.out.println(ethernetAdapter1.equals(ethernetAdapter2));
        System.out.println(ethernetAdapter1.equals(ethernetAdapter3));
        System.out.println(ethernetAdapter2.equals(ethernetAdapter3));
        System.out.println("- - - - - - - - - - - - - - ");

        System.out.println("Ethernet adapters 'hash code': ");
        System.out.println(ethernetAdapter1.hashCode());
        System.out.println(ethernetAdapter2.hashCode());
        System.out.println(ethernetAdapter3.hashCode());
        System.out.println("- - - - - - - - - - - - - - ");

    }
}
