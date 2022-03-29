package homeworkweek8;
//

public class FirstLastDigitSum7 {
    public static void main (String [] args) {

        System.out.println(FirstLastDigitSum7.sumFirstAndLastDigit(252));
        System.out.println(FirstLastDigitSum7.sumFirstAndLastDigit(257));
        System.out.println(FirstLastDigitSum7.sumFirstAndLastDigit(0));
        System.out.println(FirstLastDigitSum7.sumFirstAndLastDigit(5));
        System.out.println(FirstLastDigitSum7.sumFirstAndLastDigit(-10));



    }

    public static int sumFirstAndLastDigit(int number) {


        int lastDigit = 0;
        if(number >= 0){
            lastDigit = number % 10;

            while (number > 9){
                number = number / 10;
            }

            System.out.println("First Number " + number + " Last Number " + lastDigit + " Total = " + (number + lastDigit));
            return 0;
        } else
            System.out.println(" since the parameter is negative and needs to be positive");
          return  -1;



    }


}
