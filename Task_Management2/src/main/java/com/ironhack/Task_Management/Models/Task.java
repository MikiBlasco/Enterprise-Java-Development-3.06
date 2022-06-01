package com.ironhack.Task_Management.Models;

import javax.persistence.*;
import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

abstract class Task {
    @Id
    private String title;
    private Date dueDate;
    private boolean status;

    public Task(){

    }

    public Task(String title, Date dueDate, boolean status) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
