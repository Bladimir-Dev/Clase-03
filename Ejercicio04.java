import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var sInicial = 23.0;
        var sFinal = 12.75;
        var totalGastado = sInicial - sFinal;

        System.out.println("Carmen ha gastado un total de " + totalGastado);

        scanner.close();
    }
}