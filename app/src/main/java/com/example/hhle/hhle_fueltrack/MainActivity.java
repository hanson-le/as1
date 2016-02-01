package com.example.hhle.hhle_fueltrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addEntry(View view) {
        Intent intent = new Intent(this, AddEntryActivity.class);
        startActivity(intent);
    }

    public void showCost(View view) {
        Intent intent = new Intent(this, ShowFuelCostActivity.class);
        startActivity(intent);
    }
}
