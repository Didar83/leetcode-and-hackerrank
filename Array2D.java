import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        String s = "joe ($3,004.50)";
        String b = s.replaceAll("[^0-9.]", "").replaceAll("\\.\\d{2}$", "");
        System.out.println(b);

//        String e1 = s.replaceAll("[^0-9.]", "");
//        System.out.println(e1);
//
//        System.out.println(e1.indexOf(".00"));
//
//        String e2 = e1.endsWith(".00") ? e1.substring(0, e1.indexOf(".00")) : e1;
//        System.out.println(e2);
//
//        String e3 = (s.endsWith("\\.\\d{2}$") ? s.substring(0, s.indexOf(".00")) : s).replaceAll("[^0-9.]", "");
//        System.out.println(e3);
//
//        String e4 = (s.endsWith(".00") ? s.substring(0, s.indexOf(".00")) : s).replaceAll("[^0-9]", "");
//        System.out.println(e4);

    }
}
