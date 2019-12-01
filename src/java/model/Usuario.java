package model;

public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private int nivel;

    public Usuario(String nombre, String apellido, String correo, int nivel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    
}
