package com.itsoeh.ccano.asisitsoeh20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class nav_clases_info extends AppCompatActivity {



    private ImageButton btnregresarMenu, btnmenuHamburgesa;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_profesores_clases);
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
        Intent enviarAMenu = new Intent(nav_clases_info.this, nav_profesores_clases.class);
        startActivity (enviarAMenu);

    }

}
