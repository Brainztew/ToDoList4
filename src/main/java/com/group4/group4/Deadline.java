package com.group4.group4;

import java.util.GregorianCalendar;

public class Deadline {
    public static boolean isDeadlinePassed(GregorianCalendar deadlineDate, GregorianCalendar nowDate) {
        return deadlineDate.after(nowDate);
    }
}
