package project_chatgpt;

import java.util.Scanner;
public class SmithNumberCheck {

    // Function to calculate the sum of digits
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to calculate the sum of digits of prime factors
    public static int primeFactorDigitSum(int num) {
        int sum = 0;
        int factor = 2;
        while (num > 1) {
            if (num % factor == 0) {
                sum += digitSum(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        return sum;
    }

    // Function to check if a number is a Smith number
    public static boolean isSmithNumber(int num) {
        int originalSum = digitSum(num);
        int factorSum = primeFactorDigitSum(num);

        return originalSum == factorSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if (isSmithNumber(num)) {
            System.out.println(num + " is a Smith number.");
        } else {
            System.out.println(num + " is not a Smith number.");
        }
        sc.close();
    }
}
