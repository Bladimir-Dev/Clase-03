import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        double valorSinDescuento = 660;
        double descuento = 0.10;

        double totalDescuento = valorSinDescuento * descuento;
        double totalPago = valorSinDescuento - totalDescuento;

        System.out.println("En total debo pagar un total de " + totalPago);

    }

}
