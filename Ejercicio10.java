import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Media Aritmética");

        System.out.print("Digite el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite el primer numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite el primer numero: ");
        int num3 = scanner.nextInt();

        int mediaAritmetica = num1 + num2 + num3 / 3;

        System.out.println("La media aritmetica es " + mediaAritmetica);

        scanner.close();

    }

}
