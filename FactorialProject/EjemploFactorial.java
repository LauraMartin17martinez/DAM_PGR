import java.util.Scanner;
public class EjemploFactorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("CALCULADORA DE FACTORIALES: " + '\n');
        System.out.print("Introduce un número (debe ser positivo y entero): ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("ERROR. Solo se permiten números positivos.");
        } else {
            int resultado = factorial(num);
            System.out.println("El factorial de " + num + " es: " + resultado);
        }

        scanner.close();
    }
}
