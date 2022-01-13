package com.chilsoftware;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<Person> personSchedule = new ArrayList<>();
    public void AddingSchedule(){
        //chil's monday
        personSchedule.add(new Person("chil", "starts work", "9am", "Monday"));
        personSchedule.add(new Person("chil", "has meeting", "10am","Monday"));
        personSchedule.add(new Person("chil", "ends meeting", "11am","Monday"));
        personSchedule.add(new Person("chil", "has lunch", "12pm","Monday"));
        personSchedule.add(new Person("chil", "ends work", "3:30pm","Monday"));
        personSchedule.add(new Person("chil", "goes to pharmacy", "6pm","Monday"));
        personSchedule.add(new Person("chil", "eats diner", "7pm","Monday"));
        personSchedule.add(new Person("chil", "goes to sleep", "9pm","Monday"));
        //yun's monday
        personSchedule.add(new Person("yun", "starts work", "9am","Monday"));
        personSchedule.add(new Person("yun", "eats lunch", "12pm","Monday"));
        personSchedule.add(new Person("yun", "ends work", "6pm","Monday"));
        personSchedule.add(new Person("yun", "does deliveries", "6:30pm","Monday"));
        personSchedule.add(new Person("yun", "eats dinner", "7pm","Monday"));
        personSchedule.add(new Person("yun", "workout", "8pm","Monday"));
        personSchedule.add(new Person("yun", "goes to sleep", "9pm","Monday"));

        //chil's Tuesday
        personSchedule.add(new Person("chil", "starts work", "9am", "Tuesday"));
        personSchedule.add(new Person("chil", "has lunch", "12:10pm","Tuesday"));
        personSchedule.add(new Person("chil", "ends work", "3:30pm","Tuesday"));
        personSchedule.add(new Person("chil", "goes to pharmacy", "5:40pm","Tuesday"));
        personSchedule.add(new Person("chil", "eats diner", "7:10pm","Tuesday"));
        personSchedule.add(new Person("chil", "goes to sleep", "9:30pm","Tuesday"));
        //yun's Tuesday
        personSchedule.add(new Person("yun", "starts work", "9am","Tuesday"));
        personSchedule.add(new Person("yun", "eats lunch", "1pm","Tuesday"));
        personSchedule.add(new Person("yun", "ends work", "5:55pm","Tuesday"));
        personSchedule.add(new Person("yun", "eats dinner", "7pm","Tuesday"));
        personSchedule.add(new Person("yun", "workout", "8:05pm","Tuesday"));
        personSchedule.add(new Person("yun", "goes to sleep", "9:30pm","Tuesday"));

        //chil's Wednesday
        personSchedule.add(new Person("chil", "starts work", "9am", "Wednesday"));
        personSchedule.add(new Person("chil", "has meeting", "10am","Wednesday"));
        personSchedule.add(new Person("chil", "ends meeting", "11am","Wednesday"));
        personSchedule.add(new Person("chil", "has lunch", "12pm","Wednesday"));
        personSchedule.add(new Person("chil", "ends work", "3:30pm","Wednesday"));
        personSchedule.add(new Person("chil", "goes to pharmacy", "5:45pm","Wednesday"));
        personSchedule.add(new Person("chil", "eats diner", "7pm","Wednesday"));
        personSchedule.add(new Person("chil", "goes to sleep", "9pm","Wednesday"));
        //yun's Wednesday
        personSchedule.add(new Person("yun", "starts work", "9am","Wednesday"));
        personSchedule.add(new Person("yun", "eats lunch", "12pm","Wednesday"));
        personSchedule.add(new Person("yun", "ends work", "6pm","Wednesday"));
        personSchedule.add(new Person("yun", "eats dinner", "7pm","Wednesday"));
        personSchedule.add(new Person("yun", "reads book", "8pm","Wednesday"));
        personSchedule.add(new Person("yun", "goes to sleep", "9pm","Wednesday"));

        //chil's Thursday
        personSchedule.add(new Person("chil", "starts work", "9am", "Thursday"));
        personSchedule.add(new Person("chil", "has lunch", "12pm","Thursday"));
        personSchedule.add(new Person("chil", "ends work", "3:30pm","Thursday"));
        personSchedule.add(new Person("chil", "goes to pharmacy", "5:50pm","Thursday"));
        personSchedule.add(new Person("chil", "eats diner", "7pm","Thursday"));
        personSchedule.add(new Person("chil", "goes to sleep", "9pm","Thursday"));
        //yun's Thursday
        personSchedule.add(new Person("yun", "starts work", "9am","Thursday"));
        personSchedule.add(new Person("yun", "eats lunch", "12pm","Thursday"));
        personSchedule.add(new Person("yun", "ends work", "6pm","Thursday"));
        personSchedule.add(new Person("yun", "eats dinner", "7pm","Thursday"));
        personSchedule.add(new Person("yun", "goes to sleep", "9pm","Thursday"));

        //chil's Friday
        personSchedule.add(new Person("chil", "starts work", "9am", "Friday"));
        personSchedule.add(new Person("chil", "has meeting", "10am","Friday"));
        personSchedule.add(new Person("chil", "ends meeting", "11am","Friday"));
        personSchedule.add(new Person("chil", "has lunch", "12:45pm","Friday"));
        personSchedule.add(new Person("chil", "ends work", "3:30pm","Friday"));
        personSchedule.add(new Person("chil", "goes to pharmacy", "5:55pm","Friday"));
        personSchedule.add(new Person("chil", "eats diner", "7pm","Friday"));
        personSchedule.add(new Person("chil", "goes to sleep", "11pm","Friday"));
        //yun's Friday
        personSchedule.add(new Person("yun", "starts work", "9am","Friday"));
        personSchedule.add(new Person("yun", "eats lunch", "12pm","Friday"));
        personSchedule.add(new Person("yun", "ends work", "6pm","Friday"));
        personSchedule.add(new Person("yun", "does deliveries", "6:20pm","Friday"));
        personSchedule.add(new Person("yun", "eats dinner", "7pm","Friday"));
        personSchedule.add(new Person("yun", "workout", "8pm","Friday"));
        personSchedule.add(new Person("yun", "goes to sleep", "11pm","Friday"));

    }
    public List<Person> getList() {

        return personSchedule;
    }

}
