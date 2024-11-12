import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Calculado area y perimerto de un rectangulo");

        System.out.print("Digite la longitud: ");
        int longitud = scanner.nextInt();

        System.out.print("Digite el ancho: ");
        int ancho = scanner.nextInt();

        int area = longitud * ancho;
        int perimetro = longitud * 2 + ancho * 2;

        System.out.println("El area del rectangulo dado es " + area);
        System.out.println("El perimetro del  rectangulo dado es " + perimetro);

        scanner.close();

    }

}
