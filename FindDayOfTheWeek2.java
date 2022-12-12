public class FindDayOfTheWeek2 {


    private static int convertYear(int year){
        int lastTwoNumber = year % 100;
        int yearCode = lastTwoNumber / 12 + lastTwoNumber % 12 + (lastTwoNumber % 12) / 4;
        return yearCode;
    }

    private static boolean isLeapYear(int year){
        return year % 4 == 0;
    }

    private static int convertMonth(int month){
//Месяц  | 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 | 11 | 12 |
//Индекс | 6  | 2  | 2  | 5  | 0  | 3  | 5  | 1  | 4  | 6  | 2  | 4  |

        switch(month){
            case 1:
            case 10:
                return 6;
            case 2:
            case 3:
            case 11:
                return 2;
            case 4:
            case 7:
                return 5;
            case 5:
                return 0;
            case 6:
                return 3;
            case 8:
                return 1;
            case 9:
            case 12:
                return 4;
            default:
                return -1;
        }
    }

    private static String dayOfWeek(int sum){
        switch(sum){
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
            case 0:
                return "SUNDAY";
            default:
                return "Error - dayOfWeek = " + sum;
        }
    }

    public static String findDay(int month, int day, int year) {
        int convertedYear = convertYear(year);
        int convertedMonth = convertMonth(month);
//        if(isLeapYear(year) && month < 3){
//            convertedYear -= 1;
//        }
        int sum = (day + convertedMonth + convertedYear) % 7;
        System.out.print("Sum = " + sum + ": ");
        return dayOfWeek(sum);
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2999)); // should be monday

        System.out.println(findDay(7, 29, 2999));

        System.out.println(findDay(7, 22, 2999));

        System.out.println(findDay(7, 15, 2999));
        System.out.println(findDay(7, 8, 2999));
        System.out.println(findDay(7, 1, 2999));
        System.out.println(findDay(6, 24, 2999));

//        System.out.println(findDay(7, 22, 2999));
//        System.out.println(findDay(7, 22, 2999));
//        System.out.println(findDay(7, 22, 2999));
//        System.out.println(findDay(7, 22, 2999));
//        System.out.println(findDay(7, 22, 2999));


//
//        System.out.println(findDay(12, 18, 2022));
//        System.out.println(findDay(12, 19, 2022));
//        System.out.println(findDay(12, 20, 2022));
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
