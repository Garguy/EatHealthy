package com.poweron_studio.eathealthy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class GlutenFree extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gluten_free);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gluten_free, menu);
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

    public void proteinwafflesOnClick(View view) {
        Intent intent = new Intent(this, GlutenFreeWaffles.class);
        startActivity(intent);
    }

    public void glutenfreepizzaOnClick(View view) {
        Intent intent = new Intent(this, GlutenFreePizza.class);
        startActivity(intent);
    }

    public void breadOnClick(View view) {
        Intent intent = new Intent(this, GlutenFreeBread.class);
        startActivity(intent);
    }

    public void nutbreadOnClick(View view) {
        Intent intent = new Intent(this, PaleoBread.class);
        startActivity(intent);
    }

    public void peanutbuttercookieOnClick(View view) {
        Intent intent = new Intent(this, ChocolateCookies.class);
        startActivity(intent);
    }

    public void oatmealcookiesOnClick(View view) {
        Intent intent = new Intent(this, OatmealCookies.class);
        startActivity(intent);
    }

    public void beanchiliOnClick(View view) {
        Intent intent = new Intent(this, BlackBeanChili.class);
        startActivity(intent);
    }

    public void basilshrimpOnClick(View view) {
        Intent intent = new Intent(this, BasilShrimp.class);
        startActivity(intent);
    }
}
