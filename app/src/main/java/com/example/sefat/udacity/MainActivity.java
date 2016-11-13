package com.example.sefat.udacity;


import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.util.ArrayMap;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(2);
        displayNumber(2*5);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.text2);
        quantityTextView.setText("" + number);
    }
    private void displayNumber(int number){
        TextView PriceTextView=(TextView) findViewById(R.id.price_text_view);
        PriceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}



