/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER7;

/**
 *
 * @author USUARIO
 */
public class Habitacion {
    private String nombre;
    private Alfombra[] alfombras;
    private int contador; // Para llevar la cuenta de alfombras

    public Habitacion(String nombre) {
        this.nombre = nombre;
        this.alfombras = new Alfombra[10]; // Tamaño fijo
        this.contador = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarAlfombra(Alfombra alf) {
        if (contador < alfombras.length) {
            alfombras[contador++] = alf;
            return true;
        }
        return false; // No se pudo agregar
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Alfombra alfombra : alfombras) {
            if (alfombra != null) {
                total += alfombra.calcularPrecio();
            }
        }
        return total;
    }

    public double calcularPrecioAlfombrasCuadradas() {
        double total = 0;
        for (Alfombra alfombra : alfombras) {
            if (alfombra instanceof AlfombraCuadrada) {
                total += alfombra.calcularPrecio();
            }
        }
        return total;
    }
}