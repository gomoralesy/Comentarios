public static void main(String[] args) {
    calculadoraNotas calculo = new calculadoraNotas();

    double promedio = calculo.calcularPromedio(6.0, 6.5, 6.8);
    boolean aprobado = calculo.estaAprobado(promedio);

    System.out.println("Promedio final: "+promedio);
    System.out.println("Aprobado: "+aprobado);
}


