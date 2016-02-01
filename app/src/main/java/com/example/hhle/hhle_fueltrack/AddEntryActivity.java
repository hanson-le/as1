package com.example.hhle.hhle_fueltrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_entry);

        Button saveButton = (Button) findViewById(R.id.saveEntry);
        Button cancelButton = (Button) findViewById(R.id.cancelEntry);

        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }

}
