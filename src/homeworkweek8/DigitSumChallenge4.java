package homeworkweek8;

import java.util.Scanner;

public class DigitSumChallenge4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to find the sum of it's digits: ");
        int sum = sc.nextInt();
        int result = sumDigits(sum);
        System.out.println("The sum of the digits in " + sum + " is: " + result);
    }
    public static int sumDigits(int number) {
        //test to see if number is singular
        if (number < 10) {
            System.out.println("input is not valid number");
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int last_digit = number % 10;
            sum = sum + last_digit;
            number = number / 10;
        }
        return sum;
    }
}


