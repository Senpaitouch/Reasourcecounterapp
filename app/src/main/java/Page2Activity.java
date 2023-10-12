package com.example.resourcecounterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Page2Activity extends AppCompatActivity {

    private TextView counterText1;
    private TextView counterText2;
    private int countValue1 = 0;
    private int countValue2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);

        counterText1 = findViewById(R.id.counter1_page2);
        counterText2 = findViewById(R.id.counter2_page2);
        updateCounter();

        findViewById(R.id.plusBtn1_page2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countValue1++;
                updateCounter();
            }
        });

        findViewById(R.id.minusBtn1_page2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countValue1--;
                updateCounter();
            }
        });

        findViewById(R.id.plusBtn2_page2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countValue2++;
                updateCounter();
            }
        });

        findViewById(R.id.minusBtn2_page2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countValue2--;
                updateCounter();
            }
        });

        findViewById(R.id.resetBtn_page2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countValue1 = 0;
                countValue2 = 0;
                updateCounter();
            }
        });

        findViewById(R.id.backBtn_page2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void updateCounter() {
        counterText1.setText(String.valueOf(countValue1));
        counterText2.setText(String.valueOf(countValue2));
    }
}
