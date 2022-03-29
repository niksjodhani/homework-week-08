package homeworkweek8;

import java.util.Scanner;

public class SumOfEvenDigits11 {
    public static void getEvenDigitSum(int number) {

        if (number > 0) {
            int n1, n2 = 0;
            while (number != 0) {
                n1 = number % 10;
                if ((n1 % 2) == 0)
                    n2 = n2 + n1;
                number /= 10;
            }
            System.out.println("sum of even digits: " + n2);

        }else         System.out.println("-1");
    }
    public static void main(String[] args) {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-97);
    }
}








