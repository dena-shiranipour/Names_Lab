package com.example.task_01.models;
//basically, a POJO is a java object which we use purely as a data type
//a POJO must have a default constructor(aka one w no parameters)
//it must have private properties, and public getters&setters for all of them

//aka the following below follow the above rules:

public class Greeting {

    //properties
    private String name;
    private String timeOfDay;

    //constructor
    public Greeting(String name, String timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public Greeting(){
    }

    //getters setters
    public String getName(){
        return this.name;
    }

    public void setName(String word){
        this.name = name;
    }

    public String getTimeOfDay(){
        return this.timeOfDay;
    }

    public void setTimeOfDay(){
        this.timeOfDay = timeOfDay;
    }

}
