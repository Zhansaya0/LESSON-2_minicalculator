package com.e.second_projectminicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText number_1, number_2;
    Button btnPlus, btnMinus, btnMulti, btnDivide;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minicalculator);
        number_1 = findViewById(R.id.en_number1);
        number_2 = findViewById(R.id.en_number2);

        btnPlus = findViewById(R.id.bt_plus);
        btnMinus = findViewById(R.id.bt_minus);
        btnMulti = findViewById(R.id.bt_multi);
        btnDivide = findViewById(R.id.bt_divide);
        tvResult = findViewById(R.id.tv_result);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int res = 0;
        if (view.getId() == R.id.bt_plus) {
            res = Integer.parseInt(number_1.getText().toString()) +
                    Integer.parseInt(number_2.getText().toString());
        } else if (view.getId() == R.id.bt_minus) {
            res = Integer.parseInt(number_1.getText().toString()) -
                    Integer.parseInt(number_2.getText().toString());

        } else if (view.getId() == R.id.bt_multi) {
            res = Integer.parseInt(number_1.getText().toString()) *
                    Integer.parseInt(number_2.getText().toString());

        } else if (view.getId() == R.id.bt_divide) {
            res = Integer.parseInt(number_1.getText().toString()) /
                    Integer.parseInt(number_2.getText().toString());
        }
        tvResult.setText("Result:" + res);
    }

    public void btnPlusClicked(View view) {
        int res = Integer.parseInt(number_1.getText().toString()) + Integer.parseInt(number_2.getText().toString());
        tvResult.setText("Result:" + res);
    }
    public void btnMinusClicked(View view) {
        int res = Integer.parseInt(number_1.getText().toString()) - Integer.parseInt(number_2.getText().toString());
        tvResult.setText("Result:" + res);
    }
    public void btnMultiClicked(View view) {
        int res = Integer.parseInt(number_1.getText().toString()) * Integer.parseInt(number_2.getText().toString());
        tvResult.setText("Result:" + res);
    }
    public void btnDivideClicked(View view) {
        int res = Integer.parseInt(number_1.getText().toString()) / Integer.parseInt(number_2.getText().toString());
        tvResult.setText("Result:" + res);
    }
}