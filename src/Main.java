import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    double disc = 0.2;
    double precio = 50000;

    //Variable edad para evaluar descuento
    System.out.println("Ingrese su edad: ");
    int edad = sc.nextInt();

    /*
    Condición utilizando edad para saber si el sistema
    aplica el descuento
     */
    if (edad >= 30) {
        double total = precio - (precio * disc);
        System.out.println("Descuento aplicado: " + total);
    } else {
        System.out.println("No aplica descuento.");
    }

}
