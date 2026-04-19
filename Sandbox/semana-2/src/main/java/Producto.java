public class Producto {

    static String tienda = "Tito Market";
    String nombre;
    double precio = 25;
    int stock = 100;
    boolean disponible = true;
    char categoria = 'A';

    void mostrarNombre () {
        System.out.println(nombre);
    }

    void validarStock(){
        int nuevoStock = stock - 20;
        System.out.println(nuevoStock);
    }

    void mostrarCategoria () {
        System.out.println(categoria);
    }
}