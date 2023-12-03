package com.group4.group4;

import java.util.List;

public class Task {

    private String description;
    private boolean isComplete;
    
    public Task() {
        
    }

    public Task(String description) {
        this.description = description;
        this.isComplete = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markComplete() {
        isComplete = true;
    }
        public static boolean markToDoAsCompleted(List<String> list, String completedTask) {
        if (list.contains(completedTask)) {
            list.remove(completedTask);
            return true; 
        } else {
            return false;
        }
    }
}