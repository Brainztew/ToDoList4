package com.group4.group4;

import java.util.GregorianCalendar;

public class Deadline {

    // Har ett passerat datum angivits?
    public static boolean isDatePassed(GregorianCalendar date) {
        return date.before(new GregorianCalendar());
    }

    // Har dagens datum angivits?
    public static boolean isDateToday(GregorianCalendar date) {
        return date.compareTo(new GregorianCalendar()) == 0;
    }

    // Har vi passerat vår deadline?
    public static boolean isDeadlinePassed(GregorianCalendar deadlineDate, GregorianCalendar date) {
        return deadlineDate.before(date);
    }
}
