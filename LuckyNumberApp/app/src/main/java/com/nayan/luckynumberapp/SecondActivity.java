package com.nayan.luckynumberapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView lucknumberdisp;
    Button sharebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lucknumberdisp=findViewById(R.id.luckynumberdisplay);
        sharebtn=findViewById(R.id.sharebtn);

        Intent intent=getIntent();//will retrieve the putExtra key-value pairs
        String name= intent.getStringExtra("name");//specify key to get corresponding value

        int random_num=generateRandomnumber();
        lucknumberdisp.setText(""+random_num);

        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData(name, random_num);
            }
        });

    }


    public int generateRandomnumber(){
        Random random=new Random();
        int upper_limit=1000;
        int randomNumberGenerated = random.nextInt(upper_limit);
        return randomNumberGenerated;
    }

    public void shareData(String name, int num){
        //implicit intent
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, name+ "got lucky today!");
        intent.putExtra(Intent.EXTRA_TEXT, "His lucky number is: "+num);
        startActivity(Intent.createChooser(intent,"Choose a Platform to share"));

    }
}