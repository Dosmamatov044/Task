package com.example.myapplication.Task;
import java.io.Serializable;

public class Task implements Serializable {

    private String title;
    private String desc;
  private String bekzat;





    public Task(String title, String desc,String bekzat) {
        this.title = title;
        this.desc = desc;
   this.bekzat=bekzat;

    }

    public Task() {

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

    public String getBekzat() {
        return bekzat;
    }

    public void setBekzat(String bekzat) {
        this.bekzat = bekzat;
    }
}
