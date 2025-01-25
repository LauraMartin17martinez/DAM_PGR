public class Cuadrado extends Formas{
    private double lado;

    public Cuadrado (double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        area = lado * lado;
    }
}
