package com.group4.group4;
import java.util.List;

public class ListInfo {
    private String name;
    private List<String> list;

    public ListInfo(String name, List<String> list) {
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }

    

}
