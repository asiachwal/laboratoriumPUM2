package com.example.student.aplikacjapogodowa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.view.View.OnContextClickListener;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

import android.app.Activity;



public class MainActivity extends AppCompatActivity {

    private EditText edit;

    private TextView tekst;

    private Button pobierz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (EditText)findViewById(R.id.Edit);

        pobierz = (Button)findViewById(R.id.Pobierz);

        pobierz.setOnClickListener(onClick);

        tekst = (TextView)findViewById(R.id.Tekst);


    }
    private View.OnClickListener onClick=new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            tekst.setText(edit.getText().toString());
        }
    };

}
