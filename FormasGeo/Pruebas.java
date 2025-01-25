import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("\nCALCULADORA DE AREAS:" );
        System.out.println("\n1. Circulo" + "\n2. Cuadrado" + "\n3. Rectángulo" + "\n0. Salir\n");
        System.out.print("Introduce el número que corresponda a tu opción: ");
        //Recoger una variable por consola
        opcion = Integer.parseInt(scanner.nextLine());


        switch (opcion) {
            case 1:
                System.out.print("\nIntroduce el radio del circulo: ");
                Formas circulo1 = new Circulo(scanner.nextInt());
                circulo1.calcularArea();
                System.out.println("\nEl area de tu circulo es: " + circulo1.getArea());
                break;
            case 2:
                System.out.print("\nIntroduce el lado del cuadrado: ");
                Formas cuadrado1 = new Cuadrado(scanner.nextInt());
                cuadrado1.calcularArea();
                System.out.println("\nEl area de tu cuadrado es: " + cuadrado1.getArea());
                break;
            case 3:
                System.out.print("\nIntroduce el lado del rectángulo: ");
                double lado = scanner.nextInt();
                System.out.print("\nIntroduce la base del rectángulo: ");
                double base = scanner.nextInt();
                Formas rectangulo1 = new Rectangulo(lado, base);
                rectangulo1.calcularArea();
                System.out.println("\nEl area de tu rectángulo es: " + rectangulo1.getArea());
                break;
            case 0:
                System.out.println("\n¡Adiós!");
                break;
            default:
                System.out.println("\nERROR. NO ESTÁ DENTRO DE LOS PARAMETROS.");break;

        }



    }
}
