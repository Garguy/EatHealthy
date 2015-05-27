package com.poweron_studio.eathealthy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Lunch extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lunch, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void greenpepperOnClick(View view) {
        Intent intent = new Intent(this, GreenPepperSalad.class);
        startActivity(intent);
    }

    public void bisonOnClick(View view) {
        Intent intent = new Intent(this, GreenPepperBison.class);
        startActivity(intent);
    }

    public void fishsoftOnClick(View view) {
        Intent intent = new Intent(this, FishTacos.class);
        startActivity(intent);
    }

    public void redpearOnClick(View view) {
        Intent intent = new Intent(this, RedPear.class);
        startActivity(intent);
    }

    public void creamyOnClick(View view) {
        Intent intent = new Intent(this, CreamyChicken.class);
        startActivity(intent);
    }

    public void tangyOnClick(View view) {
        Intent intent = new Intent(this, TangyChicken.class);
        startActivity(intent);
    }

    public void greekOnClick(View view) {
        Intent intent = new Intent(this, GreekChicken.class);
        startActivity(intent);
    }

    public void chickenOnClick(View view) {
        Intent intent = new Intent(this, LaKing.class);
        startActivity(intent);
    }
}
