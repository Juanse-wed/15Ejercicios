
package EJER3;

/**
 *
 * @author USUARIO
 */
public class Furgoneta extends Vehiculo {
    private final double capacidadCarga; // En metros cúbicos

    public Furgoneta(String marca, double precioCompra, double capacidadCarga) {
        super(marca, precioCompra);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double precioVenta() {
        double precioVentaInicial = super.precioVenta();
        if (capacidadCarga > 10) {
            return precioVentaInicial * 1.2; 
        }
        return precioVentaInicial;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}