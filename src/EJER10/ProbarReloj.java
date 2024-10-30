package EJER10;

/**
 *
 * @author USUARIO
 */
public class ProbarReloj {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(10, 30, 45);
        
        System.out.println("Hora inicial: " + reloj);
        
        reloj.setHora(12);
        reloj.setMinuto(45);
        reloj.setSegundo(50);
        System.out.println("Hora modificada: " + reloj);

        reloj.adelantarReloj(80);
        System.out.println("Después de adelantar 80 segundos: " + reloj);
        
        reloj.atrasarReloj(150);
        System.out.println("Después de atrasar 150 segundos: " + reloj);
    }
}
