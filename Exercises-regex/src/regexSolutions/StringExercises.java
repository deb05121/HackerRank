package regexSolutions;

public class StringExercises {
    public StringExercises() {
    }

    public static void main(String[] args) {
        String strEan13 = "1023456789876";
        System.out.println(isValidEan13Code(strEan13));

        String itPhoneNr = "+393123456789";
        System.out.println(isItValidPhoneNr(itPhoneNr));

        String text = "hElLo";
        System.out.println(isWorldOrHello(text));

        String specialCode = "abcQWaB93*,;-:.";
        System.out.println(isSpecialCode(specialCode));
    }

    public static boolean isSpecialCode(String specialCode) {
        if (specialCode.length() == 15) {
            String subStrFirst = specialCode.substring(0, 3);
            //System.out.println(subStrFirst);
            for (int i = 0; i < subStrFirst.length(); i++) {
                if (subStrFirst.charAt(i) > 47 && subStrFirst.charAt(i) < 58) {
                    return false;
                }
            }
            String subStrSecond = specialCode.substring(3, 5);
            //System.out.println(subStrSecond);
            for (int i = 0; i < 2; i++) {
                if (subStrSecond.charAt(i) < 65 || subStrSecond.charAt(i) > 90) {
                    return false;
                }
            }
            String subStrThird = specialCode.substring(5, 7);
            //System.out.println(subStrThird);
            for (int i = 0; i < 2; i++) {
                if (subStrThird.charAt(i) < 65 || (subStrThird.charAt(i) > 90 && subStrThird.charAt(i) < 97) || subStrThird.charAt(i) > 122) {
                    return false;
                }
            }
            String subStrFourth = specialCode.substring(7, 8);
            //System.out.println(subStrFourth);
            int i = 0;
            if (subStrFourth.charAt(i) < 48 || subStrFourth.charAt(i) > 57) {
                return false;
            }

            String subStrFifth = specialCode.substring(8, 9);
            //System.out.println(subStrFifth);
            for (i = 0; i < 1; i++) {
                if (subStrFifth.charAt(i) < 49 || subStrFifth.charAt(i) > 53) {
                    return false;
                }
            }
            //System.out.println(specialCode.charAt(14));
            return specialCode.charAt(14) == '.';
        }
        return false;
    }

    public static boolean isWorldOrHello(String text) {

        return text.equalsIgnoreCase("hello") || text.equalsIgnoreCase("world");
    }

    public static boolean isItValidPhoneNr(String itPhoneNr) {
        if (itPhoneNr.length() == 13 || itPhoneNr.length() == 14) {
            String substrFront = itPhoneNr.substring(0, 4);

            if (substrFront.equals("+393")) {

                char c;
                String substrEnd = itPhoneNr.substring(4);

                for (int i = 0; i < substrEnd.length(); i++) {
                    c = substrEnd.charAt(i);
                    if (c < 48 || c > 57) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isValidEan13Code(String strEan13) {
        if (strEan13.length() != 13) {
            return false;
        }
        for (int i = 0; i < strEan13.length(); i++) {
            char c = strEan13.charAt(i);
            if (c < 48 || c > 57) {
                return false;
            }
        }
        return true;
    }

}
