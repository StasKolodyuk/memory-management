package com.epam.jmp.memory.model;


import java.util.List;

public class Mentee extends Person {

    private List<Task> tasks;

    public Mentee(String name) {
        super(name);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
