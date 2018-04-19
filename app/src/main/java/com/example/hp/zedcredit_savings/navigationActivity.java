package com.example.hp.zedcredit_savings;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class navigationActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);



        final ImageButton cashboxbutton = (ImageButton) findViewById(R.id.cashbox_imageButton);
        final ImageButton recordsbutton = (ImageButton) findViewById(R.id.records_imageButton);
        final ImageButton savingsbutton = (ImageButton) findViewById(R.id.savings_imageButton);


        cashboxbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cashboxIntent = new Intent(navigationActivity.this, cashboxActivity.class);
                navigationActivity.this.startActivity(cashboxIntent);

            }
        });

        savingsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent savingsIntent = new Intent(navigationActivity.this, savingsActivity.class);
                navigationActivity.this.startActivity(savingsIntent);

            }
        });

        recordsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recordsIntent = new Intent(navigationActivity.this, recordsActivity.class);
                navigationActivity.this.startActivity(recordsIntent);

            }
        });

        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.wallet)
        {
            Toast.makeText(this,"wallet not available",Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.groups)
        {
            Toast.makeText(this,"groups not available",Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.jgroups)
        {
            Intent joinIntent = new Intent(navigationActivity.this, joinActivity.class);
            navigationActivity.this.startActivity(joinIntent);
        }
        if(id == R.id.crgroups)
        {
            Intent joinIntent = new Intent(navigationActivity.this, creatingActivity.class);
            navigationActivity.this.startActivity(joinIntent);
        }
        if(id == R.id.mepro)
        {
            Toast.makeText(this,"profile not available",Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
