package regexSolutions;

public class StringExercisesByRegex {
    public StringExercisesByRegex() {
    }

    public static void main(String[] args) {
        String strEan13 = "1023456789876";
        System.out.println(isItValidEan13Code(strEan13));


        String itPhoneNr = "+39312345678";
        System.out.println(isItValidPhoneNumber(itPhoneNr));

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

    public static boolean isItValidPhoneNumber(String itPhoneNr) {
        return itPhoneNr.matches("\\+393\\d{8,9}");
    }

    public static boolean isItValidEan13Code(String strEan13) {
        return strEan13.matches("\\d{13}");
    }
}
