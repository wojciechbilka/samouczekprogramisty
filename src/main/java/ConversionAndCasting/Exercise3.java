package ConversionAndCasting;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    // Napisz program, który skończy się wyjątkiem spowodowanym błędem podczas boxingu/unboxingu.

    public static void main(String[] args) {
        System.out.println("Unboxing excepion:");
        try {
            ArrayList<?> list = new ArrayList<>();
            ArrayList<? super Object> listOfObjectSubtypes = new ArrayList<>();
            ArrayList listOfObjects = new ArrayList();
            ArrayList<String> listOfStrings = new ArrayList<String>();

            Object test = new Object();

            listOfObjectSubtypes.add("sds");
            listOfObjects.add(new Object());
            listOfStrings.add("asd");
            listOfStrings = (ArrayList<String>) listOfObjects;
            listOfStrings.get(0).length();



        } catch (ClassCastException e) {
            System.out.println("Wrong casting may be dangerous!");
            e.printStackTrace();
        }
    }
}
