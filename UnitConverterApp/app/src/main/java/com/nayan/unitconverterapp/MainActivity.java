package com.nayan.unitconverterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView poundsop;
    EditText kilosip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        poundsop=findViewById(R.id.output_pounds);
        kilosip=findViewById(R.id.input_kilo);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input=kilosip.getText().toString();
                double kilos=Double.parseDouble(input);
                poundsop.setText(""+makeConversion(kilos));

            }
        });

    }

    public double makeConversion(double kilos){
        return kilos*2.20462;
    }
}