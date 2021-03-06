package com.example.hhle.hhle_fueltrack;

/*
Despite the class name, this activity class also deals with editing the log entries as well, since
editing and adding entries is very similar. Unfortunately, this class is very procedural, due to a
lack of planing on my part.
 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddEntryActivity extends AppCompatActivity {
    private EntryLog myInstance = EntryLog.getMyInstance();
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
                String dateString = dateText.getText().toString();
                String stationString = stationText.getText().toString();
                String odometerString = odometerText.getText().toString();
                String gradeString = gradeText.getText().toString();
                String fuelAmountString = fuelAmountText.getText().toString();
                String fuelUnitCostString = fuelUnitCostText.getText().toString();

                try{
                    Entry newEntry = new Entry(dateString, stationString, odometerString, gradeString, fuelAmountString, fuelUnitCostString);
                    Intent intent = getIntent();
                    int entryIndex;
                    if (intent.hasExtra("Edit")) {
                        entryIndex = intent.getIntExtra("Edit", -1);
                        myInstance.editEntry(entryIndex, newEntry);
                    }
                    else{
                        myInstance.addEntry(newEntry);
                    }
                    finish();
                }
                catch(Exception ex){
                    // show input error toast
                    Context context = getApplicationContext();
                    CharSequence text = "Error in inputs, try again";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }

}
