// Validación del ingreso al sistema interno, mediante contraseña

import java.util.Scanner;

public class AccesoSeguro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contraseña = "empresa123+";
        String ingreso;

        System.out.println("Digite su contraseña: ");
        ingreso = scanner.nextLine();

        if (ingreso.equals(contraseña)){
            System.out.println("Acceso permitido");
        }else {
            System.out.println("Acceso denegao");
        }

        scanner.close();
    }
}
