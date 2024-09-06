package G02_POO.S01_clasesYObjetos.C130;

// Metodo toString() de la clase Automovil

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil lamborghini = new Automovil("Lamborghini", "Serrato", "Azul", 500L);
        Automovil ferrari = new Automovil("Ferrari", "Formula 1", "Rojo", 1600L);

        /* Al tener un metodo 'toString()' en una clase, ya sea heredado o sobrescrito,
        no es necesario invocarlo por medio del operador punto para poder utilizarlo. */

        // 'toString()' se toma por defecto al imprimir el objeto por si solo
        System.out.println(lamborghini); // output: Automovil{fabricante='Lamborghini', modelo='Serrato', color='Azul', cilindrada=500.0}
        System.out.println(ferrari); // output: Automovil{fabricante='Ferrari', modelo='Formula 1', color='Rojo', cilindrada=1600.0}

        /* Es lo mismo que:

            System.out.println(lamborghini.toString());
            System.out.println(ferrari.toString());

         */

    }
}
