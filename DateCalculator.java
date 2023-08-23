import java.util.Scanner;

public class DateCalculator {

    public static String getMonthName(int month)
    {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return monthNames[month];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date number: ");
        int dateNumber = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        sc.close();

        // Array to store the number of days in each month
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
        {
            daysInMonth[2] = 29; // Adjust February days for leap year
        }

        int month = 1;
        while (dateNumber > daysInMonth[month])
        {
            dateNumber -= daysInMonth[month];
            month++;
        }

        System.out.println("Date: " + dateNumber + " " + getMonthName(month) + " " + year);
    }
}

