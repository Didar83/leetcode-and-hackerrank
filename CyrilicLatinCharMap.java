import java.util.HashMap;
import java.util.Map;

public class CyrilicLatinCharMap {
    private final Map<Character, Character> charMap = new HashMap<>();
    {
        charMap.put(' ', ' ');
        charMap.put('А', 'A');
        charMap.put('Б', 'B');
        charMap.put('В', 'V');
        charMap.put('Г', 'G');
        charMap.put('Д', 'D');
        charMap.put('Е', 'E');
        charMap.put('Ё', 'O');
        charMap.put('Ж', 'J');
        charMap.put('З', 'Z');
        charMap.put('И', 'I');
        charMap.put('Й', 'i');
        charMap.put('К', 'K');
        charMap.put('Л', 'L');
        charMap.put('М', 'M');
        charMap.put('Н', 'N');
        charMap.put('О', 'O');
        charMap.put('П', 'P');
        charMap.put('Р', 'R');
        charMap.put('С', 'S');
        charMap.put('Т', 'T');
        charMap.put('У', 'U');
        charMap.put('Ф', 'F');
        charMap.put('Х', 'H');
        charMap.put('Ц', 'C');
        charMap.put('Ч', 'c');
        charMap.put('Ш', 'Q');
        charMap.put('Щ', 'q');
        charMap.put('Ь', 'x');
        charMap.put('Ы', 'Y');
        charMap.put('Ъ', 'X');
        charMap.put('Э', 'e');
        charMap.put('Ю', 'u');
        charMap.put('Я', 'a');
        charMap.put('Ə', 'd');
        charMap.put('І', 'I');
        charMap.put('Ң', 'n');
        charMap.put('Ғ', 'f');
        charMap.put('Ү', 'v');
        charMap.put('Ұ', 't');
        charMap.put('Қ', 'k');
        charMap.put('Ө', 'p');
        charMap.put('h', 'h');
        charMap.put('\'', '\"');
        charMap.put('\"', '\"');
    }

    public Map<Character, Character> getCharMap() {
        return charMap;
    }

//    char[] abcLatin = {' ', 'A', 'B', 'V', 'G', 'D', 'E', 'O', 'J', 'Z', 'I', 'i', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'F', 'H', 'C', 'c', 'Q', 'q', 'x', 'Y', 'X', 'e', 'u', 'a', 'd', 'I', 'n', 'f', 'v', 't', 'k', 'p', 'h', '\"', '\"'};
//    char[] abcCyr = {' ', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ', 'Э', 'Ю', 'Я', 'Ə', 'І', 'Ң', 'Ғ', 'Ү', 'Ұ', 'Қ', 'Ө', 'h', '\'', '\"'};
//char[] abcLatin = {
//        ' ',
//        'A',
//        'B',
//        'V',
//        'G',
//        'D',
//        'E',
//        'O',
//        'J',
//        'Z',
//        'I',
//        'i',
//        'K',
//        'L',
//        'M',
//        'N',
//        'O',
//        'P',
//        'R',
//        'S',
//        'T',
//        'U',
//        'F',
//        'H',
//        'C',
//        'c',
//        'Q',
//        'q',
//        'x',
//        'Y',
//        'X',
//        'e',
//        'u',
//        'a',
//        'd',
//        'I',
//        'n',
//        'f',
//        'v',
//        't',
//        'k',
//        'p',
//        'h',
//        '\"',
//        '\"',
//};
//
//    char[] abcCyr = {
//            ' ',
//            'А',
//            'Б',
//            'В',
//            'Г',
//            'Д',
//            'Е',
//            'Ё',
//            'Ж',
//            'З',
//            'И',
//            'Й',
//            'К',
//            'Л',
//            'М',
//            'Н',
//            'О',
//            'П',
//            'Р',
//            'С',
//            'Т',
//            'У',
//            'Ф',
//            'Х',
//            'Ц',
//            'Ч',
//            'Ш',
//            'Щ',
//            'Ь',
//            'Ы',
//            'Ъ',
//            'Э',
//            'Ю',
//            'Я',
//            'Ə',
//            'І',
//            'Ң',
//            'Ғ',
//            'Ү',
//            'Ұ',
//            'Қ',
//            'Ө',
//            'h',
//            '\'',
//            '\"',
//    };
}
