package EJER3;

/**
 *
 * @author USUARIO
 */
public abstract class Vehiculo {
    protected String marca;
    protected double precioCompra;

    public Vehiculo(String marca, double precioCompra) {
        this.marca = marca;
        this.precioCompra = precioCompra;
    }

    public double precioVenta() {
        return precioCompra * 1.6; // Precio de venta inicial
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }
}
