package com.example.aaaroth;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CustomerBaseSearchActivity extends AppCompatActivity {

    private Button searchByMobileButton;
    private Button searchByIdButton;
    private EditText inputField;
    private Button submitSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerbase); // Replace with your actual XML layout name

        // Initialize UI components
        searchByMobileButton = findViewById(R.id.searchByMobileButton);
        searchByIdButton = findViewById(R.id.searchByIdButton);
        inputField = findViewById(R.id.inputField);
        submitSearchButton = findViewById(R.id.submitSearchButton);

        // Set click listeners for the buttons
        searchByMobileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setHint("Enter Mobile Number");
                inputField.setVisibility(View.VISIBLE);
                submitSearchButton.setVisibility(View.VISIBLE);
            }
        });

        searchByIdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setHint("Enter Customer ID");
                inputField.setVisibility(View.VISIBLE);
                submitSearchButton.setVisibility(View.VISIBLE);
            }
        });

        submitSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputField.getText().toString().trim();
                if (input.isEmpty()) {
                    Toast.makeText(CustomerBaseSearchActivity.this, "Please enter the required data", Toast.LENGTH_SHORT).show();
                } else {
                    // Handle the search logic here
                    // For example, you could start a new activity or query the database with the input data
                    // This is a placeholder Toast message for demonstration purposes
                    Toast.makeText(CustomerBaseSearchActivity.this, "Searching for: " + input, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
