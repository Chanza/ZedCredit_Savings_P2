package com.example.hp.zedcredit_savings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ImageButton cashboxbutton = (ImageButton) findViewById(R.id.cashbox_imageButton);
        final ImageButton recordsbutton = (ImageButton) findViewById(R.id.records_imageButton);
        final ImageButton savingsbutton = (ImageButton) findViewById(R.id.savings_imageButton);


        cashboxbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cashboxIntent = new Intent (homeActivity.this, cashboxActivity.class);
                homeActivity.this.startActivity(cashboxIntent);

            }
        });

        savingsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent savingsIntent = new Intent (homeActivity.this, savingsActivity.class);
                homeActivity.this.startActivity(savingsIntent);

            }
        });

        recordsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recordsIntent = new Intent (homeActivity.this, recordsActivity.class);
                homeActivity.this.startActivity(recordsIntent);

            }
        });

    }
}
