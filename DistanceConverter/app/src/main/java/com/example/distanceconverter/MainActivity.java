package com.example.distanceconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button MilestoKmButton = findViewById(R.id.MilestoKmButton);
        MilestoKmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText miles = findViewById(R.id.EditTextMiles);
                EditText km = findViewById(R.id.EditTextKm);
                double vmiles = Double.valueOf(miles.getText().toString());
                double vkm = vmiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                km.setText(formatVal.format(vkm));

            }
        });
        Button KmtoMilesButton = findViewById(R.id.KmtoMilesButton);
        KmtoMilesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText miles = findViewById(R.id.EditTextMiles);
                EditText km = findViewById(R.id.EditTextKm);
                double vkm = Double.valueOf(km.getText().toString());
                double vmiles = vkm*0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                miles.setText(formatVal.format(vmiles));

            }
        });
    }
}
