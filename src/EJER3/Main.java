
package EJER3;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        // Array de camiones
        Vehiculo[] camiones = new Camion[3];
        camiones[0] = new Camion("Volvo", 30000, 15, 2);
        camiones[1] = new Camion("Mercedes", 40000, 20, 3);
        camiones[2] = new Camion("MAN", 25000, 10, 2);

        // Mostrar precio de venta de camiones
        System.out.println("Precios de venta de camiones:");
        for (Vehiculo camion : camiones) {
            System.out.printf("%s: %.2f€\n", camion.getMarca(), camion.precioVenta());
        }

        // Array de furgonetas
        Vehiculo[] furgonetas = new Furgoneta[2];
        furgonetas[0] = new Furgoneta("Peugeot", 20000, 12);
        furgonetas[1] = new Furgoneta("Citroën", 18000, 8);

        // Mostrar precio de venta de furgonetas
        System.out.println("\nPrecios de venta de furgonetas:");
        for (Vehiculo furgoneta : furgonetas) {
            System.out.printf("%s: %.2f€\n", furgoneta.getMarca(), furgoneta.precioVenta());
        }

        // Mejora 1: Unir los arrays en un único array
        Vehiculo[] vehiculos = new Vehiculo[5];
        System.arraycopy(camiones, 0, vehiculos, 0, camiones.length);
        System.arraycopy(furgonetas, 0, vehiculos, camiones.length, furgonetas.length);

        // Mostrar precios de venta de todos los vehículos
        System.out.println("\nPrecios de venta de todos los vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.printf("%s: %.2f€\n", vehiculo.getMarca(), vehiculo.precioVenta());
        }
    }
}
