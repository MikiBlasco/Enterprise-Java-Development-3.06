package com.ironhack.Task_Management.Models;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class BillableTask extends Task {
    private BigDecimal hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title, Date dueDate, boolean status, BigDecimal hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
