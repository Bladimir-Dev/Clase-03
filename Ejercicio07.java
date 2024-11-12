import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        

        System.out.println("Calculadora");
        System.out.print("Por favor digite un numero: ");
        int num1 =  scanner.nextInt();

        System.out.print("Digite un segumdo numero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;


        System.out.println("La suma de los numeros digitados es: "+suma);
        System.out.println("La resta de los numeros digitados es: "+resta);
        System.out.println("La multiplicacion de los numeros digitados es: "+multiplicacion);
        System.out.println("La division de los numeros digitados es: "+division);



        scanner.close();
    }
    
}
