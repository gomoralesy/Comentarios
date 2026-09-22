/**
 * Clase que gestiona operaciones aritméticas básicas
 * para el cálculo de notas del estudiante.
 */
public class calculadoraNotas {

    /*
     * Método que determina el promedio de las 3 notas del estudiante
     * @param nota1 Recibe la primera nota
     * @param nota2 recibe la segunda nota
     * @param nota3 recibe la tercera nota
     * @return promedio devuelve el cálculo entre las tres notas
     */

    public double calcularPromedio(double nota1, double nota2, double nota3) {
        //Suma las 3 notas y divide por el total de notas
        return (nota1 + nota2 + nota3)/3.0;
    }

    /*
     * Determina si el estudiante aprubea según el cálculo del promedio por método calcularPromedio
     * considerando un 4.0 como nota mínima
     * @param notaFinal Recibe el resultado de la suma y división de las notas
     * @return Devuelve si el alumno está aprobado según el parámetro utilizado
     */

    public boolean estaAprobado(double notaFinal) {
        return notaFinal >= 4.0;
    }
}
