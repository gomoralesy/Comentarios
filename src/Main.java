public static void main(String[] args) {
    Estudiante estudiante1 = new Estudiante("Gonzalo", "Morales", 30, 5.6);
    System.out.println("Nombre: "+ estudiante1.getNombre());
    System.out.println("Apellido: "+ estudiante1.getApellido());
    System.out.println("Edad: "+ estudiante1.getEdad());
    System.out.println("Nota final: "+ estudiante1.getNotaFinal());

    // Comentario: Probaremos el método estaAprobado con la nota del estudiante

    boolean aprobado = estudiante1.estaAprobado(estudiante1.getNotaFinal());
    System.out.println("Aprobado: "+ aprobado);
}


