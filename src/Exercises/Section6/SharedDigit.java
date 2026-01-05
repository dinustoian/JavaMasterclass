package Exercises.Section6;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int a, int b){

        if (a < 10 || a > 99 || b < 10 || b > 99){
            return false;
        }

        int aLastDigit;
        int bLastDigit;

        for (int i = a; i > 0; i /= 10) {

            aLastDigit = i % 10;

            for (int j = b; j > 0; j /= 10){

                bLastDigit = j % 10;

                if (aLastDigit == bLastDigit) {
                    return true;
                }

            }
        }

        return false;
    }

}
