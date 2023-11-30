package com.itsoeh.ccano.asisitsoeh20.accesoADatos;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;
import com.itsoeh.ccano.asisitsoeh20.modelo.MUsuario;

public class AUsuario extends AccesoADatos{

    public AUsuario(@Nullable Context context) {
        super(context);
    }

    public void guardar(MUsuario x){
        SQLiteDatabase db = getWritableDatabase();//es para editar
        db.execSQL("INSERT INTO usuario VALUES(null,"+
                "'"+x.getNombre()+"',"+
                "'"+x.getApp()+"',"+
                "'"+x.getApm()+"',"+
                "'"+x.getEmail()+"',"+
                "'"+x.getContra()+"')"


        );
    }
    public String[] buscarContrasenia (String mail){
        String datos[] = new String[2];
        SQLiteDatabase db = getReadableDatabase();
        Cursor reg= db.rawQuery("SELECT nombre, contra FROM usuario WHERE mail = '"+mail+"'",null);
        if(reg.getCount() != 0){
            reg.moveToNext();
            datos[0]= reg.getString(0);
            datos[1]= reg.getString(1);
            return datos;
        }else
            return null;
    }

}