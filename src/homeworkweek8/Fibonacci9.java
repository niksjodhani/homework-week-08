package homeworkweek8;

import java.util.Scanner;

public class Fibonacci9 {

    public static void main(String[] args) {
        System.out.println("Fibonacci Series Upto Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstTerm = 0, secondTerm = 1;
        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}

