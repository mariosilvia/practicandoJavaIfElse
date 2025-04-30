// valida si un días es hábil. El usuario debe ingresar el día en minúscula.

import java.util.Scanner;

public class DiaHabil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dia;

        System.out.println("Digite el día de la semana, en minúscula: ");
        dia = scanner.nextLine();
        /*
         if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves") || dia.equals("viernes")){
            System.out.println("Es un día hábil: " + dia);
        } else if (dia.equals("sabado") || dia.equals ("domingo")) {
            System.out.println("Es un día no hábil: " + dia);
        }else {
            System.out.println("Favor digite un día valido y en minúscula");
        }
        */

        // mejorando el código

        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día hábil: " + dia);
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un día no hábil: " + dia);
                break;
            default:
                System.out.println("Favor digite un día válido y en minúscula");
        }
    }
}
