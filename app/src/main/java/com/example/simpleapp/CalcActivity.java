package com.example.simpleapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        EditText editTextFirst = findViewById(R.id.etFirst);
        EditText editTextSecond = findViewById(R.id.etSecond);
        EditText editTextThird = findViewById(R.id.etThird);
        Button btnCalc = findViewById(R.id.btnStart);
        btnCalc.setOnClickListener(v -> {
            String firstTermStr = editTextFirst.getText().toString();
            String secondTermsStr = editTextSecond.getText().toString();
            String ThirdTermsStr = editTextThird.getText().toString();
            if (!firstTermStr.isEmpty() && !secondTermsStr.isEmpty()) {
                int result = Integer.parseInt(firstTermStr) - Integer.parseInt(secondTermsStr) - Integer.parseInt(ThirdTermsStr);
                Intent intent = new Intent();
                intent.putExtra("data",result);
                setResult(RESULT_OK,intent);
                finish();
            }else {
                Toast.makeText(getApplicationContext(),"Invalid terms",Toast.LENGTH_LONG).show();
            }
        });
    }
}