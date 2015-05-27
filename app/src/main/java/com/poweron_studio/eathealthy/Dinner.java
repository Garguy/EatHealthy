package com.poweron_studio.eathealthy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Dinner extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dinner, menu);
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

    public void beefburgerOnClick(View view) {
        Intent intent = new Intent(this, BeefBurgers.class);
        startActivity(intent);
    }

    public void stroganoffOnClick(View view) {
        Intent intent = new Intent(this, BEEFSTROGANOFF.class);
        startActivity(intent);
    }

    public void steakOnClick(View view) {
        Intent intent = new Intent(this, GrilledSteak.class);
        startActivity(intent);
    }

    public void arugulaOnClick(View view) {
        Intent intent = new Intent(this, ArugulaSalad.class);
        startActivity(intent);
    }

    public void spaghettiOnClick(View view) {
        Intent intent = new Intent(this, Spaghetti.class);
        startActivity(intent);
    }

    public void sourchickenOnClick(View view) {
        Intent intent = new Intent(this, SourChicken.class);
        startActivity(intent);
    }

    public void wrapaspOnClick(View view) {
        Intent intent = new Intent(this, TurkeyWrap.class);
        startActivity(intent);
    }

    public void cajunhalOnClick(View view) {
        Intent intent = new Intent(this, CajunHalibut.class);
        startActivity(intent);
    }
}
