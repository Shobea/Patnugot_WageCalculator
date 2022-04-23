package com.example.patnugot_wagecalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.patnugot_wagecalculator.Controller.Formulas;
import com.example.patnugot_wagecalculator.R;

public class CalculatedWage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.patnugot_wagecalculator.R.layout.activity_calculated_wage);


        //numbers
        TextView regularWage=findViewById(R.id.regularWage);
        TextView OTHours=findViewById(R.id.OTHours);
        TextView OTWage=findViewById(R.id.OTWage);
        TextView hoursRendered=findViewById(R.id.hours);
        TextView totalWage=findViewById(R.id.totalWage);

        //strings
        TextView name=findViewById(R.id.employeeName);
        TextView employee=findViewById(R.id.employeeType);

        //button
        Button back=findViewById(R.id.button2);
        back.setOnClickListener(view -> {
            Intent previous = new Intent(this, MainActivity.class);
            startActivity(previous);});

        //intent
        Intent intent= getIntent();
        int hours=intent.getIntExtra("hours",0);
        String type=intent.getStringExtra("type");
        String employeeName=intent.getStringExtra("name");

        //Class
        Formulas.WageFormulas(hours, type);
        Formulas.ResultsDisplay(regularWage,OTHours,OTWage,hoursRendered,totalWage);

        name.setText(employeeName);
        employee.setText(type);

    }
}