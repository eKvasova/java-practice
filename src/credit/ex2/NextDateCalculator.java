package credit.ex2;

public class NextDateCalculator {

    public static void main(String[] args) {

        System.out.println(getNextDate(5,2,2019));
    }

    private static String getNextDate (int day, int month, int year) {

        int nextDay;
        int nextMonth;
        int nextYear;
        boolean leapYear;
        leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

        if ((day < 1) || (month < 1) || (year < 1) || (day > 31) || (month > 12)) {
            return "Invalid value";
        }
        if (!leapYear && (month == 2) && (day > 28)) {
            return "Invalid value";
        }
        if (leapYear && (month == 2) && (day > 29)) {
            return "Invalid value";
        }
        if ((day > 30) && ((month == 4) || (month == 6) || (month == 9) || (month == 11))) {
            return "Invalid value";
        }
        if ((day == 31) && ((month == 1) || (month == 3) || (month == 7) || (month == 8) || (month == 10))) {
                nextDay = 1;
                nextMonth = month + 1;
                nextYear = year;
        } else if ((day == 30) && ((month == 4) || (month == 6) || (month == 9) || (month == 11))) {
            nextDay = 1;
            nextMonth = month + 1;
            nextYear = year;
        }
        else if (leapYear && (month == 2) && (day == 29)) {
            nextDay = 1;
            nextMonth = month + 1;
            nextYear = year;
        } else if (!leapYear && (month == 2) && (day == 28)) {
            nextDay = 1;
            nextMonth = month + 1;
            nextYear = year;
        } else if ((month == 12) && (day == 31)) {
            nextDay = 1;
            nextYear = year + 1;
            nextMonth = 1;
        } else {
            nextDay = day + 1;
            nextYear = year;
            nextMonth = month;
        }
        return day + "\n" + month + "\n" + year + "\n" + nextDay + " " +  nextMonth + " " + nextYear;
    }
}
