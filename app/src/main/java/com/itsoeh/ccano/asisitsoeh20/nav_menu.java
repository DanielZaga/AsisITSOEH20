package com.itsoeh.ccano.asisitsoeh20;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nav_menu extends AppCompatActivity {

    private Button btnDocentes, btnAlumnos, btnSolicitudes;

    public nav_menu(){

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_menu);
        btnDocentes = findViewById(R.id.btn_menuProfesores);
        btnAlumnos = findViewById(R.id.btn_menuEstudiantes);
        btnSolicitudes = findViewById(R.id.btn_menuSolicitudes);

        btnDocentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickProfesores();
            }
        });

        btnAlumnos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickEstudiantes();
            }
        });

        btnSolicitudes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSolicitudes();
            }
        });

    }
    private void onClickSolicitudes() {
        Intent enviarASolicitudes = new Intent(nav_menu.this, nav_solicitudes.class);
        startActivity (enviarASolicitudes);
    }
    private void onClickEstudiantes() {
        Intent enviarAEstudiantes = new Intent(nav_menu.this, nav_alumnos.class);
        startActivity (enviarAEstudiantes);
    }
    public void onClickProfesores(){
        Intent enviarAProfesores = new Intent(nav_menu.this, nav_profesores.class);
        startActivity (enviarAProfesores);
    }



}
