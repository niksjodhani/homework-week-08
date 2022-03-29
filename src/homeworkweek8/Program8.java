package homeworkweek8;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Program8 obj = new Program8();
        obj.logic();
    }

    public void logic() {

        int i, j, n;
        System.out.println("enter number of row==>");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("");
            for (j = 1; j <= i; j++) {
                System.out.print("@" + " ");
            }

        }

    }
}
