package com.example.android.cofeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int numberOfCoffees=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){
        numberOfCoffees+=1;
        display(numberOfCoffees);
        displayPrice(numberOfCoffees);
    }
    public void decrement(View view){
        if(numberOfCoffees>1){
            numberOfCoffees-=1;
            display(numberOfCoffees);
            displayPrice(numberOfCoffees);
        }

    }
    public void submitOrder(View view){

        display(numberOfCoffees);
        displayPrice(numberOfCoffees);
    }
    private void display(int number){
        //Quantity text view
        TextView numberOfQuantity=(TextView) findViewById(R.id.numberOfQuantityTextView);
        numberOfQuantity.setText(""+number);
    }

    private void displayPrice(int number){
        //Price text view
        TextView priceText=(TextView) findViewById(R.id.priceTextView);
        priceText.setText(NumberFormat.getCurrencyInstance().format(number*25));


    }
}