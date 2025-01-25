public class Circulo extends Formas {
    private double radio;

    public Circulo (double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);

    }
}
