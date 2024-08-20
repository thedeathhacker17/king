package com.example.aaaroth;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class YourActivity extends AppCompatActivity {

    private TextView userIdTextView;
    private TextView machineIdTextView;
    private TableLayout excelTab;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_activity);

        // Initialize views
        userIdTextView = findViewById(R.id.user_id);
        machineIdTextView = findViewById(R.id.machine_id);
        excelTab = findViewById(R.id.excel_tab);

        // Set user information (these values can be fetched from your database or API)
        String userId = "USER123";
        String machineId = "MACH456";

        // Set text in views
        userIdTextView.setText("User ID: " + userId);
        machineIdTextView.setText("Machine ID: " + machineId);

        // Adding rows to the TableLayout (Excel-like tab)
        addRowToTable("John Doe", "CUST001", "+123456789", "View");
        addRowToTable("Jane Smith", "CUST002", "+987654321", "View");
        addRowToTable("Alice Johnson", "CUST003", "+5647382910", "View");
    }

    private void addRowToTable(String customerName, String customerId, String mobileNo, String report) {
        TableRow tableRow = new TableRow(this);

        TextView customerNameTextView = new TextView(this);
        customerNameTextView.setText(customerName);
        customerNameTextView.setPadding(8, 8, 8, 8);

        TextView customerIdTextView = new TextView(this);
        customerIdTextView.setText(customerId);
        customerIdTextView.setPadding(8, 8, 8, 8);

        TextView mobileNoTextView = new TextView(this);
        mobileNoTextView.setText(mobileNo);
        mobileNoTextView.setPadding(8, 8, 8, 8);

        TextView reportTextView = new TextView(this);
        reportTextView.setText(report);
        reportTextView.setPadding(8, 8, 8, 8);

        tableRow.addView(customerNameTextView);
        tableRow.addView(customerIdTextView);
        tableRow.addView(mobileNoTextView);
        tableRow.addView(reportTextView);

        excelTab.addView(tableRow);
    }
}
