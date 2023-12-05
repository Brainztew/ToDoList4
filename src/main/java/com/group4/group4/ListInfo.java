package com.group4.group4;
import java.util.List;

public class ListInfo {
    private String name;
    private List<String> tasks;

    public ListInfo(String name, List<String> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getTasks() {
        return tasks;
    }
    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    

}
