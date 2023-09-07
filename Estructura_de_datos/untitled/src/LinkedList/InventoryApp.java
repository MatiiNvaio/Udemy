package LinkedList;

import java.util.Scanner;

public class InventoryApp {

    private Scanner sc;
    private Inventory inventory;

    public static void main(String[] args) {

        InventoryApp inv = new InventoryApp();
        inv.init();
    }

    public void init(){

        sc = new Scanner(System.in);
        inventory = new Inventory();

        int op = 1;

        do{
            System.out.println("\n\nMenu");
            System.out.println("- Manejo de inventario -");
            System.out.println("1. Nuevo producto: ");
            System.out.println("2. Agregar producto al inventario: ");
            System.out.println("3. Eliminar producto: ");
            System.out.println("4. Actualizar precio de productos: ");
            System.out.println("5. Mostrar lista de productos: ");
            System.out.println("6. Salir");
            System.out.println("\nSeleccione la opción: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    newProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProductPrice();
                    break;
                case 5:
                    printProduct();
                    break;
                case 6:
                    break;
            }
        }while (op != 6);

    }

    private void newProduct() {
        System.out.println("ID del producto: ");
        int id = sc.nextInt();

        System.out.println("Nombre del producto: ");
        String nombre = sc.next();

        System.out.println("Existencia inicial del producto: ");
        int existencia = sc.nextInt();

        System.out.println("Precio del producto: ");
        Double precio = sc.nextDouble();

        inventory.newProduct(id, nombre, existencia, precio);
    }

    private void addProduct() {
        System.out.println("ID del producto: ");
        int id = sc.nextInt();
        System.out.println("Cuantas unidades agrega: ");
        int cantidadAgregada = sc.nextInt();
        inventory.addProduct(id, cantidadAgregada);
    }

    private void deleteProduct() {
        System.out.println("ID del producto: ");
        int id = sc.nextInt();

        inventory.deleteProducto(id);
    }

    private void updateProductPrice() {
        System.out.println("ID del producto: ");
        int id = sc.nextInt();

        System.out.println("Nuevo precio del producto: ");
        double newPrice = sc.nextDouble();
        inventory.updateProductPrice(id, newPrice);
    }

    private void printProduct() {
        inventory.printProduct();
    }
}
