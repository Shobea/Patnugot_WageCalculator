package com.example.patnugot_wagecalculator.Controller;

import android.annotation.SuppressLint;
import android.widget.TextView;
import com.example.patnugot_wagecalculator.Model.Variables;

public class Formulas {
    static Variables variables = new Variables();

    public static void WageFormulas(int hours, String employeeType) {
        switch (employeeType) {
            case "Regular":
                variables.setHours(hours);
                if (hours <= 8) {
                    variables.setRegularWage(variables.getHours() * 100);
                    variables.setHoursOT(0);
                    variables.setWageOT(0);
                } else {
                    variables.setRegularWage(800);
                    variables.setHoursOT(hours - 8);
                    variables.setWageOT(variables.getHoursOT() * 115);
                }
                variables.setTotalWage(variables.getWageOT() + variables.getRegularWage());
                break;
            case "Probationary":
                variables.setHours(hours);
                if (hours <= 8) {
                    variables.setRegularWage(variables.getHours() * 90);
                    variables.setHoursOT(0);
                    variables.setWageOT(0);
                } else {
                    variables.setRegularWage(720);
                    variables.setHoursOT(hours - 8);
                    variables.setWageOT(variables.getHoursOT() * 100);
                }
                variables.setTotalWage(variables.getWageOT() + variables.getRegularWage());
                break;
            case "Part-time":
                variables.setHours(hours);
                if (hours <= 8) {
                    variables.setRegularWage(variables.getHours() * 75);
                    variables.setHoursOT(0);
                    variables.setWageOT(0);
                } else {
                    variables.setRegularWage(600);
                    variables.setHoursOT(hours - 8);
                    variables.setWageOT(variables.getHoursOT() * 90);
                }
                variables.setTotalWage(variables.getWageOT() + variables.getRegularWage());
                break;
        }
    }

    @SuppressLint("SetTextI18n")
    public static void ResultsDisplay(TextView a, TextView b, TextView c, TextView d, TextView e) {
        a.setText(Integer.toString(variables.getRegularWage()));
        b.setText(Integer.toString(variables.getHoursOT()));
        c.setText(Integer.toString(variables.getWageOT()));
        d.setText("Total hours rendered: " + (variables.getHours()+ " hours"));
        e.setText("Total wage received: ₱" + (variables.getTotalWage()));
    }
    }
