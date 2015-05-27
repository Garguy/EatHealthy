package com.poweron_studio.eathealthy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Dessert extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dessert, menu);
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

    public void pumpkinmousseOnClick(View view) {
        Intent intent = new Intent(this, PumpkinMousse.class);
        startActivity(intent);
    }

    public void coconutcookiesOnClick(View view) {
        Intent intent = new Intent(this, CoconutCookies.class);
        startActivity(intent);
    }

    public void pumkinpieOnClick(View view) {
        Intent intent = new Intent(this, PumpkinPie.class);
        startActivity(intent);
    }

    public void peanutbuttercupsOnClick(View view) {
        Intent intent = new Intent(this, PeanutButterCups.class);
        startActivity(intent);
    }

    public void nobakecookieOnClick(View view) {
        Intent intent = new Intent(this, NoBakeCookies.class);
        startActivity(intent);
    }

    public void peanutbutterballsOnClick(View view) {
        Intent intent = new Intent(this, PeanutBalls.class);
        startActivity(intent);
    }

    public void chocolateloversOnClick(View view) {
        Intent intent = new Intent(this, ChocolateLovers.class);
        startActivity(intent);
    }

    public void carrotcakeOnClick(View view) {
        Intent intent = new Intent(this, CarrotCake.class);
        startActivity(intent);
    }
}
