package ConversionAndCasting;

import java.util.Scanner;
import java.lang.Double;

public class Exercise1 {
    public static double multiplyByPi(double value) {
        double result = value * Math.PI;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Input number to multiply by pi.");
        Scanner scanner = new Scanner(System.in);
        try {
            double value = Double.parseDouble(scanner.nextLine());
            System.out.println("Value multiplied by pi is: \n");
            System.out.println("Double type: " + multiplyByPi(value));
            System.out.println("Integer type: " + (int) multiplyByPi(value));
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong argument!");
            e.printStackTrace();
        }
    }
}
