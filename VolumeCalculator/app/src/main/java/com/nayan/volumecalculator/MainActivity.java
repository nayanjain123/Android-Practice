package com.nayan.volumecalculator;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> shapeArrayList;

    myCustomAdapter adapter;

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

        gridView=findViewById(R.id.gridView);
        shapeArrayList=new ArrayList<>();

        Shape s1=new Shape("Sphere",R.drawable.sphere);
        Shape s2=new Shape("Cylinder",R.drawable.cylinder);
        Shape s3=new Shape("Cube",R.drawable.cube);
        Shape s4=new Shape("Prism",R.drawable.prism);

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter=new myCustomAdapter(shapeArrayList,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);
    }
}