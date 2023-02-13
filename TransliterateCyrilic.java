import java.util.Map;

public class TransliterateCyrilic {

    public String convertCyrilic(String message){
        // String message should be uppercase
        String messageToUppercase = message.toUpperCase();
        Map<Character, Character> charMap = new CyrilicLatinCharMap().getCharMap();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < messageToUppercase.length(); i++) {
            if(charMap.containsKey(messageToUppercase.charAt(i))){
                builder.append(charMap.get(messageToUppercase.charAt(i)));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {

        TransliterateCyrilic test = new TransliterateCyrilic();
        String translited = test.convertCyrilic("Аманқұл Жұмағали Бегалыұлы");
        System.out.println(translited);

        String swiftFormat = String.format(
                "{1:F01ASIHKZ22AXXX0046000001}{2:I565CEDUKZKAXXXXN2}{4:" + "\n" +
                        ":16R:GENL" + "\n" +
                        ":20C::CORP//6487447" + "\n" +
                        ":20C::SEME//20230118All-1" + "\n" +
                        ":23G:NEWM" + "\n" +
                        ":22F::CAEV/CAEV/DSCL" + "\n" +
                        ":98A::PREP//20230118" + "\n" +
                        ":16R:LINK" + "\n" +
                        ":20C::RELA//164240" + "\n" +
                        ":16S:LINK" + "\n" +
                        ":16S:GENL" + "\n" +
                        ":16R:USECU" + "\n" +
                        ":16R:ACCTINFO" + "\n" +
                        ":97A::SAFE//1036500001" + "\n" +
                        ":93B::ELIG//UNIT/909141," + "\n" +
                        ":16S:ACCTINFO" + "\n" +
                        ":16S:USECU" + "\n" +
                        ":16R:BENODET" + "\n" +
                        ":95V::OWND//%s", translited
        );
        System.out.println(swiftFormat);
    }
}
