package com.example.bichodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGrupo         = findViewById(R.id.btnGrupo);
        Button btnDezena        = findViewById(R.id.btnDezena);
        Button btnCentena       = findViewById(R.id.btnCentena);
        Button btnMilhar        = findViewById(R.id.btnMilhar);
        Button btnDuqueGrupo    = findViewById(R.id.btnDuqueGrupo);
        Button btnDuqueDezena   = findViewById(R.id.btnDuqueDezena);
        Button btnTernoGrupo    = findViewById(R.id.btnTernoGrupo);
        Button btnTernoDezena   = findViewById(R.id.btnTernoDezena);

        btnGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, GrupoActivity.class);
                startActivity(intent);

            }
        });

        btnDezena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DezenaActivity.class);
                startActivity(intent);

            }
        });

        btnCentena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CentenaActivity.class);
                startActivity(intent);

            }
        });

        btnMilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MilharActivity.class);
                startActivity(intent);

            }
        });

        btnDuqueGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DuqueGrupoActivity.class);
                startActivity(intent);

            }
        });

        btnDuqueDezena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DuqueDezenaActivity.class);
                startActivity(intent);

            }
        });

        btnTernoGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TernoGrupoActivity.class);
                startActivity(intent);

            }
        });

        btnTernoDezena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TernoDezenaActivity.class);
                startActivity(intent);

            }
        });
    }

    
}
