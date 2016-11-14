package com.example.sefat.udacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    //Getting the Class Name [Programmatic way]
    private final String TAG = this.getClass().getName();
    
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
        //Added Logging
        Log.d(TAG, "Clicked The Button");

        priceTextView = (TextView) findViewById(R.id.price_text_view);
        quantityTextView = (TextView) findViewById(R.id.text2);

        displayNumber(10);
        display(5);
    }

    private void display(int number) {
        quantityTextView.setText(String.valueOf(number));
    }

    private void displayNumber(int number){
        priceTextView.setText(String.valueOf(number));
    }
}
