package Exercises.Section6;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit (823748379));
    }

    public static int sumFirstAndLastDigit  (int number){

        int firstDigit = 0;
        int lastDigit;

        if (number < 0){
            return -1;
        } else {
            lastDigit = number % 10;
            while (number > 0){
                if (number / 10 == 0){
                    firstDigit = number;
                    break;
                }
                number = number / 10;
            }

        }

        return firstDigit + lastDigit;
    }

}
