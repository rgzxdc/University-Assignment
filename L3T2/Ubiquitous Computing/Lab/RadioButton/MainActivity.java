package com.example.amarapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup myRadioGroup;
    int marks=0;
    public  static String ques1Marks="Data from Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRadioGroup=findViewById(R.id.ques1RadioGroupID);
    }

    public void nextFunction(View view) {
        if(myRadioGroup.getCheckedRadioButtonId()==R.id.ques1RadioBtn3ID){
            marks=5;
        }
        Intent myIntent= new Intent(MainActivity.this,MainActivity2.class);
        myIntent.putExtra(ques1Marks,marks);
        startActivity(myIntent);

    }
}