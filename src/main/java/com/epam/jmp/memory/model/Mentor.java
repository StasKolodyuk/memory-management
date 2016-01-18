package com.epam.jmp.memory.model;


import java.util.Random;

public class Mentor extends Person
{
    private Mentee mentee;

    public Mentor(String name) {
        super(name);
    }

    public void checkTasks() {
        for(Task task : mentee.getTasks()) {
            task.setGrade(new Random().nextInt(6));
        }
    }

    public Mentee getMentee() {
        return mentee;
    }

    public void setMentee(Mentee mentee) {
        this.mentee = mentee;
    }
}
