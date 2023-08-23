package project_chatgpt;

import java.util.Scanner;
public class HappyNumberCheck {

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        } else if (n == 4) {
            return false;
        } else {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return isHappy(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (isHappy(num)) {
            System.out.println(num + " is a happy number.");
        } else {
            System.out.println(num + " is not a happy number.");
        }
    }
}
