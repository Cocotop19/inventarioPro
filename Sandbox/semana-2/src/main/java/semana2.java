public class semana2 {

    public static void main(String[] args) {

        Producto p = new Producto();
        p.nombre = "laptop";
        p.mostrarNombre();
        p.validarStock();
        p.mostrarCategoria();

        Alumno a = new Alumno("tito",10,20,18);
        a.calcularPromedio();
    }

}
