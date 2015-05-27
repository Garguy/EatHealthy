package com.poweron_studio.eathealthy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Breakfast extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_breakfast, menu);
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

    public void goldenOnClick(View view) {
        Intent intent = new Intent(this, GoldenPancakes.class);
        startActivity(intent);
    }

    public void burritoOnClick(View view) {
        Intent intent = new Intent(this, breakfastBurrito.class);
        startActivity(intent);
    }

    public void earlyOnClick(View view) {
        Intent intent = new Intent(this, EarlyRiserBreakfast.class);
        startActivity(intent);
    }

    public void southOnClick(View view) {
        Intent intent = new Intent(this, SouthwestScramble.class);
        startActivity(intent);
    }

    public void pepperOnClick(View view) {
        Intent intent = new Intent(this, StuffedPepper.class);
                startActivity(intent);
    }

    public void bananaOnClick(View view) {
        Intent intent = new Intent(this, BananaSplit.class);
        startActivity(intent);
    }

    public void scrambleOnClick(View view) {
        Intent intent = new Intent(this, ProteinScramble.class);
        startActivity(intent);
    }

    public void bowlOnClick(View view) {
        Intent intent = new Intent(this, AnabolicBowl.class);
        startActivity(intent);
    }
}
