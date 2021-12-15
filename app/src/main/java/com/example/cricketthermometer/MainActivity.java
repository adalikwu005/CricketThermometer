package com.example.cricketthermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etChips;
    Button btCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etChips = findViewById(R.id.etChips);
        btCalculate = findViewById(R.id.btCalculate);
        tvResult = findViewById(R.id.tvResults);

        tvResult.setVisibility(View.GONE);

        btCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etChips.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                } else
                    {

                    int chips = Integer.parseInt(etChips.getText().toString().trim());

                    double temp = (chips / 3.0) + 4;

                    String results = "The approximate temperature outside is " + temp + " degrees Celsius";

                    tvResult.setText(results);

                    tvResult.setVisibility(View.VISIBLE);

                     }
            }
        });
    }
}
