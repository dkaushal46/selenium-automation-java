import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 3) {
            if (a % 2 == 0) {
                System.out.println("The odd number before " + a + " is " + (a - 1));
                System.out.println("The even number before " + a + " is " + (a - 2));
            } else {
                System.out.println("The odd number before " + a + " is " + (a - 2));
                System.out.println("The even number before " + a + " is " + (a - 1));
            }
        } else if (a == 2) {
            System.out.println("The odd number before " + a + " is 1");
            System.out.println("The even number before " + a + " doesn't exist");
        } else if (a == 1) {
            System.out.println("The odd number before " + a + " doesn't exist");
            System.out.println("The even number before " + a + " doesn't exist");
        } else {
            System.out.println("The number is either 0 or below 0");
        }
    }
}
