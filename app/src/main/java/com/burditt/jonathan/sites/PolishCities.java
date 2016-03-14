package com.burditt.jonathan.sites;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PolishCities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polish_cities);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClickAuschwitz(View view) {
        Intent intents = new Intent(this, AuschwitzSites.class);
        startActivity(intents);
    }

    public void onClickKrakow(View view) {
        Intent intents = new Intent(this, KrakowSites.class);
        startActivity(intents);
    }

    public void onClickWarsaw(View view) {
        Intent intents = new Intent(this, WarsawSites.class);
        startActivity(intents);
    }

}
