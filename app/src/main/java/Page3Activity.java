package com.example.resourcecounterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Page3Activity extends AppCompatActivity {

    private TextView counterText1, counterText2, counterText3;
    private int countValue1 = 0, countValue2 = 0, countValue3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_3);

        counterText1 = findViewById(R.id.counter1_page3);
        counterText2 = findViewById(R.id.counter2_page3);
        counterText3 = findViewById(R.id.counter3_page3);
        updateCounter();

        findViewById(R.id.plusBtn1_page3).setOnClickListener(v -> {
            countValue1++;
            updateCounter();
        });

        findViewById(R.id.minusBtn1_page3).setOnClickListener(v -> {
            countValue1--;
            updateCounter();
        });

        findViewById(R.id.plusBtn2_page3).setOnClickListener(v -> {
            countValue2++;
            updateCounter();
        });

        findViewById(R.id.minusBtn2_page3).setOnClickListener(v -> {
            countValue2--;
            updateCounter();
        });

        findViewById(R.id.plusBtn3_page3).setOnClickListener(v -> {
            countValue3++;
            updateCounter();
        });

        findViewById(R.id.minusBtn3_page3).setOnClickListener(v -> {
            countValue3--;
            updateCounter();
        });

        findViewById(R.id.resetBtn_page3).setOnClickListener(v -> {
            countValue1 = 0;
            countValue2 = 0;
            countValue3 = 0;
            updateCounter();
        });

        findViewById(R.id.backBtn_page3).setOnClickListener(v -> finish());
    }

    private void updateCounter() {
        counterText1.setText(String.valueOf(countValue1));
        counterText2.setText(String.valueOf(countValue2));
        counterText3.setText(String.valueOf(countValue3));
    }
}
