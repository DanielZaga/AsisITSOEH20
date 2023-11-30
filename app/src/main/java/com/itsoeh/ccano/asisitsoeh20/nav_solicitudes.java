package com.itsoeh.ccano.asisitsoeh20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class nav_solicitudes extends AppCompatActivity {


    private ImageButton btnregresarMenu, btnmenuHamburgesa;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_solicitudes);
        btnregresarMenu = findViewById(R.id.btnregresar);
        btnmenuHamburgesa = findViewById(R.id.btnmenuHamburgesa);


        btnregresarMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickRegresar();
            }
        });

        btnmenuHamburgesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickMenu();
            }
        });

    }

    private void onClickMenu() {
    }

    private void onClickRegresar() {
        Intent enviarAMenu = new Intent(nav_solicitudes.this, nav_menu.class);
        startActivity (enviarAMenu);

    }
}
