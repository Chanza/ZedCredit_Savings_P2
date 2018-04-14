package com.example.hp.zedcredit_savings;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class cashboxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashbox);


        //creating dialogs for sending

        ImageButton mShowDialog = (ImageButton)findViewById(R.id.cashbox_imageButton2);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(cashboxActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_send, null);
                final EditText mGroup = (EditText)mView.findViewById(R.id.gname_editText);
                final EditText mUser = (EditText)mView.findViewById(R.id.uname_editText);
                Button mSend = (Button) mView.findViewById(R.id.send_button);

                mSend.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!mGroup.getText().toString().isEmpty() && !mUser.getText().toString().isEmpty()){
                            Toast.makeText(cashboxActivity.this,
                                    R.string.money_sent_msg, Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(cashboxActivity.this,
                                    R.string.empty_fields_msg, Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

            }
        });



        //creating dialogs for receiving

        ImageButton mShowDialog_2 = (ImageButton)findViewById(R.id.cashbox_imageButton3);
        mShowDialog_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(cashboxActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_receive, null);
                final EditText mGroup = (EditText)mView.findViewById(R.id.gname_editText);
                final EditText mUser = (EditText)mView.findViewById(R.id.uname_editText);
                Button mSend = (Button) mView.findViewById(R.id.receive_button);

                mSend.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!mGroup.getText().toString().isEmpty() && !mUser.getText().toString().isEmpty()){
                            Toast.makeText(cashboxActivity.this,
                                    R.string.money_received_msg, Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(cashboxActivity.this,
                                    R.string.empty_fields_msg, Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

            }
        });



    }
}
