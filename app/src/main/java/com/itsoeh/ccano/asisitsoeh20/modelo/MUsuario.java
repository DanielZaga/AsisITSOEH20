package com.itsoeh.ccano.asisitsoeh20.modelo;

public class MUsuario {
    private String nombre;
    private String app;
    private String apm;
    private String email;
    private String contra;

    public MUsuario(String nombre, String app, String apm, String email, String contra) {
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.email = email;
        this.contra = contra;
    }

    public MUsuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "MUsuario{" +
                "nombre='" + nombre + '\'' +
                ", app='" + app + '\'' +
                ", apm='" + apm + '\'' +
                ", email='" + email + '\'' +
                ", contra='" + contra + '\'' +
                '}';
    }
}
