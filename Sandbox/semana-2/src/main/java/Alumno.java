public class Alumno {

    static String instituto = "ISIL";
    String nombre;
    int edad;
    double nota;
    double nota2;

    Alumno(String nombre, int edad, double nota, double nota2){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.nota2 = nota2;
    }

    void  mostrarDatos(){
        System.out.println("Alumno: " + this.nombre);
        System.out.println("Nota: " + this.nota);
    }

    public void calcularPromedio() {
        double promedio = (nota + nota2)/2;
        System.out.println(promedio);
    }

}
