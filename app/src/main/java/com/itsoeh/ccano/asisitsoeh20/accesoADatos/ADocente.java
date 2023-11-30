package com.itsoeh.ccano.asisitsoeh20.accesoADatos;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.itsoeh.ccano.asisitsoeh20.modelo.MDocente;

import java.util.ArrayList;

public class ADocente extends AccesoADatos{


    public ADocente(@Nullable Context context) {
        super(context);
    }

    public void guardar(MDocente x){
        SQLiteDatabase db = getWritableDatabase();//es para editar
        db.execSQL("INSERT INTO DOCENTE VALUES(null,"+
                "'"+x.getNombre()+"',"+
                "'"+x.getAppelido_paterno()+"',"+
                "'"+x.getAppelido_materno()+"',"+
                "'"+x.getCorreo_electronico()+"',"+
                "'"+x.getMatricula()+"',"+
                "'"+x.getContaseña()+"')"
        );
    }

    public ArrayList<MDocente> listar(){

        ArrayList<MDocente> lista = new ArrayList<MDocente>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor reg=db.rawQuery("SELECT * FROM DOCENTE",null);
        while (reg.moveToNext()){
            MDocente x = new MDocente();
            x.setId(reg.getInt(0));
            x.setNombre(reg.getString(1));
            x.setAppelido_paterno(reg.getString(2));
            x.setAppelido_materno(reg.getString(3));
            x.setCorreo_electronico(reg.getString(4));
            x.setMatricula(reg.getString(5));
            x.setContaseña(reg.getString(6));
            lista.add(x);
        }
        return lista;
    }

    public String getNombre(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor reg = db.rawQuery("SELECT nombre,app,apm FROM DOCENTE WHERE IDDOCENTE="+id,null);
        if (reg.getCount()!=0){
            reg.moveToNext();
            return reg.getString(0)+""+
                    reg.getString(1)+""+
                    reg.getString(2);
        }else
            return null;
    }

    public void actualizarD(MDocente x){
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "UPDATE DOCENTE SET nombre=?, app=?, apm=?, grado=?, genero=?, titulo=? WHERE IDDOCENTE = ?";
        db.execSQL(sql, new Object[]{
                x.getNombre(),
                x.getAppelido_paterno(),
                x.getAppelido_materno(),
                x.getCorreo_electronico(),
                x.getMatricula(),
                x.getContaseña(),
                x.getId()
        });
        db.close();
    }

    public void eliminar(int id){
        SQLiteDatabase db= this.getWritableDatabase();
        String sql = "DELETE FROM DOCENTE WHERE IDDOCENTE = ?";
        db.execSQL(sql,new Object[]{id});
        db.close();
    }
}



