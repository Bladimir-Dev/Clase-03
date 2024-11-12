import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Conversión de Temperaturas");

        System.out.print("Ingrese la temperatura en grados celsius a convertir: ");

        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;

        System.out.println("En grados Fahrenheit es una temperatura de " + fahrenheit);
        System.out.println("En grados Kelvin es una temperatura de " + kelvin);

        scanner.close();

    }

}
