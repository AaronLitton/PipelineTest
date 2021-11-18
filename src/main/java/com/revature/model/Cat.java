package com.revature.model;

public class Cat {
    private String name, breed;
    private int age;
    private boolean isFixed = false;


    public boolean isFixed() {
        return isFixed;
    }

    public Cat setFixed(boolean fixed) {
        isFixed = fixed;
        return this;
    }


    public Cat(){

    };

    public Cat(String name, String breed, int age, boolean isFixed) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isFixed = isFixed;
    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public String getBreed() {
        return breed;
    }

    public Cat setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
