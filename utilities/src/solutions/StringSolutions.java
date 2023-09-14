package solutions;

public class StringSolutions {
    public static void main(String[] args) {
        String str = "Yes, you are a Yankee. ";
        System.out.println("'y' counter:");
        System.out.println(yCharCounter(str));
        char c = 'a';
        System.out.println("Char counter:");
        System.out.println(anyCharCounter(str, c));

        int pieces = 2;
        System.out.println("String repeater:");
        System.out.println(stringRepeater(str, pieces));

        System.out.println();
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("Two string are equal checker:");
        System.out.println(isEqualsString(str1, str2));

        String customerAccount = "12345678-12345678";
        System.out.println("Bank account checker:");
        System.out.println(bankAccountChecker(customerAccount));

        String plate = "ASD-123";
        System.out.println("Plate number checker:");
        System.out.println(isPlateNumber(plate));

        String ipV4="123.12.1.123";
        System.out.println("IPV4 IP adress:");
        boolean isIPv4 = ipV4Checker(ipV4);
        System.out.println(isIPv4);
    }

    private static boolean ipV4Checker(String ipV4) {
         return ipV4.matches("(\\d{1,3}\\.){3}\\d{1,3}");
    }

    private static int yCharCounter(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('y' == str.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }

    static boolean isPlateNumber(String plate) {
        boolean isPlateNumber = false;
        if (plate.matches("[A-Z]{3}-\\d{3}")) {
            return true;
        }
        return isPlateNumber;
    }

    static boolean bankAccountChecker(String customerAccount) {
        boolean isBankAccount;
        isBankAccount = customerAccount.matches("\\d{8}-\\d{8}(-\\d{8})?");
        return isBankAccount;
    }

    static boolean isEqualsString(String str1, String str2) {

        if (str2.length() == str1.length()) {
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    static String stringRepeater(String str, int pieces) {
        String string;
        string = str.repeat(pieces);
        return string;
    }

    static int anyCharCounter(String str, char c) {

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
