// Validar la solicitud del crédito, este en el rango de 1000 a 5000 US, para otorgar el crédito

import java.util.Scanner;

public class ValidacionPrestamo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorPrestamo;

        System.out.println("Digite el valor a solicitar de prestamo");
        valorPrestamo = scanner.nextInt();

        if (valorPrestamo >= 1000 && valorPrestamo <= 5000){
            System.out.println("Su prestamo fue aprobado" + valorPrestamo);
        }else {
            System.out.println("Su crédito no fue aprobado");
        }
    }
}
