package com.example.hhle.hhle_fueltrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_entry);
    }

    public void saveEntry(View view){

    }

    public void cancelEntry(View view){
        finish();
    }
}
