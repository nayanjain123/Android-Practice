package com.nayan.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button blackbtn,yellowbtn,redbtn,greenbtn,purplebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        blackbtn=findViewById(R.id.blackbtn);
        redbtn=findViewById(R.id.redbtn);
        yellowbtn=findViewById(R.id.yellowbtn);
        purplebtn=findViewById(R.id.purplebtn);
        greenbtn=findViewById(R.id.greenbtn);

        redbtn.setOnClickListener(this);
        blackbtn.setOnClickListener(this);
        yellowbtn.setOnClickListener(this);
        purplebtn.setOnClickListener(this);
        greenbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int clickedBtnID=view.getId();
        if(clickedBtnID==R.id.redbtn){
            PLaySounds(R.raw.red);
        }
        else if(clickedBtnID==R.id.yellowbtn){
            PLaySounds(R.raw.yellow);
        }
        else if(clickedBtnID==R.id.greenbtn){
            PLaySounds(R.raw.green);
        }
        else if(clickedBtnID==R.id.purplebtn){
            PLaySounds(R.raw.purple);
        }
        else if(clickedBtnID==R.id.blackbtn){
            PLaySounds(R.raw.black);
        }
    }

    public void PLaySounds(int id){
        MediaPlayer mediaPlayer=MediaPlayer.create(this,id);
        mediaPlayer.start();
    }
}