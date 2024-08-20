package com.example.aaaroth;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class RegistrationActivity extends AppCompatActivity {

    // Declare UI components
    private TextView textView;
    private ImageView imageView;
    private TextInputEditText editTextFullName, editTextEmail, editTextBusinessAddress, editTextPhoneNumber, editTextGstin;
    private Button btnRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Connects to the XML layout

        // Initialize UI components
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        editTextFullName = findViewById(R.id.editTextFullName); // Full Name input
        editTextEmail = findViewById(R.id.editTextEmail); // Email input
        editTextBusinessAddress = findViewById(R.id.editTextBusinessAddress); // Business Address input
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber); // Phone Number input
        editTextGstin = findViewById(R.id.editTextGSTIN); // GSTIN input
        btnRegister = findViewById(R.id.btn_register); // Register button

        // Set onClickListener for the register button
        btnRegister.setOnClickListener(v -> handleRegistration());
    }

    // Method to handle registration logic
    private void handleRegistration() {
        String fullName = editTextFullName.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String businessAddress = editTextBusinessAddress.getText().toString().trim();
        String phoneNumber = editTextPhoneNumber.getText().toString().trim();
        String gstin = editTextGstin.getText().toString().trim();

        // Implement your registration logic here, e.g., form validation, sending data to server, etc.
    }
}
