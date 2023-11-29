package com.group4.group4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.GregorianCalendar;

public class DeadlineTests {

    @Test
    public void isDatePassedTest() {
        // Datum innan dagens datum. Datumet är passerat och ska resultera i true.
        assertTrue(Deadline.isDatePassed(new GregorianCalendar(2023, 10, 28)));
        // Datum efter dagens datum. Datum är inte passerat och ska resultear i false.
        assertFalse(Deadline.isDatePassed(new GregorianCalendar(2023, 11, 5)));
    }

    @Test
    public void isDateTodayTest() {
        // Datum innan dagens datum. Ska resultera i false.
        assertFalse(Deadline.isDateToday(new GregorianCalendar(2023, 10, 28)));
        // Dagens datum. Ska resultera i true.
        assertTrue(Deadline.isDateToday(new GregorianCalendar()));
        // Datum efter dagens datum. Ska resultera i false.
        assertFalse(Deadline.isDateToday(new GregorianCalendar(2023, 11, 5)));
    }

    @Test
    public void isDeadlinePassedTest() {
        // Deadline-datum.
        GregorianCalendar deadlineDate = new GregorianCalendar(2023, 11, 2);

        // Dagens datum är innan deadline och resulterar därför i false.
        assertFalse(Deadline.isDeadlinePassed(deadlineDate, new GregorianCalendar()));
        // Datumet är innan deadline och resulterar därför i false.
        assertFalse(Deadline.isDeadlinePassed(deadlineDate, new GregorianCalendar(2023, 10, 30)));
        // Datumet är efter deadline och resulterar därför i true.
        assertTrue(Deadline.isDeadlinePassed(deadlineDate, new GregorianCalendar(2023, 11, 4)));
    }
}