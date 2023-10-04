package com.example.actividad21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    TextView txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtNombre = findViewById(R.id.nombreFinal);
        Bundle datos = getIntent().getExtras();

        txtNombre.setText(datos.getString("nombre"));


    }
}