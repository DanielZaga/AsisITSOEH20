package com.itsoeh.ccano.asisitsoeh20.accesoADatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AccesoADatos extends SQLiteOpenHelper {

    public AccesoADatos(@Nullable Context context) {
        super(context,"SisEscolar", null, 3);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE usuario ("+
                "idUsuario INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nombre TEXT,"+
                "app TEXT,"+
                "apm TEXT,"+
                "mail TEXT,"+
                "contra TEXT)"
        );


        db.execSQL("CREATE TABLE DOCENTE ("+
                "IDDOCENTE INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "NOMBRE TEXT,"+
                "APP TEXT,"+
                "APM TEXT,"+
                "GRADO TEXT,"+
                "GENERO INT,"+
                "TITULO TEXT)"
        );
        db.execSQL("CREATE TABLE ESTUDIANTE ("+
                "IDESTUDIANTE INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "MATRICULA TEXT,"+
                "NOMBRE TEXT,"+
                "APP TEXT,"+
                "APM TEXT,"+
                "MAIL TEXT,"+
                "GENERO INT,"+
                "CARRERA INT)"

        );

        db.execSQL("CREATE TABLE GRUPO ("+
                "IDGRUPO INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "ASIGNATURA TEXT,"+
                "CREDITOS INT,"+
                "IDDOCENTE INT,"+
                "FOREIGN KEY (IDDOCENTE) REFERENCES DOCENTE(IDDOCENTE) )"
        );

        db.execSQL("CREATE TABLE KARDEX ("+
                "IDESTUDIANTE INTEGER ,"+
                "IDGRUPO INTEGER  ,"+
                "CAL INTEGER,"+
                "DIA INTEGER,"+
                "MES INTEGER,"+
                "ANIO INTEGER,"+
                "FOREIGN KEY (IDESTUDIANTE) REFERENCES ESTUDIANTE(IDESTUDIANTE), "+
                "FOREIGN KEY (IDGRUPO) REFERENCES GRUPO(IDGRUPO)) "
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}