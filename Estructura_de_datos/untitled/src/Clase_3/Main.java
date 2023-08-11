package Clase_3;

public class Main {

    public static void main(String[] args) {

        SimpleLinkedList list = new SimpleLinkedList();

        list.push(1.23);
        list.push(2.4);
        list.push(5.4);
        list.printContent();

        Node nodo = list.insert(2.4, 4.4);
        if(nodo == null){
            System.out.println("No se pudo insetar el nuevo nodo");
        }else{
            System.out.println("El nodo se ah insertado correctamente");
        }

        System.out.println("El nuevo contenido ingresado en la lista es: ");
        list.printContent();

        nodo = list.contains(1.23);
        if(nodo == null){
            System.out.println("El nodo no se ah encontrado");
        }
        else{
            System.out.println("El nodo 1.23 se encontro con exito");
        }

        System.out.println("Eliminacion de nodos");
        while (!list.isEmpty()){
            nodo = list.pop();
            System.out.println("Nodo eliminado");

            nodo.showContent();
        }

        list.printContent();

        list.push("Cat");
        list.push("Dog");
        list.printContent();

        list.delete("Cat");
        System.out.println("Lista despues de eliminar cat: ");
        list.printContent();
    }
}
