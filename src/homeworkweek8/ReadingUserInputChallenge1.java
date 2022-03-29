package homeworkweek8;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers
 * Use hasNextInt() method from the scanner to check if the user entered  an int value
 * if hasNextInt() returns false, print the message "Invalid number", continue reading until you have read 10 numbers
 * <p>
 * Before the user enter each number, print the message "Enter number #X:" where X represent the count 1, 2, 3 ...
 */

public class ReadingUserInputChallenge1 {
    public static void main(String[] args) {
        sub();
    }

    public static void sub() {
        System.out.print("Please enter number of submition : ");


        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        int count = 1;
        int sum = 0;

        while (count <= num) {
            System.out.println("Enter number #" + count);

            boolean validateNumber = scanner.hasNextInt();
            if (validateNumber) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);
        scanner.close();
    }

}