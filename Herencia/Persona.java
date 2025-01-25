public class Persona {

    // Variables que especifica el enunciado
    private String nombre;
    private int edad;

    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Set y get del atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    // Set y get del atributo edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void mostrarInfo(){
        System.out.println("\nSu nombre es " + nombre + " y tiene " + edad + " años.");
    }

}
