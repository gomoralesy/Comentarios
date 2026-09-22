/**
 * Clase que gestiona operaciones aritméticas básicas
 * para el cálculo de notas del estudiante.
 */
public class calculadoraNotas {
    private String nombre;
    double nota1 = 0;
    double nota2 = 0;
    double nota3 = 0;

    public calculadoraNotas(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /*
     * Método que determina el promedio de las 3 notas del estudiante
     * @param nota1 Recibe la primera nota
     * @param nota2 recibe la segunda nota
     * @param nota3 recibe la tercera nota
     * @return promedio devuelve el cálculo entre las tres notas
     */

    public double calcularPromedio() {
        //Suma las 3 notas y divide por el total de notas
        return (nota1 + nota2 + nota3)/3;

    }

    /*
     * Determina si el estudiante aprubea según el cálculo del promedio por método calcularPromedio
     * considerando un 4.0 como nota mínima
     * @param notaFinal Recibe el resultado de la suma y división de las notas
     * @return Devuelve si el alumno está aprobado
     */

    public boolean estaAprobado(double notaFinal) {
        return notaFinal >= 4.0;
    }
}
