package com.example.resourcecounterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Page1Activity extends AppCompatActivity {

    private TextView counterText;
    private int countValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_1);

        counterText = findViewById(R.id.counter1_page1);
        updateCounter();

        findViewById(R.id.plusBtn1_page1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countValue++;
                updateCounter();
            }
        });

        findViewById(R.id.minusBtn1_page1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countValue--;
                updateCounter();
            }
        });

        findViewById(R.id.resetBtn_page1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countValue = 0;
                updateCounter();
            }
        });

        findViewById(R.id.backBtn_page1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void updateCounter() {
        counterText.setText(String.valueOf(countValue));
    }
}
