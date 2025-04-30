// Para formar un triángulo, la suma de dos lados debe ser mayor al tercer lado.

import  java.util.Scanner;

public class formarUnTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Digite el primer lado: ");
        lado1 = scanner.nextInt();

        System.out.println("Digite el segundo lado: ");
        lado2 = scanner.nextInt();

        System.out.println("Digite el tercer lado: ");
        lado3 = scanner.nextInt();

        if ( (lado1 + lado2) > lado3){
            System.out.println("Se puede formar el triángulo");
        }else {
            System.out.println("No se puede formar el triángulo");
        }
    }
}
