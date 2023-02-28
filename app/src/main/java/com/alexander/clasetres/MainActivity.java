package com.alexander.clasetres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "Depuración";
    EditText ladoUno, ladoDos;
    TextView result;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.util.Log.i(TAG, "Estoy en OnCreate");
        ladoUno = findViewById(R.id.ladoUno);
        ladoDos = findViewById(R.id.ladoDos);
        result = findViewById(R.id.result);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoActivity2(view);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Estoy en onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Estoy en onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, " Estoy en onPause: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Estoy en onDestroy: ");
    }

    //Creo una funcion, con nombre gotoActivity2, es publica y no espera nada de respuesta
    //Vire es el tipo de dato(en este caso,  un objeto que es la vista View)
    //view es el nombre del objeto que recibe la función

    public void gotoActivity2(View view) {

        float sideOne = Float.parseFloat(ladoUno.getText().toString());
        float sideTwo = Float.parseFloat(ladoDos.getText().toString());
        float result = sideOne*sideTwo;
        Log.i(TAG, String.valueOf(sideOne));
        Intent sendData = new Intent(this, secontDisplay.class);
        sendData.putExtra("numberOne", sideOne);
        sendData.putExtra("numberTwo", sideTwo);
        sendData.putExtra("result", result);
        startActivity(sendData);
    }
}