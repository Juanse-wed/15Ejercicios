package EJER6;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        ProfesorEmerito profesorEmerito = new ProfesorEmerito("Juan Pérez", 65, 30, 5);
        
        System.out.println("Nombre: " + profesorEmerito.getNombre());
        System.out.println("Edad: " + profesorEmerito.getEdad());
        System.out.println("Años consolidados: " + profesorEmerito.getAñosConsolidados());
        System.out.println("Años emérito: " + profesorEmerito.getAñosEmerito());
        System.out.println("Salario base: " + profesorEmerito.obtenerSalarioBase());
    }
}
