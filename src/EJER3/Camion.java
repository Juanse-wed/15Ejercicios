
package EJER3;

/**
 *
 * @author USUARIO
 */
public class Camion extends Vehiculo {
    private final double tamanoRemolque;
    private final int numeroEjes;

    public Camion(String marca, double precioCompra, double tamanoRemolque, int numeroEjes) {
        super(marca, precioCompra);
        this.tamanoRemolque = tamanoRemolque;
        this.numeroEjes = numeroEjes;
    }

    /**
     *
     * @return
     */
    @Override
    public double precioVenta() {
        return super.precioVenta() * numeroEjes; // Multiplica por el número de ejes
    }

    public double getTamanoRemolque() {
        return tamanoRemolque;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }
}
