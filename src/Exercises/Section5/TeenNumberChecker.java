package Exercises.Section5;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(
                hasTeen(9, 99, 19) + " " +
                hasTeen(23, 15, 42) + " " +
                hasTeen(22, 23, 34)
        );

        System.out.println(
                isTeen(9) + " " +
                isTeen(13)
        );
    }

    public static boolean hasTeen (int firstNumber, int secondNumber, int thirdNumber){

        return  isTeen(firstNumber) ||
                isTeen(secondNumber) ||
                isTeen(thirdNumber);

    }

    public static boolean isTeen (int firstNumber){

        return ((firstNumber >= 13 && firstNumber <= 19));

    }

}
