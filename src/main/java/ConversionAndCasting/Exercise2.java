package ConversionAndCasting;

import java.util.Scanner;

public class Exercise2 {
/*
    Napisz program pobierający od użytkownika dwie liczby całkowite. Wyświetl wynik ich dzielenia wraz z częścią ułamkową.
*/

    public static void main(String[] args) {
        System.out.println("Input numbers to divide.");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("A:");
            int valueA = Integer.parseInt(scanner.nextLine());
            System.out.print("B:");
            int valueB = Integer.parseInt(scanner.nextLine());
           /*
            REMEMBER When dividing Integers at least one argument need to be cast to double to get double result
            Example below shows that two integer arguments wont work for division!
            System.out.println(" A/B = " + (double) (valueA / valueB));
           */
           // It is possible to cast valueA only to double but it is more readable this way
            System.out.println(" A/B = " + (double) (valueA / valueB));
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong argument! It has o be Integer number");
            e.printStackTrace();
        }
    }

}
