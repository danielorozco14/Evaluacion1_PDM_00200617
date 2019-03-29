package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView totProd1,totProd2,totProd3,totProd4,totProd5,totProd6,totProd7,totProd8,totProd9,nombreUser,emailUser;
    Button mButtonCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getID();
        setTotales();
    }

    public void getID(){
        totProd1=findViewById(R.id.total_producto1);
        totProd2=findViewById(R.id.total_producto2);
        totProd3=findViewById(R.id.total_producto3);
        totProd4=findViewById(R.id.total_producto4);
        totProd5=findViewById(R.id.total_producto5);
        totProd6=findViewById(R.id.total_producto6);
        totProd7=findViewById(R.id.total_producto7);
        totProd8=findViewById(R.id.total_producto8);
        totProd9=findViewById(R.id.total_producto9);
        nombreUser=findViewById(R.id.show_nombreUser);
        emailUser=findViewById(R.id.show_emailUser);

    }

    public void setTotales(){
        Intent mIntent = this.getIntent();
        if(mIntent!=null){
            totProd1.setText(mIntent.getStringExtra("totalProd1"));
            totProd2.setText(mIntent.getStringExtra("totalProd2"));
            totProd3.setText(mIntent.getStringExtra("totalProd3"));
            totProd4.setText(mIntent.getStringExtra("totalProd4"));
            totProd5.setText(mIntent.getStringExtra("totalProd5"));
            totProd6.setText(mIntent.getStringExtra("totalProd6"));
            totProd7.setText(mIntent.getStringExtra("totalProd7"));
            totProd8.setText(mIntent.getStringExtra("totalProd8"));
            totProd9.setText(mIntent.getStringExtra("totalProd9"));

        }

    }
}
