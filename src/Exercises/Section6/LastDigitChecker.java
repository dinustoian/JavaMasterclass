package Exercises.Section6;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));
    }

    public static boolean hasSameLastDigit (int a, int b, int c){

        if (!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }

        int aLastDigit = a % 10;
        int bLastDigit = b % 10;
        int cLastDigit = c % 10;

        return (aLastDigit == bLastDigit) || (aLastDigit == cLastDigit) || (bLastDigit == cLastDigit);

    }

    public static boolean isValid (int number) {
        return number >= 10 && number <= 1000;
    }

}
