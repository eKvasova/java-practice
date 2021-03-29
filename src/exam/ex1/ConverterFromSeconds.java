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

        String minutes = " минут";
        String hoursSecondLine = " часов";
        String hoursThirdLine = " часов";
        String days = " суток";
        String seconds = " секунд";
        String weeks = " недель";

        if (((remainingSec < 10) || (remainingSec > 20)) &&
                ((remainingMinutes == 1) || (remainingMinutes % 10 == 1))) {
            minutes = " минута";
        } else if (((remainingMinutes < 10) || (remainingMinutes > 20)) &&
                ((remainingMinutes % 10 == 2) || (remainingMinutes % 10 == 3)
                        || (remainingMinutes % 10 == 4))) {
            minutes = " минуты";
        }
        if (((hour < 10) || (hour > 20)) && ((hour == 1) || (hour % 10 == 1))) {
            hoursSecondLine = " час";
        } else if (((hour < 10) || (hour > 20)) &&
                ((hour % 10 == 2) || (hour % 10 == 3) || (hour % 10 == 4))) {
            hoursSecondLine = " часа";
        }
        if (((remainingHours < 10) || (remainingHours > 20)) &&
                ((remainingHours == 1) || (remainingHours % 10 == 1))) {
            hoursThirdLine = " час";
        } else if (((remainingHours < 10) || (remainingHours > 20)) &&
                ((remainingHours % 10 == 2) || (remainingHours % 10 == 3)
                        || (remainingHours % 10 == 4))) {
            hoursThirdLine = " часа";
        }
        if (remainingDays == 1) {
            days = " сутки";
        }
        if (((remainingSec < 10) || (remainingSec > 20)) && ((remainingSec == 1)
                || (remainingSec % 10 == 1))) {
            seconds = " секунда";
        } else if ( ((remainingSec < 10) || (remainingSec > 20)) && ((remainingSec % 10 == 2) || (remainingSec % 10 == 3) || (remainingSec % 10 == 4)
            )) {
            seconds = " секунды";
        }
        if (((week < 10) || (week > 20)) &&
                ((week == 1) || (week % 10 == 1))) {
            weeks = " неделя";
        } else if (((week < 10) || (week > 20)) &&
                ((week % 10 == 2) || (week % 10 == 3) || (week % 10 == 4))) {
            weeks = " недели";
        }
        return sec +
                "\n"
                + hour + hoursSecondLine + " " + remainingMinutes + minutes + " " + remainingSec + seconds +
                "\n"
                + week + weeks + " " + remainingDays + days + " " + remainingHours + hoursThirdLine + " "
                + remainingMinutes + minutes + " " + remainingSec + seconds;
    }
}
