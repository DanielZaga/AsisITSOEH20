package com.itsoeh.ccano.asisitsoeh20.modelo;

public class MDocente {


    private String nombre;
    private String appelido_paterno;
    private String appelido_materno;
    private String correo_electronico;
    private String matricula;
    private int fecha_nacimiento;
    private String contaseña;

    public MDocente() {
    }


    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido_paterno() {
        return appelido_paterno;
    }

    public void setAppelido_paterno(String appelido_paterno) {
        this.appelido_paterno = appelido_paterno;
    }

    public String getAppelido_materno() {
        return appelido_materno;
    }

    public void setAppelido_materno(String appelido_materno) {
        this.appelido_materno = appelido_materno;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(int fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getContaseña() {
        return contaseña;
    }

    public void setContaseña(String contaseña) {
        this.contaseña = contaseña;
    }



}
