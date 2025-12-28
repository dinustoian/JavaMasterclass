package Exercises.Section5;

public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(
                isCatPlaying(true, 10) + " " +
                isCatPlaying(false, 36) + " " +
                isCatPlaying(false, 35)
        );
    }

    public static boolean isCatPlaying(boolean summer, int temperature){

        int maxTemperature = summer ? 45 : 35;
        return temperature >= 25 && temperature <= maxTemperature;
    }

}
