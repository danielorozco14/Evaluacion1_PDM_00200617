package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //ID DE LOS CONTADORES DE PRODUCTO EN MAIN ACTIVITY
    TextView contProd1,contProd2,contProd3,contProd4,
            contProd5,contProd6,contProd7,contProd8,contProd9;

    //TEXT VIEW CON EL NOMBRE DEL PRODUCTO QUE SERVIRA COMO BOTON PARA SUMAR LOS CONTADORES
    TextView pic1,pic2,pic3,pic4,pic5,pic6,pic7,pic8,pic9;
    EditText nomUser,emailUser;

    Button btSend; //BOTON DE PRIMERA ACTIVIDAD

    public int getCont1() {
        return cont1;
    }

    public int getCont2() {
        return cont2;
    }

    public int getCont3() {
        return cont3;
    }

    public int getCont4() {
        return cont4;
    }

    public int getCont5() {
        return cont5;
    }

    public int getCont6() {
        return cont6;
    }

    public int getCont7() {
        return cont7;
    }

    public int getCont8() {
        return cont8;
    }

    public int getCont9() {
        return cont9;
    }

    int cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obtID();
        setClick();
    }

    public void obtID(){
        //ID DE LOS CONTADORES QUE SE VAN A IR SUMANDO
        contProd1=findViewById(R.id.cont_producto1);
        contProd2=findViewById(R.id.cont_producto2);
        contProd3=findViewById(R.id.cont_producto3);
        contProd4=findViewById(R.id.cont_producto4);
        contProd5=findViewById(R.id.cont_producto5);
        contProd6=findViewById(R.id.cont_producto6);
        contProd7=findViewById(R.id.cont_producto7);
        contProd8=findViewById(R.id.cont_producto8);
        contProd9=findViewById(R.id.cont_producto9);

        //ID DE LOS NOMBRES DE LOS PRODUCTOS QUE SIRVEN COMO BOTON
        pic1=findViewById(R.id.pic1);
        pic2=findViewById(R.id.pic2);
        pic3=findViewById(R.id.pic3);
        pic4=findViewById(R.id.pic4);
        pic5=findViewById(R.id.pic5);
        pic6=findViewById(R.id.pic6);
        pic7=findViewById(R.id.pic7);
        pic8=findViewById(R.id.pic8);
        pic9=findViewById(R.id.pic9);

        //ID DE BOTON PARA ENVIAR LOS DATOS
        btSend=findViewById(R.id.btn_enviar);
        //ID DE EDIT TEXT
        nomUser=findViewById(R.id.inputName);
        emailUser=findViewById(R.id.inputEmail);
    }

    public void setClick(){
        pic1.setOnClickListener(v->{
            cont1++;
            contProd1.setText(Integer.toString(cont1));
            Log.d("MMA",Integer.toString(cont1));
        });
        pic2.setOnClickListener(v->{
            cont2++;
            contProd2.setText(Integer.toString(cont2));
            Log.d("MMA",Integer.toString(cont2));
        });
        pic3.setOnClickListener(v->{
            cont3++;
            contProd3.setText(Integer.toString(cont3));
            Log.d("MMA",Integer.toString(cont3));
        });
        pic4.setOnClickListener(v->{
            cont4++;
            contProd4.setText(Integer.toString(cont4));
            Log.d("MMA",Integer.toString(cont4));
        });
        pic5.setOnClickListener(v->{
            cont5++;
            contProd5.setText(Integer.toString(cont5));
            Log.d("MMA",Integer.toString(cont5));
        });
        pic6.setOnClickListener(v->{
            cont6++;
            contProd6.setText(Integer.toString(cont6));
            Log.d("MMA",Integer.toString(cont6));
        });
        pic7.setOnClickListener(v->{
            cont7++;
            contProd7.setText(Integer.toString(cont7));
            Log.d("MMA",Integer.toString(cont7));
        });
        pic8.setOnClickListener(v->{
            cont8++;
            contProd8.setText(Integer.toString(cont8));
            Log.d("MMA",Integer.toString(cont8));
        });
        pic9.setOnClickListener(v->{
            cont9++;
            contProd9.setText(Integer.toString(cont9));
            Log.d("MMA",Integer.toString(cont9));
        });

        btSend.setOnClickListener(v -> {
            Intent mIntent = new Intent(MainActivity.this,SecondActivity.class);
            mIntent.putExtra("totalProd1",Integer.toString(getCont1()));
            mIntent.putExtra("totalProd2",Integer.toString(getCont2()));
            mIntent.putExtra("totalProd3",Integer.toString(getCont3()));
            mIntent.putExtra("totalProd4",Integer.toString(getCont4()));
            mIntent.putExtra("totalProd5",Integer.toString(getCont5()));
            mIntent.putExtra("totalProd6",Integer.toString(getCont6()));
            mIntent.putExtra("totalProd7",Integer.toString(getCont7()));
            mIntent.putExtra("totalProd8",Integer.toString(getCont8()));
            mIntent.putExtra("totalProd9",Integer.toString(getCont9()));
            mIntent.putExtra("nombreUser",nomUser.getText().toString().trim());
            mIntent.putExtra("emailUser",emailUser.getText().toString().trim());
            startActivity(mIntent);
        });
    }
}
