package com.kbj.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        Double rate = 0.12;

        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);

        Log.i("amount entered: ", amountEditText.getText().toString());
        Log.i("rate being used: ", rate.toString());

        try {
            Toast.makeText(this, "Converted Amount: " + rate * Integer.parseInt(amountEditText.getText().toString()), Toast.LENGTH_LONG).show();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            Toast.makeText(this, "input format error", Toast.LENGTH_LONG).show();
        }
    }
}