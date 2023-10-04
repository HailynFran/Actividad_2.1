package com.example.actividad21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void aceptar(View v){
        EditText etNombre= (EditText) findViewById(R.id.nombre);
        String Nombre= etNombre.getText().toString();

        Intent i = new Intent(this,Resultado.class);
        i.putExtra("nombre", Nombre);
        startActivity(i);

    }




}