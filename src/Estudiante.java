/**
 * La siguiente clase, representa a un estudiante registrado que consultará sus notas
 * en el sistema de la universidad
 */
public class Estudiante {

    private String nombre;
    private  String apellido;
    private int  edad;
    private double notaFinal;

    public Estudiante(String nombre, String apellido, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    /*
     * Métedo que determina si el estudiante está aprobado según su nota final
     * @param notaFinal nota obtenida por el estudiante
     * @return true si la nota es igual o superior a 4.0
     */

    public boolean estaAprobado(double notaFinal){
        return notaFinal >= 4.0;
    }
}
