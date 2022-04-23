package com.example.patnugot_wagecalculator.Model;

public class Variables {
    private String name, employeeType;
    private int hours, regularWage, hoursOT, wageOT, totalWage;

    //Getters
    public String getName() {
        return name;
    }
    public String getEmployeeType() {
        return employeeType;
    }
    public int getHours() {
        return hours;
    }
    public int getRegularWage() {
        return regularWage;
    }
    public int getHoursOT() {
        return hoursOT;
    }
    public int getWageOT() {
        return wageOT;
    }
    public int getTotalWage() {
        return totalWage;
    }

    //Setters
    public void setName(String name) { this.name = name; }
    public void setEmployeeType(String employeeType) { this.employeeType = employeeType; }
    public void setHours(int hours) { this.hours = hours; }
    public void setRegularWage(int regularWage) { this.regularWage = regularWage; }
    public void setHoursOT(int hoursOT) { this.hoursOT = hoursOT; }
    public void setWageOT(int wageOT) { this.wageOT = wageOT; }
    public void setTotalWage(int totalWage) { this.totalWage = totalWage; }
}

