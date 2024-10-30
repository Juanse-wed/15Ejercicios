package EJER9;

/**
 *
 * @author USUARIO
 */
public class Prueba {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        // Cambiar el color del semáforo varias veces
        semaforo.cambio(); // Cambia a verde
        semaforo.cambio(); // Cambia a amarillo
        semaforo.cambio(); // Cambia a rojo
        semaforo.cambio(); // Cambia a verde
        semaforo.cambio(); // Cambia a amarillo
        semaforo.cambio(); // Cambia a rojo
    }
}
