package com.example.iheartart.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.content.*;
import android.widget.*;
import android.widget.CalendarView.OnDateChangeListener;


public class Calendar extends ActionBarActivity {
    CalendarView calendar;
    int selYear;
    int selMonth;
    int selDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        calendar = (CalendarView)findViewById(R.id.calendar);
        calendar.setOnDateChangeListener(new OnDateChangeListener() {
            @Override
            //Whenever a date is picked, this function will open a new Intent, get
            //day and month of the selected date and send it to Events activity
            public void onSelectedDayChange(CalendarView view,int year, int month, int dayOfMonth) {
                Intent goToEvents = new Intent("com.example.iheartart.app.EVENTS");
                goToEvents.putExtra("Day", ""+dayOfMonth);
                goToEvents.putExtra("Month",month);
                startActivity(goToEvents);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calendar, menu);
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

    public void goToHowTo(View view) {
        Intent howTo = new Intent(this, HowTo.class);
        startActivity(howTo);
    }

    public void goToMainPage(View view) {
        Intent main = new Intent(this, mainpage.class);
        startActivity(main);
    }

}
