package homeworkweek8;

import java.util.Scanner;
public class ArmstrongNumber10 {
    private static Scanner sc;

    public static void main(String[] args) {
        arms();
    }
    public static void arms(){
        int Number, Temp, Reminder, Times = 0;
        double Sum = 0;
        sc = new Scanner(System.in);
        System.out.println("\n Please Enter number to Check : ");
        Number = sc.nextInt();

        //Helps to prevent altering the original value
        Temp = Number;
        while (Temp != 0) {
            Times = Times + 1;

            Temp = Temp / 10;

        }

        Temp = Number;
        while( Temp > 0)  {
            Reminder = Temp %10;
            Sum = Sum + Math.pow(Reminder, Times);
            Temp = Temp /10;
        }
        System.out.format("  Sum of entered is = "+ Sum);

        if (Sum == Number) {
            System.out.format(Number +"  is a Armstrong");
        }
        else {
            System.out.format(Number +"  is a  not Armstrong");
        }
    }
}