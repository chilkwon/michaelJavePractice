package com.chilsoftware;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Schedule sc = new Schedule();
        sc.AddingSchedule();
//retrieve only chil's all day activities
        sc.getList().stream().filter(person-> person.getName() =="chil").forEach(System.out::println);

    }
}
