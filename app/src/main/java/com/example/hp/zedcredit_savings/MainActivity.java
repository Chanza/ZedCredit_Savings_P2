package com.example.hp.zedcredit_savings;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button loginbutton = (Button) findViewById(R.id.login_button);
        final TextView regtextView = (TextView) findViewById(R.id.register_textView);


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent (MainActivity.this, navigationActivity.class);
                MainActivity.this.startActivity(loginIntent);

            }
        });

        regtextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent (MainActivity.this, registerActivity.class);
                MainActivity.this.startActivity(registerIntent);

            }
        });






    }
}
