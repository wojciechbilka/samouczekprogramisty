package BinaryNumbersTutorial;

import java.util.ArrayList;

public class BinaryNumbers {

   public static String convertDecimal(int decimal) {

       StringBuilder builder = new StringBuilder();

       if(decimal < 0) {
           decimal = Math.abs(decimal);
           System.out.println("Argument of converDecimal method was negative");
           throw new IllegalArgumentException();
       }
       else if(decimal == 0) {
           return "0";
       }

       while(decimal > 0) {
           builder.append(decimal%2);
           decimal /= 2;
       }
       return builder.reverse().toString();
   }

    public static String convertDecimal(double decimal) {

        StringBuilder builder = new StringBuilder();
        ArrayList<Double> fractionalList = new ArrayList<>();

        int decimalIntegers = (int) decimal;
        double decimalFractional = decimal - decimalIntegers;

        if(decimal < 0) {
            decimal = Math.abs(decimal);
            System.out.println("Argument of converDecimal method was negative");
            throw new IllegalArgumentException();
        }
        else if(decimal == 0) {
            return "0";
        }

        for(int i = 0; i < 100; i++) {
            fractionalList.add(decimalFractional);
            decimalFractional = round(decimalFractional * 2.0, 3);

            if(decimalFractional > 1) {
                builder.append("1");
                decimalFractional = round(decimalFractional - 1.0, 3);
            }
            else if(decimalFractional == 1) {
                builder.append("1");
                break;
            }
            else if(decimalFractional < 1) {
                builder.append("0");
            }

            if (fractionalList.contains(decimalFractional)) {
                builder.append(")");
                int index = fractionalList.indexOf(decimalFractional);
                builder.insert( index, "(");
                break;
            }
        }
        return convertDecimal(decimalIntegers) + "," + builder.toString();
    }

    private static double round(double value, int places) {

        if (places < 0) {
            throw new IllegalArgumentException();
        }
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

   public static void main(String args[]) {
       int exampleNumber = 3321;
       System.out.println("Are those two binary numbers the same? \n" + convertDecimal(exampleNumber) +
               "\n" + Integer.toBinaryString(exampleNumber));

       double exampleDoubleNumber = 0.1;
       System.out.println("\n" + convertDecimal(exampleDoubleNumber));

       ArrayList<Double> test = new ArrayList<>();

       double testDobule = 0.3123;
       System.out.println((testDobule % 1));

   }
}
