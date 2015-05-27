package com.poweron_studio.eathealthy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.main, menu);
       // return true;
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
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
        else if(id == R.id.action_about)
        {
            Context context = getApplicationContext();
            CharSequence text = "About is loading!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            Intent intent = new Intent(this, AboutPage.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goBreakfast(View view) {
        Intent intent = new Intent(this, Breakfast.class);
        startActivity(intent);

    }

    public void onLunch(View view) {
        Intent intent = new Intent(this, Lunch.class);
        startActivity(intent);
    }

    public void onDinner(View view) {
        Intent intent = new Intent(this, Dinner.class);
        startActivity(intent);
    }

    public void onJuice(View view) {
        Intent intent = new Intent(this, Juice.class);
        startActivity(intent);
    }

    public void onDessert(View view) {
        Intent intent = new Intent(this, Dessert.class);
        startActivity(intent);
    }

    public void onGlutenFree(View view) {
        Intent intent = new Intent(this, GlutenFree.class);
        startActivity(intent);
    }

}
