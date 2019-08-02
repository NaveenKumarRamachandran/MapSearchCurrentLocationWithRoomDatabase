package com.naveen.samplemap.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.naveen.samplemap.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void viewMap(View view) {
        Intent i=new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void viewHistory(View view){
        Intent i=new Intent(this, ViewSearchResult.class);
        startActivity(i);

    }
    public void viewHistoryMap(View v){
        Intent i=new Intent(this, MapsActivity.class);
        i.putExtra("isHistory",true);
        startActivity(i);

    }
    public void liveTracking(View v){
        Intent i=new Intent(this, LiveTracking.class);

        startActivity(i);

    }
}
