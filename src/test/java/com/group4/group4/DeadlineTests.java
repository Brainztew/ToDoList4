package com.group4.group4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

public class DeadlineTests {
    @Test
    public void isDeadlinePassedTest() {
        // Dagens datum.
        GregorianCalendar todayDate = new GregorianCalendar(2023, 11, 2);
        // Deadline-datum.
        Task task1 = new Task("Betala räkningar - 2024-10-28");
        Task task2 = new Task("Betala räkningar - 2023-11-05");
        String task1Deadline = task1.getDescription().substring(task1.getDescription().length() - 10,
                task1.getDescription().length());
        String task2Deadline = task2.getDescription().substring(task2.getDescription().length() - 10,
                task2.getDescription().length());

        // Dagens datum är innan deadline och resulterar därför i false.
        assertFalse(todayDate.after(new GregorianCalendar(
                Integer.parseInt(task1Deadline.substring(0, 4)),
                Integer.parseInt(task1Deadline.substring(5, 7)) - 1,
                Integer.parseInt(task1Deadline.substring(8, 10)))));

        // Dagens datum är efter deadline och resulterar därför i true.
        assertTrue(todayDate.after(new GregorianCalendar(
                Integer.parseInt(task2Deadline.substring(0, 4)),
                Integer.parseInt(task2Deadline.substring(5, 7)) - 1,
                Integer.parseInt(task2Deadline.substring(8, 10)))));
    }
}