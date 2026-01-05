package Exercises.Section6;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(192291));
    }

    public static boolean isPalindrome (int number){
        int reversed = 0;
        int i = number;

        while (i != 0){
            int lastDigit = i % 10;
            reversed = reversed * 10;
            reversed = (reversed + lastDigit);
            i = i / 10;
        }

        return reversed == number;
    }

}
