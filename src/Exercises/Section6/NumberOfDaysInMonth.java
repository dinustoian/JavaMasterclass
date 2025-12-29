package Exercises.Section6;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,1990));
    }

    public static boolean isLeapYear (int year){
        if (year < 1 || year > 9999){
            return false;
        } else {

            if (year % 4 == 0){
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else {
                    return true;
                }
            } else {
                return false;
            }

        }
    }

    public static int getDaysInMonth (int month, int year){
        int daysInMonth;
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31;
                case 2 -> daysInMonth = isLeapYear(year) ? 29 : 28;
                default -> daysInMonth = 30;
            }
        }
        return daysInMonth;
    }

}
