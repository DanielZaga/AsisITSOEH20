package com.itsoeh.ccano.asisitsoeh20;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.itsoeh.ccano.asisitsoeh20.adapterAdmin.AdapterDocente;
import com.itsoeh.ccano.asisitsoeh20.modelo.MUsuario;

import java.util.ArrayList;

public class nav_profesores_clases extends AppCompatActivity {


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
        Intent enviarAMenu = new Intent(nav_profesores_clases.this, nav_profesores.class);
        startActivity (enviarAMenu);

    }


    //---------------------------------------------------------------------------------------------------//

}
