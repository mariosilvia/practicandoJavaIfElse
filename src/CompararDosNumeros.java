// Comparar dos números, para verificar cuál es mayor o si son iguales

import java.util.Scanner;

public class CompararDosNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite el primer número ");
        numero1 = scanner.nextInt();
        System.out.println("Digite el segundo número ");
        numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("El número " + numero1 + " es igual a " + numero2);
        } else if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor a " + numero2);
        }else {
            System.out.println("El número " + numero1 + " es menor a " + numero2);            
        }

        scanner.close();
    }
}
