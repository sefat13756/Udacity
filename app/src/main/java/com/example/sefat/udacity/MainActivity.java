package com.example.sefat.udacity;


import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.util.ArrayMap;

public class MainActivity extends ActionBarActivity {
    
    private TextView quantityTextView;
    private TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        quantityTextView = (TextView) findViewById(R.id.text2);
        priceTextView = (TextView) findViewById(R.id.price_text_view);
        
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(2);
        displayNumber(2*5);
    }

    private void display(int number) {
        quantityTextView.setText("" + number);
    }
    private void displayNumber(int number){
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}



