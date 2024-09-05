package G02_POO.S01_clasesYObjetos.C130;

// Sobrecarga de constructores de la clase Automovil

public class EjemploAutomovil {

    public static void main(String[] args) {

        // Instancias de la clase
        Automovil lamborghini = new Automovil();
        Automovil ferrari = new Automovil("Ferrari", "Formula 1");
        Automovil mercedes = new Automovil("Mercedes", "AMG", "Verde");
        Automovil chevrolet = new Automovil("Chevrolet", "Tahoe", "Negro", 500L);

        mostrarDetallesAutomovil(lamborghini);
        mostrarDetallesAutomovil(ferrari);
        mostrarDetallesAutomovil(mercedes);
        mostrarDetallesAutomovil(chevrolet);

    }

    public static void mostrarDetallesAutomovil(Automovil auto) {

        System.out.println("-------------------------------------------------------");
        System.out.println("Fabricante: " + auto.getFabricante());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Color: " + auto.getColor());
        System.out.println("Cilindrada: " + auto.getCilindrada());

    }

}
