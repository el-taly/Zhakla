package JAVA_PROJECT;

import java.util.*;

public class DZ15 {



    public static void main(String[] args) {

        List<HotDrinks> newList = new LinkedList<>();

        HotDrinkVendingMashine machine1 = new HotDrinkVendingMashine(newList);

        HotDrinks coffee = new HotDrinks("Americano", 30.0, 300, 70);
        HotDrinks blackTea = new HotDrinks("Earl grey", 35.0, 500, 85);

        newList.add(coffee);
        newList.add(blackTea);

        System.out.println(machine1.getProduct("Americano", 300, 70));
        System.out.println(machine1.getProduct("Earl grey", 500, 85));
    }
    }
    

