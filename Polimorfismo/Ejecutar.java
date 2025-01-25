public class Ejecutar {
    public static void main(String[] args) {
        Animal[] animalitos = new Animal[4];

        animalitos[0] = new Perro();
        animalitos[1] = new Gallo();
        animalitos[2] = new Gato();
        animalitos[3] = new Vaca();

        System.out.println("\nLOS SONIDOS DE LOS ANIMALES: \n");

        for (Animal a : animalitos) {
            a.haceSonido();
        }

    }
}
