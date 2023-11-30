package com.group4.group4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TaskTest {
        // Task
    @Test
    public void testTaskComplete() {
        // Skapar en task för testning
        Task task = new Task("Innan klarmarkering");

        // Verifierar och kontrollerar att uppgiften
        // är initialt INTE klar - FALSE
        assertFalse(task.isComplete());

        // Markerar uppgiften som KLAR
        task.markComplete();

        // Kontrollerar att uppgiften är NU markerad som klar - TRUE
        assertTrue(task.isComplete());
    }
        @Test
    public void markToDoAsCompletedTest() {
        List<String> tasks = new ArrayList<>();
        tasks.add("Uppgift som ska markeras som klar");
        boolean taskCompleted = Task.markToDoAsCompleted(tasks, "Uppgift som ska markeras som klar");
        
        assertTrue(taskCompleted);
        assertFalse(tasks.contains("Uppgift som ska markeras som klar")); 
}
}
