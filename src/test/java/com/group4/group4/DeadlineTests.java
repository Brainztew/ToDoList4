package com.group4.group4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.GregorianCalendar;

public class DeadlineTests {
    @Test
    public void isDateNullTest() {
        assertFalse(Deadline.isDateNull(null));
        assertTrue(Deadline.isDateNull(new GregorianCalendar()));
    }

    @Test
    public void isDatePassedTest() {
        assertFalse(Deadline.isDatePassed(new GregorianCalendar(2023, 12, 2)));
        assertTrue(Deadline.isDatePassed(new GregorianCalendar(2023, 10, 1)));
    }

    @Test
    public void isDeadlinePassedTest() {
        // Deadline-datum.
        GregorianCalendar deadlineDate = new GregorianCalendar(2023, 12, 2);
        // Datum just nu.
        GregorianCalendar nowDate = new GregorianCalendar();
        // Datum innan deadline.
        GregorianCalendar beforeDate = new GregorianCalendar(2023, 11, 30);
        // Datum efter deadline.
        GregorianCalendar afterDate = new GregorianCalendar(2023, 12, 4);

        assertTrue(Deadline.isDeadlinePassed(deadlineDate, nowDate));
        assertTrue(Deadline.isDeadlinePassed(deadlineDate, beforeDate));
        assertFalse(Deadline.isDeadlinePassed(deadlineDate, afterDate));
    }
}
