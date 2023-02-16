import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

    public String createContentForSwiftWithUploadMT565(List<UploadMT565> mt565List){
        StringBuilder sb = new StringBuilder();
        sb.append("{1:F01ASIHKZ22AXXX0046000001}{2:I565CEDUKZKAXXXXN2}{4:" + "\n" +
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
                ":16R:BENODET" + "\n");
        for(UploadMT565 unit : mt565List){
            sb.append(":95V::OWND//" + unit.getHolderName() + "\n");
            sb.append(unit.getInvestorId() + "," + unit.getCountry() + "\n");
            sb.append(unit.getInvestorType() + "\n");
            sb.append(":36B::OWND//UNIT/" + unit.getQuantity() + "," + "\n" + ":16S:BENODET" + "\n" + ":16R:BENODET" + "\n");
        }
        sb.append(":13A::CAON//UNS" + "\n" +
                ":22H::CAOP//OTHR" + "\n" +
                ":36B::QINS//UNIT/909141," + "\n" +
                ":70E::INST//PGNB/1/LAST" + "\n" +
                ":70E::INST//RECORD DATE 04.01.2023 00:00" + "\n" +
                " 00:00 'cASOV '" + "\n" +
                ":16S:CAINST" + "\n" +
                "-}");
        return sb.toString();
    }

    public static void main(String[] args) {

        TransliterateCyrilic test = new TransliterateCyrilic();

        UploadMT565 testUnit1 = new UploadMT565(1L, "T23-DO", "SALTANAT AkAN",
                "123456789123", "KZ", "DOM_IND", "KZ1C00001619", 103,
                LocalDate.of(2023, 2, 1), "UPLOADED", "Instance");
        UploadMT565 testUnit2 = new UploadMT565(2L, "T24-DO", "AMANktL JtMAfALI BEGALYtLY",
                "123456789123", "KZ", "DOM_IND", "KZ1C00001619", 103,
                LocalDate.of(2023, 2, 1), "UPLOADED", "Instance");
        List<UploadMT565> uploadMT565List = new ArrayList<>();
        uploadMT565List.add(testUnit1);
        uploadMT565List.add(testUnit2);
        String swiftMessage = test.createContentForSwiftWithUploadMT565(uploadMT565List);
        System.out.println(swiftMessage);



//        String translited = test.convertCyrilic("Аманқұл Жұмағали Бегалыұлы");
//
//
//        System.out.println(translited);
//
//        String swiftFormat = String.format(
//                "{1:F01ASIHKZ22AXXX0046000001}{2:I565CEDUKZKAXXXXN2}{4:" + "\n" +
//                        ":16R:GENL" + "\n" +
//                        ":20C::CORP//6487447" + "\n" +
//                        ":20C::SEME//20230118All-1" + "\n" +
//                        ":23G:NEWM" + "\n" +
//                        ":22F::CAEV/CAEV/DSCL" + "\n" +
//                        ":98A::PREP//20230118" + "\n" +
//                        ":16R:LINK" + "\n" +
//                        ":20C::RELA//164240" + "\n" +
//                        ":16S:LINK" + "\n" +
//                        ":16S:GENL" + "\n" +
//                        ":16R:USECU" + "\n" +
//                        ":16R:ACCTINFO" + "\n" +
//                        ":97A::SAFE//1036500001" + "\n" +
//                        ":93B::ELIG//UNIT/909141," + "\n" +
//                        ":16S:ACCTINFO" + "\n" +
//                        ":16S:USECU" + "\n" +
//                        ":16R:BENODET" + "\n" +
//                        ":95V::OWND//%s", translited
//        );
//        System.out.println(swiftFormat);
    }
}
