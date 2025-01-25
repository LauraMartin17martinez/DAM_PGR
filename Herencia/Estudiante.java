public class Estudiante extends Persona{
    private String matricula;

    public Estudiante (String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void mostrarInfoEst() {
        super.mostrarInfo(); // Llamo al metodo mostrarInfo del padre
        System.out.println("Está matriculado en " + matricula + "."); // Muestra la información adicional del estudiante
    }

}
