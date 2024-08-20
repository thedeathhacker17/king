package com.example.aaaroth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SearchDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scarchdata); // Replace with your actual XML layout name

        // Initialize buttons
        Button customerSearchButton = findViewById(R.id.customerSearchButton);
        Button otherSearchButton = findViewById(R.id.otherSearchButton);

        // Set click listeners for buttons
        customerSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle "Customer Base Search" button click
                Intent intent = new Intent(SearchDataActivity.this, CustomerBaseSearchActivity.class);
                startActivity(intent);
            }
        });

        otherSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle "Other Search Criteria" button click
                Intent intent = new Intent(SearchDataActivity.this, OtherSearchCriteriaActivity.class);
                startActivity(intent);
            }
        });
    }
}
