package com.example.rgzxdcfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userFName;
    EditText userLName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userFName = findViewById(R.id.firstName);
        userLName = findViewById(R.id.secondName);
    }

    public void userNames(View view) {
        String fName = userFName.getText().toString();
        String lName = userLName.getText().toString();

        Toast.makeText(this, "Your Full Name is "+ fName+" "+lName, Toast.LENGTH_SHORT).show();
    }
}