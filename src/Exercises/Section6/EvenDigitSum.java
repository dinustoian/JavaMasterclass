package Exercises.Section6;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum (int number) {

        int lastDigit;
        int sumEven = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {

            lastDigit = number % 10;

            if (lastDigit % 2 == 0){
                sumEven += lastDigit;
            }

            number /= 10;
        }
        return sumEven;

    }
}
