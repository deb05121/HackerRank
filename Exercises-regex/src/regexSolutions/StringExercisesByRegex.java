package regexSolutions;

public class StringExercisesByRegex {
    public static void main(String[] args) {
        String strEan13 = "1023456789876";
        System.out.println(Ean13Checker(strEan13));


        String itPhoneNr = "+393123456789";
        System.out.println(itPhoneChecker(itPhoneNr));

        String text = "hello";
        System.out.println(textChecker(text));

        String specialCode = "abcQWaB93*,;-:.";
        System.out.println(specCodeChecker(specialCode));
    }

    public static boolean specCodeChecker(String specialCode) {
        return specialCode.matches("\\D{3}[A-Z]{2}[a-zA-Z]{2}\\d[1-5].{5}\\.");
    }

    public static boolean textChecker(String text) {
        return text.matches("([hH][eE][lL][lL][oO])|([wW][oO][rR][lL][dD])");
    }

    public static boolean itPhoneChecker(String itPhoneNr) {
        return itPhoneNr.matches("\\+393\\d{9}\\d?");
    }

    public static boolean Ean13Checker(String strEan13) {
        return strEan13.matches("\\d{13}");
    }
}
