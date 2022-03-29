package homeworkweek8;

import java.util.Scanner;

public class Triangle6 {


    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("");
            for (j = 1; j <= i; j++) {
                System.out.print("@" + "");


            }
        }
    }
}

