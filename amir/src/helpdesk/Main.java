package helpdesk;

public class Main {

    public static void main(String[] args) {
        char[] character = {'a', 'e', 'i', 'o', 'u', 'y'};
        String chain = "prendre son temps";
        String result = "";
        for (int i = 0; i < chain.length(); i++) {

         //   System.out.println(chain.charAt(i));
            for (char c : character) {
                if (chain.charAt(i) == c) {
                    char t = chain.charAt(i);
                    t = '#';
                    result += t;
                   // result = "";
                }
            }
            result += chain.charAt(i);
        }
        System.out.println(result);
    //    getDigits(158946);
    //    System.out.println((int) ('A'));
//        System.out.println(toLower("Ws5NE"));
//        System.out.println(toUpper("wone472"));
    }

    public static String toUpper(String chain){
        String chainToUpper = "";
        char character;
        for (int i = 0; i < chain.length(); i++) {
            character = chain.charAt(i);
            if (character >= 'a' && character <= 'z'){
                character = (char)(character - 'a' + 'A');
            }
            chainToUpper += character;
        }
        return chainToUpper;
    }

    public static String toLower(String chain){
        String chainToLower = "";
        char character;
        for (int i = 0; i < chain.length(); i++) {
            character = chain.charAt(i);
            if (character >= 'A' && character <= 'Z'){
                character = (char)(character - 'A' + 'a');
            }
            chainToLower += character;
        }
        return chainToLower;
    }

    public static void getDigits(int number){
        int digit, sum = 0;
        if (number != 0){
            digit = number % 10;
            sum += digit;
            number = (int) number / 10;
            System.out.println("Digit:  " +digit);
            getDigits(number);
        }
//        while (number != 0){
//            digit = number % 10;
//            sum += digit;
//            number = (int) number / 10;
//            System.out.println("Digit:  " +digit);
//        }
    //    System.out.println("\nSum: " + sum);
    }



}
