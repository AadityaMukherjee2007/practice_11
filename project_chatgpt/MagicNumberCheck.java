package project_chatgpt;
import java.util.Scanner;
public class MagicNumberCheck {

    public static boolean isMagicNumber(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (isMagicNumber(num)) {
            System.out.println(num + " is a magic number.");
        } else {
            System.out.println(num + " is not a magic number.");
        }
    }
}