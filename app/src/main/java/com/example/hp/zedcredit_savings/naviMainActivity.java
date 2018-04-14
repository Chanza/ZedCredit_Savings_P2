package com.example.hp.zedcredit_savings;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class naviMainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_main);

        final ImageButton cashboxbutton = (ImageButton) findViewById(R.id.cashbox_imageButton);
        final ImageButton recordsbutton = (ImageButton) findViewById(R.id.records_imageButton);
        final ImageButton savingsbutton = (ImageButton) findViewById(R.id.savings_imageButton);


        cashboxbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cashboxIntent = new Intent (naviMainActivity.this, cashboxActivity.class);
                naviMainActivity.this.startActivity(cashboxIntent);

            }
        });

        savingsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent savingsIntent = new Intent (naviMainActivity.this, savingsActivity.class);
                naviMainActivity.this.startActivity(savingsIntent);

            }
        });

        recordsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recordsIntent = new Intent (naviMainActivity.this, recordsActivity.class);
                naviMainActivity.this.startActivity(recordsIntent);

            }
        });

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
