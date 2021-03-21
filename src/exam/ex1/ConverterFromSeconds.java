package exam.ex1;

public class ConverterFromSeconds {

    public static void main(String[] args) {

        System.out.println(getWeeksFromSeconds(2258521L));
    }

    public static String getWeeksFromSeconds (long sec) {

        if (sec <= 0) {
            return "Invalid value. Please enter sec > 0";
        }

        long min = sec / 60L;
        long remainingSec = sec % 60L;
        long hour = min / 60L;
        long remainingMinutes = min % 60L;
        long day = hour / 24L;
        long remainingHours = hour % 24L;
        long week = day / 7L;
        long remainingDays = day % 7L;

        String minutes = " minute";
        String hoursSecondLine = " hour";
        String hoursThirdLine = " hour";
        String days = " day";
        String seconds = " second";
        String weeks = " week";

        if (remainingMinutes > 1) {
            minutes = minutes.concat("s");
        }
        if (hour > 1) {
            hoursSecondLine = hoursSecondLine.concat("s");
        }
        if (remainingHours > 1) {
            hoursThirdLine = hoursThirdLine.concat("s");
        }
        if (remainingDays > 1) {
            days = days.concat("s");
        }
        if (remainingSec > 1) {
            seconds = seconds.concat("s");
        }
        if (week > 1) {
            weeks = weeks.concat("s");
        }
        return sec +
                "\n"
                + hour + hoursSecondLine + " " + remainingMinutes + minutes + " " + remainingSec + seconds +
                "\n"
                + week + weeks + " " + remainingDays + days + " " + remainingHours + hoursThirdLine + " "
                + remainingMinutes + minutes + " " + remainingSec + seconds;
    }
}
