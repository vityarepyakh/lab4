package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text2, text3;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        text = findViewById(R.id.editTextTextPersonName);
        text2 = findViewById(R.id.textView4);
        text3 = findViewById(R.id.textView9);
        Bundle arguments = getIntent().getExtras();
        if(arguments != null)
        {
            String date = "Date " + arguments.get("date").toString();
            String time = "Time " + arguments.get("time").toString();
            text2.setText(date);
            text3.setText(time);
        }
    }

    public void clickButton(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        String name = text.getText().toString();
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void clickButton1(View view){
        Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.android.vending");
        startActivity(LaunchIntent);
    }
}