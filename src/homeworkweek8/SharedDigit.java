package homeworkweek8;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
//set range by using if satement
        if (a <= 10 || a >= 99 || b <= 10 || b >= 99) {
            return false;
        }
        int leftA = a / 10;
        int leftB = b / 10;
        int rightA = a % 10;
        int rightB = b % 10;
        boolean ans = leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));//true
        System.out.println(hasSharedDigit(123, 3221));//false
        System.out.println(hasSharedDigit(9, 99));//false
        System.out.println(hasSharedDigit(15, 55));//true

    }

}



