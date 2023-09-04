package Clase_8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class AccionBuffer {

    Deque<String> bufferAcciones = new ArrayDeque<>();
    Deque<String> redoAcciones = new ArrayDeque<>();

    public void doAccion(String accion){
        System.out.println(accion);
        insertarAccionBuffer(accion);
        System.out.println(bufferAcciones);
    }

    public void undo(){
        if(bufferAcciones.isEmpty()){
            return;}
        System.out.println("Undo");
        String accion = bufferAcciones.pollLast();
        redoAcciones.push(accion);
        System.out.println(bufferAcciones);
    }

    public void redo(){
        System.out.println("redo");
        String accion = redoAcciones.pop();
        insertarAccionBuffer(accion);
        System.out.println("Redo acciones: "+redoAcciones);
        System.out.println("Buffer acciones: "+bufferAcciones);
    }

    private void insertarAccionBuffer(String accion){
        bufferAcciones.offerLast(accion);
    }

    public static void main(String[] args) {
        AccionBuffer buffer = new AccionBuffer();
        buffer.doAccion("Copiar");
        buffer.doAccion("Pegar");
        buffer.doAccion("Escribir hola");
        buffer.doAccion("Borrar");
        buffer.undo();
        buffer.undo();
        buffer.redo();
    }
}
