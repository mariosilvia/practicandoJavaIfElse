// Determinar si un número es par o impar

import java.util.Scanner;

public class NumeroPar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite un número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0){

            System.out.println("El número " + numero + " es par");
        } else {

            System.out.println("El número " + numero + "es impar");
        }

        scanner.close();
    }
}