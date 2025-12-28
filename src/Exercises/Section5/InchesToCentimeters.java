package Exercises.Section5;

public class InchesToCentimeters {

    public static void main(String[] args) {
        System.out.println(
                convertToCentimeters(34, 23) + " " +
                convertToCentimeters(13456)
        );
    }

    public static double convertToCentimeters(int heightInches){
        return heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int remainingHeightInches){
        int feetToInches = heightFeet * 12;
        int totalInches = feetToInches + remainingHeightInches;

        return convertToCentimeters(totalInches);
    }



}
