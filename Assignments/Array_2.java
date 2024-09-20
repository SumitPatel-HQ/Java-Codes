public class Tester {
    public static int[] findLeapYears(int year) {
        int[] leapYears = new int[15];
        int index = 0;

        // Check if the given year is a leap year and add it to the array if it is
        if (isLeapYear(year)) {
            leapYears[index++] = year;
        }

        // Find the next 15 leap years
        while (index < 15) {
            year++;
            if (isLeapYear(year)) {
                leapYears[index++] = year;
            }
        }

        return leapYears;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2000;
        int[] leapYears = findLeapYears(year);

        for (int leapYear : leapYears) {
            System.out.println(leapYear);
        }
    }
}
