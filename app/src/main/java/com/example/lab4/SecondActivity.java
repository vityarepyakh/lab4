package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SecondActivity extends AppCompatActivity {

    TextView text, text1, text2;
    Date currentDate = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
    String dateText = dateFormat.format(currentDate);
    DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    String timeText = timeFormat.format(currentDate);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        text = findViewById(R.id.textView);
        text1 = findViewById(R.id.textView5);
        text2 = findViewById(R.id.textView6);
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("name").toString();
        text.setText(name);
        text1.setText(dateText);
        text2.setText(timeText);
    }

    public void clickButtonOk(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("date", dateText);
        intent.putExtra("time", timeText);
        startActivity(intent);
    }
}