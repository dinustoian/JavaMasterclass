package Exercises.Section5;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(
                areEqualByThreeDecimalPlaces(-3.1756, -3.175) + " " +
                areEqualByThreeDecimalPlaces(3.175, 3.176) + " " +
                areEqualByThreeDecimalPlaces(3.0, 3.0) + " " +
                areEqualByThreeDecimalPlaces(-3.123, 3.123) + " "
        );
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){
        // Convert both numbers to int -> 3 decimals
        int convertedFirstNumber = (int) (firstNumber * 1000);
        int convertedSecondNumber = (int) (secondNumber * 1000);

        return convertedFirstNumber == convertedSecondNumber;
    }

}
