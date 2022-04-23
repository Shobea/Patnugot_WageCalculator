package com.example.patnugot_wagecalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.patnugot_wagecalculator.Model.Variables;
import com.example.patnugot_wagecalculator.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Variables variables = new Variables();

        EditText hours = findViewById(R.id.txtHours);
        EditText name = findViewById(R.id.txtName);
        Button calculate = findViewById(R.id.button);
        Spinner choices =  findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.employees, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        choices.setAdapter(adapter);

        calculate.setOnClickListener(view -> {

            variables.setHours(Integer.parseInt(hours.getText().toString()));
            variables.setEmployeeType(String.valueOf(choices.getSelectedItem()));
            variables.setName(String.valueOf(name.getText()));

            Intent intent = new Intent(MainActivity.this,CalculatedWage.class);
            intent.putExtra("hours",variables.getHours());
            intent.putExtra("type",variables.getEmployeeType());
            intent.putExtra("name", variables.getName());
            startActivity(intent);
        });
    }

}

