import java.util.Scanner;

public class DateNumberFinder {
    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[2] = 29;
        }

        return day <= daysInMonth[month];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        sc.close();

        if (isValidDate(year, month, day)) {
            int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int dateNumber = day;

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                daysInMonth[2] = 29;
            }

            for (int i = 1; i < month; i++) {
                dateNumber += daysInMonth[i];
            }

            System.out.println("Date number: " + dateNumber);
        } else {
            System.out.println("Invalid date.");
        }
    }
}

