package com.epam.jmp.memory.model;


import java.util.Random;

public class Task
{
    private String name;
    private Integer grade;

    public Task(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
