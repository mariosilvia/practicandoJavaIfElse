// Validar si se puede donar sangre:
// Edad entre 18 y 65 años
// Peso de más de 50 kilos.

import java.util.Scanner;

public class validarDonarSangre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad, peso;

        System.out.println("Digite su edad: ");
        edad = scanner.nextInt();

        System.out.println("Digite su peso: ");
        peso = scanner.nextInt();

/*
    if (edad >= 18 && edad <= 65 && peso >= 50){
            System.out.println("Puede donar sangre");
    } else if (edad >= 18 && edad <= 65 && peso < 50) {
            System.out.println("No puede donar sangre, no tiene el peso requerido de 50kg o más");

        } if (edad < 18 || edad > 65 && peso >= 50) {
            System.out.println("No puede donar sangre, no cumple los requisitos de edad");

        } else if (edad < 18 || edad > 65 && peso < 50) {
            System.out.println("No puede donar sangre, no cumple los requisitos de edad y peso");
        }
*/


        // mejorando el código

        boolean edadValida = edad >= 18 && edad <= 65;
        boolean pesoValido = peso >= 50;

        if (edadValida && pesoValido) {
            System.out.println("Puede donar sangre.");
        } else if (!edadValida && !pesoValido) {
            System.out.println("No puede donar sangre, no cumple los requisitos de edad ni de peso.");
        } else if (!edadValida) {
            System.out.println("No puede donar sangre, no cumple los requisitos de edad.");
        } else {
            System.out.println("No puede donar sangre, no cumple el requisito de peso (mínimo 50 kg).");
        }

    }
}
