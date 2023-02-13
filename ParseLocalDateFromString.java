import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ParseLocalDateFromString {
    public static void main(String[] args) {
        String stringDate1 = "01.12.2023";
        String stringDate2 = "2022-01-25";
        String stringDate3 = "2022.01.24";
        String stringDate4 = "20-10-2023";
        var dates = new ArrayList<String>();
        dates.add(stringDate1);
        dates.add(stringDate2);
        dates.add(stringDate3);
        dates.add(stringDate4);
        for (String s : dates) {
            s = s.replaceAll("-", ".");
            LocalDate localDate = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            System.out.println(localDate);
//            if(s.matches("\\d{4}\\.\\d{2}\\.\\d{2}")){
//                System.out.println("4");
//                LocalDate localDate = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
//                System.out.println(localDate);
//            } else {
//                System.out.println(2);
//                LocalDate localDate = LocalDate.parse(s.replaceAll("-", "."), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//                System.out.println(localDate);
//            }


        }
    }
}
