package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Mascota 1"));
        mascotas.add(new Mascota("Mascota 2"));
        mascotas.add(new Mascota("Mascota 3"));
        mascotas.add(new Mascota("Mascota 4"));

        ArrayList<String> nombresMascotas = new ArrayList<>();

        for (Mascota mascota:mascotas
             ) {
                nombresMascotas.add(mascota.getNombre());
        }
        ListView lstMascotas = (ListView) findViewById(R.id.lstMascotas);
        lstMascotas.setAdapter(new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1, nombresMascotas));

        lstMascotas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                Intent intent = new Intent(MainActivity.this, DetalleMascota.class);
                intent.putExtra("Nombre", mascotas.get(i).getNombre());
                startActivity(intent);
            }
        });

    }
}