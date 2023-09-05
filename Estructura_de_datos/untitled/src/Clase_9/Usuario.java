package Clase_9;

import java.util.Objects;

public class Usuario {

    private int id;
    private String mail;
    private String nombre;
    private String tel;

    public Usuario(int id, String mail, String nombre, String tel) {
        this.id = id;
        this.mail = mail;
        this.nombre = nombre;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.id;
        hash = 43 * hash + Objects.hashCode(this.mail);
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.tel);
        System.out.println("hashcode: "+hash);
        return hash;
    }
}
