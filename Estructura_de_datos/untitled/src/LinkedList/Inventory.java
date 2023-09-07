package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Inventory {


    private List<Product> productos;

    public Inventory(){
        productos = new LinkedList<>();
    }

    public void newProduct(int id, String nombre, int existencia, Double precio) {

        Product newProduct = new Product(id, nombre, existencia, precio);

        boolean succes = productos.add(newProduct);

        if(succes){
            System.out.println("El producto "+nombre+" se añadio con exito al inventario");
        }else{
            System.out.println("No fue posible añadir el producto "+nombre+" al inventario");
        }
    }

    public void addProduct(int id, int cantidadAgregada){
        int productIndex = productos.indexOf(new Product(id));

        Product product = productos.get(productIndex);
        int existenciaTemp = product.getExistencia();
        int newExistencia = existenciaTemp += cantidadAgregada;
        product.setExistencia(newExistencia);
        System.out.println("Se ah agregado un producto "+product.getNombre()+" exitosamente");
    }

    public void printProduct(){
        System.out.println("Relación de los productos en el almacen: ");
        productos.forEach(System.out::println);
    }

    public void updateProductPrice(int id, double newPrice) {
        int productIndex = productos.indexOf(new Product(id));

        Product product = productos.get(productIndex);
        product.setPrecio(newPrice);

        System.out.println("El precio se actualizo correctamente");
    }

    public void deleteProducto(int id) {
        int productIndex = productos.indexOf(new Product(id));
        Product deleteProduct = productos.remove(productIndex);

        if(deleteProduct != null){
            System.out.println("Se elimino el producto "+deleteProduct.getNombre()+" correctamente");
        }else{
            System.out.println("No fue posible eliminar el producto");
        }
    }
}

