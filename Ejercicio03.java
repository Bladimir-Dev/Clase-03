import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var pecesRojos = 284;
        var pecesAzules = 163;
        var totalPeces = pecesRojos + pecesAzules;
        System.out.println("El total de peces que hay dentro del acuario es: " + totalPeces);

        scanner.close();
    }
}