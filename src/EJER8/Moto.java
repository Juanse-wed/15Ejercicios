package EJER8;

/**
 *
 * @author USUARIO
 */
public class Moto {
    private int velocidad;

    public Moto() {
        this.velocidad = 0;
    }

    public void acelerar(int cantidad) {
        if (velocidad + cantidad <= 150) {
            velocidad += cantidad;
            System.out.println("Acelerando. Velocidad actual: " + velocidad + " km/h");
        } else {
            velocidad = 150; 
            System.out.println("Velocidad máxima alcanzada: " + velocidad + " km/h");
        }
    }

    public void frenar(int cantidad) {
        if (velocidad - cantidad >= 0) {
            velocidad -= cantidad;
            System.out.println("Frenando. Velocidad actual: " + velocidad + " km/h");
        } else {
            velocidad = 0; 
            System.out.println("La moto se ha detenido. Velocidad actual: " + velocidad + " km/h");
        }
    }

    public int getVelocidad() {
        return velocidad;
    }
}
