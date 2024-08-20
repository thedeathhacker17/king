package com.example.aaaroth;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class using extends AppCompatActivity {

    private TextView machineId, userId;
    private Button btnUser, btnSearchData, btnDeviceLoginPinReset, btnUserDataUpdation, btnCustomerRegistration, btnCustomerDataUpdation, btnCustomerIdDeactivation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        machineId = findViewById(R.id.machine_id);
        userId = findViewById(R.id.user_id);
        btnUser = findViewById(R.id.btn_user);
        btnSearchData = findViewById(R.id.btn_search_data);
        btnDeviceLoginPinReset = findViewById(R.id.btn_device_login_pin_reset);
        btnUserDataUpdation = findViewById(R.id.btn_user_data_updation);
        btnCustomerRegistration = findViewById(R.id.btn_customer_registration);
        btnCustomerDataUpdation = findViewById(R.id.btn_customer_data_updation);
        btnCustomerIdDeactivation = findViewById(R.id.btn_customer_id_deactivation);

        // Set onClickListeners for buttons
        btnUser.setOnClickListener(v -> Toast.makeText(using.this, "User Button Clicked", Toast.LENGTH_SHORT).show());

        btnSearchData.setOnClickListener(v -> {
            Intent intent = new Intent(using.this, DataUpdationActivity.class);
            startActivity(intent);
        });

        btnDeviceLoginPinReset.setOnClickListener(v -> Toast.makeText(using.this, "Device Login PIN Reset Button Clicked", Toast.LENGTH_SHORT).show());

        btnUserDataUpdation.setOnClickListener(v -> {
            Intent intent = new Intent(using.this, DataUpdationActivity.class);
            startActivity(intent);
        });

        btnCustomerRegistration.setOnClickListener(v -> Toast.makeText(using.this, "Customer Registration Button Clicked", Toast.LENGTH_SHORT).show());

        btnCustomerDataUpdation.setOnClickListener(v -> {
            Intent intent = new Intent(using.this, DataUpdationActivity.class);
            startActivity(intent);
        });

        btnCustomerIdDeactivation.setOnClickListener(v -> {
            Intent intent = new Intent(using.this, CustomerIdDeactivationActivity.class);
            startActivity(intent);
        });
    }
}
