package homeworkweek8;

import java.util.Scanner;

// Calculating Maximum two numbers in Java
public class MinAndMaxInputChallenge2 {
    public static void main(String[] args) {
        minmax();

    }
    public static void minmax() {
        Scanner obj = new Scanner(System.in);
        boolean a,b;
        System.out.println("Enter two numbers:");
        a = obj.hasNextInt();
        b = obj.hasNextInt();
        while (a&&b){
            int num1=obj.nextInt();
            int num2=obj.nextInt();
            if (num1>num2) {
                System.out.println("Maximum number: " + num1);
                System.out.println("Minimum number: " + num2);
            } else {
                System.out.println("Minimum number: " + num1);
                System.out.println("Maximum number: " + num2);
            }
        }
        System.out.println("Please enter valid input number");
        //break;


        //obj.close();
    }}