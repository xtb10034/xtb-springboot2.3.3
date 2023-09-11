package com.xtb.restful.model;

import java.io.Serializable;

public class HolleDto  implements Serializable {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public HolleDto(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public HolleDto(){

    }
    @Override
    public String toString() {
        return "HolleDto [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
