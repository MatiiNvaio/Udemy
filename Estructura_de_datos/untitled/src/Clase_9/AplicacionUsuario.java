package Clase_9;

import java.util.HashMap;
import java.util.Map;

public class AplicacionUsuario {

    public static void main(String[] args) {
        Map<Usuario, Usuario> usuarios = new HashMap<>();

        Usuario usuario1 = new Usuario(1, "matias@gmail.com", "Matias", "12345");
        Usuario usuario2 = new Usuario(2, "jorge@gmail.com", "Jorge", "12345");
        Usuario usuario3 = new Usuario(3, "franco@gmail.com", "Franco", "12345");
        Usuario usuario4 = new Usuario(3, "franco@gmail.com", "Franco", "12345678");

        usuarios.put(usuario1, usuario1);
        usuarios.put(usuario2, usuario2);
        usuarios.put(usuario3, usuario3);
        usuarios.put(usuario4, usuario4);

        //System.out.println("hashcode usuario 1: "+usuario1.hashCode());

    }
}
