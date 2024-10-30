
package EJER3;

/**
 *
 * @author USUARIO
 */
public class Coche extends Vehiculo {
    private int puertas;

    public Coche(String marca, double precioCompra, int puertas) {
        super(marca, precioCompra);
        this.puertas = puertas;
    }

    @Override
    public double precioVenta() {
        return super.precioVenta();
    }

    public int getPuertas() {
        return puertas;
    }
}