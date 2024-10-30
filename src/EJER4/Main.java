
package EJER4;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un array de 4 empleados
        try (Scanner scanner = new Scanner(System.in)) {
            // Crear un array de 4 empleados
            Empleado[] empleados = new Empleado[4];
            // Leer datos de cada empleado
            for (int i = 0; i < empleados.length; i++) {
                System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");
                
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Teléfono: ");
                String telefono = scanner.nextLine();
                
                empleados[i] = new Empleado(nombre, telefono);
            }   // Mostrar los datos de cada empleado
            System.out.println("\nDatos de los empleados:");
            for (Empleado empleado : empleados) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Teléfono: " + empleado.getTelefono());
            }   // Mostrar el número total de empleados instanciados
            System.out.println("Número total de empleados: " + Empleado.getNumeroEmpleados());
            // Cerrar el scanner
        }
    }
}