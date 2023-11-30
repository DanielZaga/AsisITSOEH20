package com.itsoeh.ccano.asisitsoeh20.accesoADatos;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.itsoeh.ccano.asisitsoeh20.modelo.MClases;

import java.util.ArrayList;

public class AClases extends AccesoADatos{
    public AClases(@Nullable Context context) {
        super(context);
    }

    public void guardar(MClases x){
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("INSERT INTO GRUPO VALUES ( null ,'"+
                x.getGrupo()+"',"+
                x.getNumero_creditos()+","+
                x.getDocente_id()+")"
        );

    }
    public ArrayList<MClases> listar(){
        ArrayList<MClases> lista=new ArrayList<MClases>();
        SQLiteDatabase db=getReadableDatabase();
        Cursor reg=db.rawQuery("SELECT * FROM GRUPO ",null);
        while(reg.moveToNext()){
            MClases x=new MClases();
            x.setClave_unica(reg.getString(0));
            x.setGrupo(reg.getString(1));
            x.setNumero_creditos(reg.getInt(2));
            x.setDocente_id(reg.getInt(3));
            lista.add(x);
        }
        return lista;
    }

    public void actualizar(MClases x){
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "UPDATE GRUPO SET asignatura = ?, creditos=?, iddocente=? WHERE IDGRUPO = ?";
        db.execSQL(sql, new Object[]{
                x.getGrupo(),
                x.getNumero_creditos(),
                x.getDocente_id(),
                x.getClave_unica()
        });
        db.close();
    }

    public void eliminar(int id){
        SQLiteDatabase db= this.getWritableDatabase();
        String sql = "DELETE FROM GRUPO WHERE IDGRUPO = ?";
        db.execSQL(sql,new Object[]{id});
        db.close();
    }
}
