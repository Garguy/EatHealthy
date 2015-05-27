package com.poweron_studio.eathealthy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Juice extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juice);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_juice, menu);
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

    public void blackberryOnClick(View view) {
        Intent intent = new Intent(this, BlackBerryPop.class);
        startActivity(intent);
    }

    public void buttershakeOnClick(View view) {
        Intent intent = new Intent(this, ButterShake.class);
        startActivity(intent);
    }

    public void greenmealtOnClick(View view) {
        Intent intent = new Intent(this, GreenMeal.class);
        startActivity(intent);
    }

    public void pinacoladaOnClick(View view) {
        Intent intent = new Intent(this, PinaColada.class);
        startActivity(intent);
    }

    public void cinnatoastOnClick(View view) {
        Intent intent = new Intent(this, CinnaToast.class);
        startActivity(intent);
    }

    public void v8OnClick(View view) {
        Intent intent = new Intent(this, V8.class);
        startActivity(intent);
    }

    public void applecrispOnClick(View view) {
        Intent intent = new Intent(this, AppleCrisp.class);
        startActivity(intent);
    }

    public void coconutOnClick(View view) {
        Intent intent = new Intent(this, CoconutSplash.class);
        startActivity(intent);
    }
}
