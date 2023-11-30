package com.itsoeh.ccano.asisitsoeh20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.itsoeh.ccano.asisitsoeh20.adapterAdmin.AdapterDocente;
import com.itsoeh.ccano.asisitsoeh20.modelo.MUsuario;

import java.util.ArrayList;

public class nav_profesores extends AppCompatActivity {


    private ImageButton btnregresarMenu, btnmenuHamburgesa;
    private RecyclerView recyclerView;
    private AdapterDocente adapter;
    private ArrayList<MUsuario> users = new ArrayList<>();



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_profesores);


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


        RecyclerView recyclerView = findViewById(R.id.concard_docen_lista);
        AdapterDocente adapter = new AdapterDocente(users);
        recyclerView.setAdapter(adapter);

            }




        private void onClickMenu() {
    }

    private void onClickRegresar() {
        Intent enviarAMenu = new Intent(nav_profesores.this, nav_menu.class);
        startActivity (enviarAMenu);

    }

}
