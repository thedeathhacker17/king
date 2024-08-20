package com.example.aaaroth;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.aaaroth.databinding.ActivitySetpinBinding;

public class SetpinActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySetpinBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySetpinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.header);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_setpin);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        // Replace the following line as it makes no sense in this context
        // binding.toString().stripIndent();
    }

    // This method should work with a Toolbar, not a TextView. Make sure 'header' is a Toolbar in your layout.
    private void setSupportActionBar(TextView header) {
        // You may need to update this method to work with a Toolbar
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_setpin);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
