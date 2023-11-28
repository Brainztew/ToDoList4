package com.group4.group4;

import java.util.GregorianCalendar;

public class Deadline {

    // Har ett objekt verkligen skapats?
    public static boolean isDateNull(GregorianCalendar date) {
        return date != null;
    }

    // Har ett passerat datum angivits?
    public static boolean isDatePassed(GregorianCalendar date) {
        return date.before(new GregorianCalendar());
    }

    // Har vi passerat vår deadline?
    public static boolean isDeadlinePassed(GregorianCalendar deadlineDate, GregorianCalendar nowDate) {
        return deadlineDate.after(nowDate);
    }
}
