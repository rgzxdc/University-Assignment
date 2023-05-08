package com.example.amarapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup myRadioGroup2;
    int q2marks=0;
    int q1mark,allmark;
    public  static String toTalMarks="Data from Main Activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myRadioGroup2=findViewById(R.id.ques2RadioGroupID);
        Intent mygetIntent=getIntent();
        q1mark=mygetIntent.getIntExtra(MainActivity.ques1Marks,0);
    }

    public void submitFunction(View view) {
        if(myRadioGroup2.getCheckedRadioButtonId()==R.id.ques2RadioBtn1ID){
            q2marks=5;
        }
        allmark=q1mark+q2marks;
        Intent myIntent= new Intent(MainActivity2.this,MainActivity3.class);

        myIntent.putExtra(toTalMarks,allmark);
        startActivity(myIntent);
    }
}