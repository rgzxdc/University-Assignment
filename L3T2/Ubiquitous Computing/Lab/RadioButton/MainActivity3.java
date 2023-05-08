package com.example.amarapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView outputView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        outputView=findViewById(R.id.outputTextviewID);
        Intent mygetIntent= getIntent();
        int result=mygetIntent.getIntExtra(MainActivity2.toTalMarks,0);
        outputView.setText("Your marks is "+result +" out of 10");
    }

    public void tryAgainFunction(View view) {
        Intent myIntent= new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
}