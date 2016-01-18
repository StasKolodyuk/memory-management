package com.epam.jmp.memory;


import com.epam.jmp.memory.model.Mentee;
import com.epam.jmp.memory.model.Mentor;
import com.epam.jmp.memory.model.Task;

import java.util.Arrays;


public class Runner {

    public static void printGrades(Mentee mentee) {
        for(Task task : mentee.getTasks()) {
            System.out.println(task.getName() + ": " + task.getGrade());
        }
    }

    public static void main(String[] args) {
        Mentee mentee = new Mentee("Stas");
        mentee.setTasks(Arrays.asList(new Task("patterns"), new Task("classloader"), new Task("memory")));

        Mentor mentor = new Mentor("Viktor");
        mentor.setMentee(mentee);
        mentor.checkTasks();

        printGrades(mentee);
    }

}
