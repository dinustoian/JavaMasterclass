package Exercises.Section6;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (217));
        System.out.println(getLargestPrime (0));
        System.out.println(getLargestPrime (45));
        System.out.println(getLargestPrime (-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int n = number;
        int largestPrime = -1;

        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
        }

        for (int factor = 3; factor * factor <= n; factor += 2) {
            while (n % factor == 0) {
                largestPrime = factor;
                n /= factor;
            }
        }

        if (n > 1) {
            largestPrime = n;
        }

        return largestPrime;
    }


}
