public static void main(String[] args) {
    calculadoraNotas estudianteAprobado = new calculadoraNotas("Gonzalo", 5.7, 6.4, 6.9);
    double promedio = estudianteAprobado.calcularPromedio();
    System.out.println("Nombre: "+ estudianteAprobado.getNombre());
    System.out.println("Nota 1: "+estudianteAprobado.getNota1());
    System.out.println("Nota 2: "+estudianteAprobado.getNota2());
    System.out.println("Nota 3: "+estudianteAprobado.getNota3());
    System.out.println("Nota final: "+promedio);

    //Probamos el método estaAprobado con promedio final para verificar si el alumno aprueba o no

    boolean aprobado = estudianteAprobado.estaAprobado(promedio);
    System.out.println("Aprobadoo: "+aprobado);
}


