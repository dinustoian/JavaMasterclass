package Exercises.Section6;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {

                boolean border = (row == 1) || (row == number) || (col == 1) || (col == number);
                boolean mainDiagonal = (row == col);
                boolean secondDiagonal = (col == (number - row + 1));

                if (border || mainDiagonal || secondDiagonal) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



}
