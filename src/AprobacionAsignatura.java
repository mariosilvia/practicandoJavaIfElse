// Determinar si un alumno aprobo la asignatura

import java.util.Scanner;

public class AprobacionAsignatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.println("Digite la primera nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite la segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite la tercera nota: ");
        nota3 = scanner.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7){
            System.out.println("El Estudiante aprobó la asignatura. Con un promedio de: " + promedio);
        } else if (promedio >= 5 && promedio <= 6.9) {
            System.out.println("El Estudiante esta en recuperación. Con un promedio de: " + promedio);
        }else {
            System.out.println("El estudiante reporbó la asignatura. Con un promedio de: " + promedio);
        }

        scanner.close();
    }
}
