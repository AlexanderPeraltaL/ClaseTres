package com.alexander.clasetres;

import androidx.appcompat.app.AppCompatActivity;

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
    }

    @Override
    protected void onStart() {
        super.onStart();
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float sideOne = Float.parseFloat(ladoUno.getText().toString());
                float sideTwo = Float.parseFloat(ladoDos.getText().toString());
                float resultado = sideOne*sideTwo;
                result.setText("Su resultado es: "+String.valueOf(resultado));
            }
        });
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
}