package com.nayan.viewpagerapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
<<<<<<< HEAD
import androidx.annotation.NonNull;
=======
>>>>>>> origin/master
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

<<<<<<< HEAD
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

=======
>>>>>>> origin/master
public class MainActivity extends AppCompatActivity {

    ViewPager2 viewpager;
    myViewPagerAdapter myAdapter;
<<<<<<< HEAD
    TabLayout tablayout;
=======
>>>>>>> origin/master

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

<<<<<<< HEAD
        tablayout=findViewById(R.id.tabLayout);

=======
>>>>>>> origin/master
        myAdapter=new myViewPagerAdapter(getSupportFragmentManager(),getLifecycle());

        myAdapter.addFragment(new Fragment1());
        myAdapter.addFragment(new Fragment2());
        myAdapter.addFragment(new Fragment3());

        viewpager=findViewById(R.id.viewPager2);
        viewpager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        viewpager.setAdapter(myAdapter);

<<<<<<< HEAD
        //connect tablayout and viewpager
        new TabLayoutMediator(
                tablayout, viewpager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText("Fragment "+(position+1));
            }
        }
        ).attach();

=======
>>>>>>> origin/master
    }
}