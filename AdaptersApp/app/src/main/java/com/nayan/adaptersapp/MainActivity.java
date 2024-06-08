package com.nayan.adaptersapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;

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

        //AdapterView
        listView=findViewById(R.id.listview);

        //data source a array or list or a cursor from some database or anything such
        String[] countries = {"USA","Germany","Saudi","France"};

        //Adapter acts as a bridge b/w the data source and the adapter view. binds the data to the views inside adapterview
        MyCustomAdapter adapter=new MyCustomAdapter(this,countries);

        //setting the adapter on the view
        listView.setAdapter(adapter);



    }

}