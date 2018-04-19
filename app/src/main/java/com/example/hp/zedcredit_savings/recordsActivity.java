package com.example.hp.zedcredit_savings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class recordsActivity extends AppCompatActivity {
    DB_Controller_T controller;
    TextView recordsViewText, displayrecords1,displayrecords2,displayrecords3,displayrecords4,displayrecords5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        recordsViewText = (TextView) findViewById(R.id.aRecords_textView);
        displayrecords1 = (TextView) findViewById(R.id.val1);
        displayrecords2 = (TextView) findViewById(R.id.val2);
        displayrecords3 = (TextView) findViewById(R.id.val3);
        displayrecords4 = (TextView) findViewById(R.id.val4);
        displayrecords5 = (TextView) findViewById(R.id.val5);
        controller = new DB_Controller_T (this,"",null,1);



        recordsViewText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.view_trans_temp(displayrecords1, displayrecords2, displayrecords3, displayrecords4,displayrecords5);
            }
        });


    }
}
