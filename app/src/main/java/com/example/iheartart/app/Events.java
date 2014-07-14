package com.example.iheartart.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.content.*;
import android.widget.TextView;


public class Events extends ActionBarActivity {
    String[] months = {"January","February","March","April","May","June","July","August",
    "September","October","November","December"};
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        //Gets day and month from the Calendar activity through Intent
        Intent getData = getIntent();
        String day = getData.getStringExtra("Day");
        int index = getData.getIntExtra("Month",0);

        ((TextView)findViewById(R.id.month)).setText(months[index]);
        ((TextView)findViewById(R.id.day)).setText(day);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.events, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void goToCalendar(View view) {
        Intent calendar = new Intent(this, Calendar.class);
        startActivity(calendar);
    }

    public void goToEvent(View view) {
        Intent event = new Intent(this, Event.class);
        startActivity(event);
    }
}
