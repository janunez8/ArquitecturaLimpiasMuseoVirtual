/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Entidades;

/**
 *
 * @author jecf-
 */
public class Cuenta {
    private String nombre;
    private String apellido;
    private String usuario;
    private String correo;
    private String contraseña;

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public boolean comprobarExistenciaUser(String login, String email) {
        String loginExistente = "milogin";
        String emailExistente = "miemail";
        return !loginExistente.equals(login)&&!emailExistente.equals(email);
    }
}
