package com.burditt.jonathan.sites;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class GermanyCities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany_cities);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClickBerlin(View view) {
        Intent intents = new Intent(this, BerlinSites.class);
        startActivity(intents);
    }

    public void onClickCologne(View view) {
        Intent intents = new Intent(this, CologneSites.class);
        startActivity(intents);
    }

    public void onClickDauchau(View view) {
        Intent intents = new Intent(this, DauchauSites.class);
        startActivity(intents);
    }

    public void onClickDresden(View view) {
        Intent intents = new Intent(this, DresdenSites.class);
        startActivity(intents);
    }

    public void onClickFussen(View view) {
        Intent intents = new Intent(this, FussenSites.class);
        startActivity(intents);
    }


    public void onClickHamburg(View view) {
        Intent intents = new Intent(this, HamburgSites.class);
        startActivity(intents);
    }

    public void onClickLeipzig(View view) {
        Intent intents = new Intent(this, LeipzigSites.class);
        startActivity(intents);
    }

    public void onClickMoselCountry(View view) {
        Intent intents = new Intent(this, MoselCountrySites.class);
        startActivity(intents);
    }

    public void onClickMunich(View view) {
        Intent intents = new Intent(this, MunichSites.class);
        startActivity(intents);
    }

    public void onClickPotsdam(View view) {
        Intent intents = new Intent(this, PotsdamSites.class);
        startActivity(intents);
    }

    public void onClickRhineArea(View view) {
        Intent intents = new Intent(this, RhineAreaSites.class);
        startActivity(intents);
    }

    public void onClickRothenberg(View view) {
        Intent intents = new Intent(this, RothenbergSites.class);
        startActivity(intents);
    }

    public void onClickSwissAlps(View view) {
        Intent intents = new Intent(this, SwissAlpsSites.class);
        startActivity(intents);
    }

    public void onClickWittenberg(View view) {
        Intent intents = new Intent(this, WittenbergSites.class);
        startActivity(intents);
    }

    public void onClickOther(View view) {
        Intent intents = new Intent(this, OtherGermanySites.class);
        startActivity(intents);
    }
}
