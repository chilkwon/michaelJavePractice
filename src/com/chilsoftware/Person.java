package com.chilsoftware;

public class Person {

    private String name;
    private String activity;
    private String time;
    private String day;

    Person(String name, String activity, String time, String day){
        this.name = name;
        this.activity = activity;
        this.time = time;
        this.day = day;
    }
    public String getName(){
        return name;
    }
    public String getActivity(){
        return getActivity();
    }
    public String getTime(){
        return time;
    }
    public String getDay(){
        return day;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", activity='" + activity + '\'' +
                ", time='" + time + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
