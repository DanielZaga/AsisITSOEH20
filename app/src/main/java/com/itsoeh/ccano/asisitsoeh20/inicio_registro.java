package com.itsoeh.ccano.asisitsoeh20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.itsoeh.ccano.asisitsoeh20.accesoADatos.AUsuario;
import com.itsoeh.ccano.asisitsoeh20.modelo.MUsuario;

public class inicio_registro extends AppCompatActivity {


    private Button btnGuardar;
    private EditText txtNombre,txtApp,txtApm,txtMail,txtContra,txtContra2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_registro);
        txtNombre = findViewById(R.id.reg_txt_nombre);
        txtApp = findViewById(R.id.reg_txt_app);
        txtApm = findViewById(R.id.reg_txt_apm);
        txtMail = findViewById(R.id.reg_txt_email);
        txtContra = findViewById(R.id.reg_txt_pass);
        txtContra2= findViewById(R.id.reg_txt_pass2);
        btnGuardar= findViewById(R.id.reg_btn_guardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clicGuardar();
                limpiarCampos();


            }
        });

    }

    private void clicGuardar() {
        // Obtener el texto de los campos
        String nombre = txtNombre.getText().toString();
        String app = txtApp.getText().toString();
        String apm = txtApm.getText().toString();
        String email = txtMail.getText().toString();
        String contraseña = txtContra.getText().toString();
        String confirmarContraseña = txtContra2.getText().toString();

        // Verificar si algún campo está vacío
        if (nombre.isEmpty() || app.isEmpty() || apm.isEmpty() || email.isEmpty() || contraseña.isEmpty() || confirmarContraseña.isEmpty()) {
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_LONG).show();
            return;  // No continúa con el proceso si hay campos vacíos
        }

        // Verificar si las contraseñas coinciden
        if (!contraseña.equals(confirmarContraseña)) {
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_LONG).show();
            return;  // No continúa con el proceso si las contraseñas no coinciden
        }

        // Guardar la información
        AUsuario g = new AUsuario(this);
        MUsuario x = new MUsuario();
        x.setNombre(nombre);
        x.setApp(app);
        x.setApm(apm);
        x.setEmail(email);
        x.setContra(contraseña);

        try {
            g.guardar(x);
            limpiarCampos();
            Toast.makeText(this, "Registro guardado", Toast.LENGTH_LONG).show();
            Intent brinco = new Intent(this, inicio_login.class);
            startActivity(brinco);

        } catch (Exception ex) {
            Toast.makeText(this, "Error al guardar el registro", Toast.LENGTH_LONG).show();
        }
    }

    private void limpiarCampos() {
        // Limpiar el contenido de los EditText
        txtNombre.setText("");
        txtApp.setText("");
        txtApm.setText("");
        txtMail.setText("");
        txtContra.setText("");
        txtContra2.setText("");
    }


}
