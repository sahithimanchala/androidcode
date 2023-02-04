package com.example.emiapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private EditText price;
private EditText interest;
private final EditText time;
private EditText monthlyemi;
private EditText interstprice;

    public MainActivity(EditText time) {
        this.time = time;
    }

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       price=(EditText) findViewById(R.id.Totalprice);
        interest=(EditText) findViewById(R.id.Rateofinterest);
        monthlyemi=(EditText) findViewById(R.id.Time);
        interstprice=(EditText) findViewById(R.id.interestamount);


    }
    public void btnsum(View view)
    {
        double price1=Integer.parseInt(price.getText().toString());
        double interest1=Integer.parseInt(interest.getText().toString());
        int time1=Integer.parseInt(time.getText().toString());
    int time3=(time1*12);
    double priceamount=price1*(interest1/100);
    double power=Math.pow(interest1/100+1,time3);
    double sum=priceamount/(1-(1/power));
    double totalinter=sum*time3-price1;
    double totalpay=price1+totalinter;
    monthlyemi.setText(String.valueOf(sum));
    interstprice.setText(String.valueOf(time3));
    price.setText(String.valueOf(price1));
    interest.setText(String.valueOf(totalinter));
    interstprice.setText(String.valueOf(totalpay));

    }}