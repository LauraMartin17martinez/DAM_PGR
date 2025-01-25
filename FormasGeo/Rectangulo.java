public class Rectangulo extends Formas{
    private double lado;
    private double base;

    public Rectangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    @Override
    public void calcularArea(){
        area = base * lado;
    }
}
