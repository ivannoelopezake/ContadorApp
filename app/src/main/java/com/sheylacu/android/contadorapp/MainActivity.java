package com.sheylacu.android.contadorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button BotonContar, BotonReiniciar;
    private EditText campoConteo;
    private int Contador =0;
    private  int Reinicio = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        campoConteo = (EditText) findViewById(R.id.campoConteo);
        BotonContar = (Button) findViewById(R.id.botonContar);
        BotonReiniciar = (Button) findViewById(R.id.botonReiniciar);

        BotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Contador++;

                campoConteo.setText("Contador: " +Contador);
            }
        });

        BotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reinicio = 0;
                campoConteo.setText("0");


            }
        });

    }




}
