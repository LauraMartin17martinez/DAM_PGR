
public class PruebaLibreria {
    public static void main(String[] args) {

double a = 10;
double b = 5;

System.out.println();
System.out.println("SUMA: ");
System.out.println(a + " + " + b + " = " + OperacionesMatematicas.sumar(a,b) + '\n');

System.out.println("RESTA: ");
System.out.println(a + " - " + b + " = " + OperacionesMatematicas.restar(a,b) + '\n');

System.out.println("MULTIPLICACIÓN: ");
System.out.println(a + " x " + b + " = " + OperacionesMatematicas.multiplicar(a,b) + '\n');

System.out.println("DIVISIÓN: ");
System.out.println(a + " / " + b + " = " + OperacionesMatematicas.dividir(a,b) + '\n');
    }
}
