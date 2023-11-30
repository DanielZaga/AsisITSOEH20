package com.itsoeh.ccano.asisitsoeh20.accesoADatos;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.itsoeh.ccano.asisitsoeh20.modelo.MEstudiante;

import java.util.ArrayList;

public class AEstudiantes extends AccesoADatos{
    public AEstudiantes(@Nullable Context context) {
        super(context);
    }

    public void guardar(MEstudiante x){
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("INSERT INTO ESTUDIANTE VALUES ("+ null+" ,'"+
                x.getMatricula()+"' ,'"+
                x.getNombre()+"' ,'"+
                x.getApellido_paterno()+"' ,'"+
                x.getApellido_materno()+"' ,'"+
                x.getMail()+"',"+
                x.getContraseña()+")"
        );

    }
    public ArrayList<MEstudiante> listar(){
        ArrayList<MEstudiante> lista=new ArrayList<MEstudiante>();
        SQLiteDatabase db=getReadableDatabase();
        Cursor reg=db.rawQuery("SELECT * FROM ESTUDIANTE ",null);
        while(reg.moveToNext()){
            MEstudiante x=new MEstudiante();
            x.setId(reg.getInt(0));
            x.setMatricula(reg.getString(1));
            x.setNombre(reg.getString(2));
            x.setApellido_paterno(reg.getString(3));
            x.setApellido_materno(reg.getString(4));
            x.setMail(reg.getString(5));
            x.setContraseña(reg.getString(6));
            lista.add(x);
        }
        return lista;
    }


    public void actualizar(MEstudiante x){
        SQLiteDatabase db=this.getWritableDatabase();
        String sql = "UPDATE ESTUDIANTE SET matricula=?, nombre=?,app=?,apm=?,mail=?,genero=?,carrera=? WHERE IDESTUDIANTE=?";
        db.execSQL(sql,new Object[]{
                x.getMatricula(),
                x.getNombre(),
                x.getApellido_paterno(),
                x.getApellido_materno(),
                x.getMail(),
                x.getContraseña()

        });
        db.close();
    }

    public void eliminar(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "DELETE FROM ESTUDIANTE WHERE IDESTUDIANTE = ?";
        db.execSQL(sql,new Object[]{id});
        db.close();

    }
}