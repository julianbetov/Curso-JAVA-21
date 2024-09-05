package G02_POO.S01_clasesYObjetos.C130;

// Metodo equals()

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil lamborghini = new Automovil("Lamborghini", "Serrato", "Azul", 500L);
        Automovil lamborghini2 = new Automovil("Lamborghini", "Serrato", "Azul", 500L);

        // Comparando con 'equals()' de java.lang.Object | Comparando la referencia
        System.out.println("Son iguales los objetos? " + (lamborghini == lamborghini2)); // output: false
        // Comparando con la 'equals()' sobrescrito de Automovil | Comparando la informacion del objeto
        System.out.println("Son iguales los objetos? " + lamborghini.equals(lamborghini2)); // output: true

    }
}
