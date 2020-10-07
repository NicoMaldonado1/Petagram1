package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetalleMascota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("Nombre");
    }
}