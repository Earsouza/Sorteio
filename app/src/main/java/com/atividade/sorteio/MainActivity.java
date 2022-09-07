package com.atividade.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText nInicial, nFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nInicial = findViewById(R.id.nInicial);
        nFinal = findViewById(R.id.nFinal);


    }

    public void sortear(View v) {
        int n1 = Integer.parseInt(nInicial.getText().toString());
        int n2 = Integer.parseInt(nFinal.getText().toString());

        int random_int = (int)Math.floor(Math.random()*(n1-n2+1)+n2);

        TextView textView = findViewById(R.id.idResultado);
            textView.setText(" " + random_int);
        }
    }