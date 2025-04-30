// Aplicar descuento en la venta, si aplica.

import java.util.Scanner;


public class DescuentoEnVenta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double compra, descuento, vrtotal;

        System.out.println("Digite el valor de su compra: ");
        compra = scanner.nextDouble();

        if (compra >= 100000) {

            descuento = (compra * 10) / 100;
            vrtotal = compra - descuento;
            System.out.println("Se aplica un descuento del: " + descuento + ". El valor a cancelar es de: " + vrtotal);
        }else {
            System.out.println("No aplica descuento del 10%, debido a que el valor de su compra es inferior a $100.000");
        }

        scanner.close();
    }
}
