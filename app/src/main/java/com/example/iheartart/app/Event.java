package com.example.iheartart.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.content.*;
import com.example.iheartart.app.R;

public class Event extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.event, menu);
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

    public void goToEvents(View view) {
        Intent events = new Intent(this, Events.class);
        startActivity(events);
    }

    public void goToReviews(View view) {
        Intent reviews = new Intent(this, Reviews.class);
        startActivity(reviews);
    }


}
