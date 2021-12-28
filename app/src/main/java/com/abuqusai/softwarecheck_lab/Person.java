package com.abuqusai.softwarecheck_lab;

public class Person {

    private String name;
    private int age;
    public Person(String name, int age, String s) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean runInGround(String location) {
        if(location.equals("ground")) {
            System.out.println("The person runs in the " + location);
            return true;
        } else {
            System.out.println("The person doesn't run in the " +   location);
            return false;
        }

    }

    public boolean isPlay() {

        if(this.runInGround("ground")) {
            System.out.println("The person plays.");
            return true;
        }
        else {
            System.out.println("The person doesn't play");
            return false;
        }
    }
}