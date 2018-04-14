package com.example.hp.zedcredit_savings;

import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLDataException;

public class records2Activity extends AppCompatActivity {


    //Declaring
    EditText fname, sname;
    TextView textView;
    Button addbutton, deletebutton, viewbutton, updatebutton;
    DB_Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records2);

        fname = (EditText)findViewById(R.id.editText);
        sname = (EditText)findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView9);

        addbutton = (Button)findViewById(R.id.add_button);
        deletebutton = (Button)findViewById(R.id.delete_button);
        viewbutton = (Button)findViewById(R.id.view_button);
        updatebutton = (Button)findViewById(R.id.update_button);

        controller = new DB_Controller(this,"",null,1);

    }

    public void btn_click(View view) {
        switch (view.getId()){
            case R.id.add_button:
                try{
                    controller.insert_student(fname.getText().toString(),sname.getText().toString());
                }catch (SQLiteException e){
                    Toast.makeText(records2Activity.this,"ALREADY EXISTS",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.delete_button:
                controller.delete_student(fname.getText().toString());
                break;

            case R.id.update_button:
                AlertDialog.Builder dialog = new AlertDialog.Builder(records2Activity.this);
                dialog.setTitle("ENTER NEW FIRST NAME");

                final EditText new_fname = new EditText(this);
                dialog.setView(new_fname);

                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        controller.update_student(fname.getText().toString(),new_fname.getText().toString());
                    }
                });

                dialog.show();
                break;

            case R.id.view_button:
                controller.view_student(textView);
                break;
        }
    }
}
