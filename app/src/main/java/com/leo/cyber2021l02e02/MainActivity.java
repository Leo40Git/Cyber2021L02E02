package com.leo.cyber2021l02e02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random rnd;
    private int num1, num2;
    private TextView tvNum1, tvNum2, tvResult;
    private Button btnCompareLss, btnCompareEql, btnCompareGtr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rnd = new Random();
        num1 = num2 = 0;
        tvNum1 = findViewById(R.id.tvNum1);
        tvNum2 = findViewById(R.id.tvNum2);
        tvResult = findViewById(R.id.tvResult);
        btnCompareLss = findViewById(R.id.btnCompareLss);
        btnCompareEql = findViewById(R.id.btnCompareEql);
        btnCompareGtr = findViewById(R.id.btnCompareGtr);
        setCompareButtonsEnabled(false);
    }

    private void setCompareButtonsEnabled(boolean e) {
        btnCompareLss.setEnabled(e);
        btnCompareEql.setEnabled(e);
        btnCompareGtr.setEnabled(e);
    }

    public void onClick_btnGenerate(View view) {
        num1 = rnd.nextInt(100);
        num2 = rnd.nextInt(100);
        tvNum1.setText(Integer.toString(num1));
        tvNum2.setText(Integer.toString(num2));
        tvResult.setText("Choose an answer!");
        setCompareButtonsEnabled(true);
    }

    public void onClick_btnCompareLss(View view) {
        tvResult.setText(Boolean.toString(num1 < num2));
        setCompareButtonsEnabled(false);
    }

    public void onClick_btnCompareEql(View view) {
        tvResult.setText(Boolean.toString(num1 == num2));
        setCompareButtonsEnabled(false);
    }

    public void onClick_btnCompareGtr(View view) {
        tvResult.setText(Boolean.toString(num1 > num2));
        setCompareButtonsEnabled(false);
    }
}
