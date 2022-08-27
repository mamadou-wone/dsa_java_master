package helpdesk;

public class Main {

    public static void main(String[] args) {
        getDigits(158946);
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
