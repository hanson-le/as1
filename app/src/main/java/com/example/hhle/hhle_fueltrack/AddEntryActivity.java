package com.example.hhle.hhle_fueltrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddEntryActivity extends AppCompatActivity {
    private EditText dateText;
    private EditText stationText;
    private EditText odometerText;
    private EditText gradeText;
    private EditText fuelAmountText;
    private EditText fuelUnitCostText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_entry);

        dateText = (EditText) findViewById(R.id.add_date);
        stationText =(EditText) findViewById(R.id.add_station);
        odometerText =(EditText) findViewById(R.id.add_odometer);
        gradeText =(EditText) findViewById(R.id.add_grade);
        fuelAmountText =(EditText) findViewById(R.id.add_fuel_amount);
        fuelUnitCostText =(EditText) findViewById(R.id.add_unit_fuel_cost);

        Button saveButton = (Button) findViewById(R.id.saveEntry);
        Button cancelButton = (Button) findViewById(R.id.cancelEntry);

        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String stationString = stationText.toString();

            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }

}
