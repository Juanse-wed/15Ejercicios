package EJER5;

/**
 *
 * @author USUARIO
 */
import java.util.Arrays;

public class Inicio {
    public static void main(String[] args) {
        Math2 math2 = new Math2();

        // Probar métodos con un array de enteros
        int[] intArray = {5, 3, 8, 1, 2};
        System.out.println("Array de enteros: " + Arrays.toString(intArray));
        System.out.println("Mínimo: " + math2.min(intArray));
        System.out.println("Máximo: " + math2.max(intArray));

        double[] doubleArray = {5.5, 3.3, 8.8, 1.1, 2.2};
        System.out.println("\nArray de dobles: " + Arrays.toString(doubleArray));
        System.out.println("Mínimo: " + math2.min(doubleArray));
        System.out.println("Máximo: " + math2.max(doubleArray));
    }
}