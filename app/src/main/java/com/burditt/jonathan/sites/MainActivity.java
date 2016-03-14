package com.burditt.jonathan.sites;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onClickGermany(View view) {
        Intent intent = new Intent(this, GermanyCities.class);
        startActivity(intent);
    }

    public void onClickAustria(View view) {
        Intent intent = new Intent(this, AustrianCities.class);
        startActivity(intent);
    }

    public void onClickDenmark(View view) {
        Intent intent = new Intent(this, DanishCities.class);
        startActivity(intent);
    }

    public void onClickCzech(View view) {
        Intent intent = new Intent(this, CzechCities.class);
        startActivity(intent);
    }

    public void onClickHungary(View view) {
        Intent intent = new Intent(this, HungarianCities.class);
        startActivity(intent);
    }

    public void onClickPhilippines(View view) {
        Intent intent = new Intent(this, FilipinoCities.class);
        startActivity(intent);
    }

    public void onClickPoland(View view) {
        Intent intent = new Intent(this, PolishCities.class);
        startActivity(intent);
    }

    public void onClickSingapore(View view) {
        Intent intent = new Intent(this, SingaporeanCities.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
