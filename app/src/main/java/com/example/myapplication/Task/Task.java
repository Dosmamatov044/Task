package com.example.myapplication.Task;
import java.io.Serializable;

public class Task implements Serializable {

    String title;
    String desc;

    public Task(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
