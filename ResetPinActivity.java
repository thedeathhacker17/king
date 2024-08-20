package com.example.aaaroth;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ResetPinActivity extends AppCompatActivity {

    private EditText resetLoginPin;
    private EditText confirmLoginPin;
    private Button submitButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setpin);

        // Initialize the views
        resetLoginPin = findViewById(R.id.resetLoginPin);
        confirmLoginPin = findViewById(R.id.confirmLoginPin);
        submitButton = findViewById(R.id.submitButton);

        // Set up the submit button click listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered pins
                String resetPin = resetLoginPin.getText().toString().trim();
                String confirmPin = confirmLoginPin.getText().toString().trim();

                // Basic validation
                if (resetPin.isEmpty() || confirmPin.isEmpty()) {
                    // Handle empty fields (e.g., show an error message)
                    return;
                }

                if (!resetPin.equals(confirmPin)) {
                    // Handle mismatched pins (e.g., show an error message)
                    return;
                }

                // Proceed with pin reset logic
                // For example, you could send the pins to a server or save them locally
            }
        });
    }
}
