package G02_POO.S01_clasesYObjetos.C130;

public class EjemploAutomovil {
    public static void main(String[] args) {

        /*
        Crear una instancia del objeto Automovil.
        - Se hace uso del constructor: Metodo especial para crear e inicializar un objeto creado a partir de una clase.
            Nota: el constructor lleva el mismo nombre de la clase.
        - Previo al constructor usamos la palabra reservada 'new'.
         */
        Automovil auto = new Automovil();

        // Modificando el valor de los atributos del objeto
        auto.fabricante = "Ferrari";
        auto.modelo = "Formula 1";
        auto.color = "Rojo";
        auto.cilindrada = 1600L;

        // Accediendo a los atributos de auto para imprimir sus valores
        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " + auto.cilindrada);

        // ----------------- SEGUNDO OBJETO -----------------

        Automovil lamborghini = new Automovil(); // Inicializacion
        lamborghini.fabricante = "Lamborghini"; // Modificando atributos
        lamborghini.modelo = "Huracan";
        lamborghini.color = "Azul";
        lamborghini.cilindrada = 1600L;
        System.out.println("lamborghini.fabricante = " + lamborghini.fabricante); // Obteniendo atributos
        System.out.println("lamborghini.modelo = " + lamborghini.modelo);
        System.out.println("lamborghini.color = " + lamborghini.color);
        System.out.println("lamborghini.cilindrada = " + lamborghini.cilindrada);

    }
}
