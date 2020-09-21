public class NextDay {
    public static final int FIRST_DAY_AND_FIRST_MONTH = 1;

    public static String nextDayCalculator(int day, int month, int year) {
        int lastDay = getLastDay(month, year);

        if (day == lastDay) {
            if (month<12) {
                month++;
            }else {
                month = FIRST_DAY_AND_FIRST_MONTH;
                year++;
            }
            day = FIRST_DAY_AND_FIRST_MONTH;
        } else {
            day++;
        }
        String rs = day + "/" + month + "/" + year;
        return rs;
    }

    private static int getLastDay(int month, int year) {
        int lastDay;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDay = 31;
                break;
            case 2:
                lastDay = getLastDayOfFeb(year);
                break;
            default:
                lastDay = 30;
        }
        return lastDay;
    }

    private static int getLastDayOfFeb(int year) {
        int lastDay;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    lastDay = 29;
                } else {
                    lastDay = 28;
                }
            } else {
                lastDay = 29;
            }
        } else {
            lastDay = 28;
        }
        return lastDay;
    }
}
