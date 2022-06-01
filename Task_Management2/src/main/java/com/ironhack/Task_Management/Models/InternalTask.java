package com.ironhack.Task_Management.Models;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(String title, Date dueDate, boolean status) {
        super(title, dueDate, status);
    }

}
