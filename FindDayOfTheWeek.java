public class FindDayOfTheWeek {
    private static boolean isLeapYear(int year){
        return year % 4 == 0;
    }

    private static int convertMonth(int month){
        switch(month){
            case 1:
            case 10:
                return 1;
            case 5:
                return 2;
            case 8:
                return 3;
            case 2:
            case 3:
            case 11:
                return 4;
            case 6:
                return 5;
            case 12:
            case 9:
                return 6;
            case 4:
            case 7:
            default:
                return 0;
        }
    }

    private static int convertYear(int year){
        int lastTwoNumber = year % 100;
        int yearCode = (6 + lastTwoNumber + lastTwoNumber / 4) % 7;
        return yearCode;
    }

    private static String dayOfWeek(int sum){
        switch(sum){
            case 0:
                return "SATURDAY";
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
        }
        return "ERROR";
    }

    public static String findDay(int month, int day, int year) {
        int convertedMonth = convertMonth(month);
        int convertedYear = convertYear(year);
        if(isLeapYear(year) && month < 3){
            convertedYear -= 1;
        }
        int sum = (day + convertedMonth + convertedYear) % 7;
        return dayOfWeek(sum);
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2999));
//        System.out.println(findDay(2, 1, 2015));
//        System.out.println(findDay(3, 1, 2015));
//        System.out.println(findDay(4, 1, 2015));
//        System.out.println(findDay(5, 1, 2015));
//        System.out.println(findDay(6, 1, 2015));
//        System.out.println(findDay(7, 1, 2015));
//        System.out.println(findDay(8, 1, 2015));
//        System.out.println(findDay(9, 1, 2015));
//        System.out.println(findDay(10, 1, 2015));
//        System.out.println(findDay(11, 1, 2015));
//        System.out.println(findDay(12, 1, 2015));
    }
}
