package homeworkweek8;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {


        int i, j, r;
        System.out.println("Input number of rows (half of the diamond) : ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        for (i = 1; i <= r; i++) {
            System.out.print(" ");
            for (j = i; j <= i; j++)
                System.out.print(" ");
            for (j = i; j <= 2 * i - 1; j++)
                System.out.print(" *");
            System.out.println("");
            ;
        }

    }
}