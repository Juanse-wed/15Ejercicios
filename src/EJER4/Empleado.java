
package EJER4;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    // Atributos privados
    private String nombre;
    private String telefono;

    // Atributo estático y privado para contar empleados
    private static int numeroEmpleados = 0;

    // Constructor
    public Empleado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        numeroEmpleados++; // Incrementa el contador al crear un nuevo empleado
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para obtener el número de empleados
    public static int getNumeroEmpleados() {
        return numeroEmpleados;
    }
}