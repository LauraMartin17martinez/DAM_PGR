import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estudiante persona1 = new Estudiante("", 0, "");

        System.out.println("\n¡Bienvenido estudiante!\n");

        System.out.print("Introduce tu nombre: ");
        persona1.setNombre(scanner.next());
        System.out.print("Introduce tu edad: ");
        persona1.setEdad(scanner.nextInt());
        System.out.print("Introduce en que estás matriculado: ");
        persona1.setMatricula(scanner.next());
        persona1.mostrarInfoEst();

    }
}
