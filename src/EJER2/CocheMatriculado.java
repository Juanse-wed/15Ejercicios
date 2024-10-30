
package EJER2;

/**
 *
 * @author USUARIO
 */
public class CocheMatriculado extends Coche {
    private int anioMatriculacion;
    private int mesMatriculacion;
    private double impuestoMatriculacion;

    // Constructor
    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion, int anio,
                            String matricula, String dniTitular, int anioMatriculacion, int mesMatriculacion) {
        super(marca, color, precio, factorContaminacion, anio);
        setMatricula(matricula);
        setDniTitular(dniTitular);
        this.anioMatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        calculaImpuestoMatriculacion();
    }

    private void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = getPrecio() / 20;
        int edadCoche = 2024 - getAnio(); 
        if (edadCoche > 10) {
            impuestoMatriculacion += 100;
        }
    }

    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public void setAnioMatriculacion(int anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }

    public int getMesMatriculacion() {
        return mesMatriculacion;
    }

    public void setMesMatriculacion(int mesMatriculacion) {
        this.mesMatriculacion = mesMatriculacion;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion(double impuestoMatriculacion) {
        this.impuestoMatriculacion = 0; 
        calculaImpuestoMatriculacion();
    }
}
