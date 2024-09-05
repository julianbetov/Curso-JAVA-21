package G02_POO.S01_clasesYObjetos.C130;

// Encapsulamiento en Automovil.java

public class EjemploAutomovil {
    public static void main(String[] args) {

        // Instancia de la clase
        Automovil lamborghini = new Automovil();

        /*
         Nota: No es posible acceder a los atributos de la clase directamente
             (Con el operador punto)
             Error:  System.out.println(lamborghini.modelo); // Ya que no se tiene acceso al atributo 'modelo',
                                                                debido a que el modificador de acceso es 'private'.
         */

        // Cambiar datos por medio de los metodos publicos Get y Set
        lamborghini.setModelo("Serrato"); // Ambiguo: lamborghini.modelo = "serrato";
        lamborghini.setColor("Azul");
        lamborghini.setCilindrada(1600L);
        lamborghini.setFabricante("Lamborghini");

        // Mostrar en consola los atributos del objeto
        System.out.println("Modelo: " + lamborghini.getModelo());
        System.out.println("Color: " + lamborghini.getColor());
        System.out.println("Cilindrada: " + lamborghini.getCilindrada());
        System.out.println("Fabricante: " + lamborghini.getFabricante());

    }
}
