package G02_POO.S01_clasesYObjetos.C142_staticKeyword;

// Atributos, metodos y bloques estaticos
/* Notas:
- En java los metodos y variables estaticas pertenecen a la clase en si, en lugar de pertenecer
a instancias especificas de la clase. Esto significa que se puede acceder a ellos sin tener que
crear un objeto de la clase.
Alcance:
- No se puede hacer uso de 'this', ya que desde la llamada del metodo o variable, no se cuenta
  con una instancia.
- No se puede acceder directamente a variables o metodos de la instancia
  (Los metodos estaticos solo utilizan variables estaticas).
Herencia:
- Los metodos estaticos no se heredan ni se sobreescriben como los metodos de instancia. Si una
  subclase define un metodo estatico con el mismo nombre y firma que uno en su superclase, esto
  no es una verdadera sobreescritura, sino que se esconde el metodo de la superclase.
 */

public class Banco {

    // Variables estaticas (tambien llamadas atributos de la clase)
    /* Son compartidas por todas las instancias de la clase. En lugar de que cada objeto tenga su propia copia
       de la variable, todos los objetos comparten una unica copia.
    - Son utiles cuando se quiere que un valor sea comun para todas las instancias de la clase.
    - Se pueden acceder mediante el nombre de la clase o una instancia de la clase, pero la manera correcta es
      usar el nombre de la clase.
     */

    private static double tasaInteres = 0.05;
    private static int totalCuentas = 0;

            /* Patrones de disenio: Los metodos estaticos se usan frecuentemente en patrones como el Factory Method,
            donde se define un metodo estatico que devuelve instancias de una clase
               Singleton: Ejemplo tipico de uso de variables y metodos estaticos, ya que garantiza que solo exista
               una instancia de una clase.
             */

    private static Banco instanciaUnica; // Singleton: https://refactoring.guru/es/design-patterns/singleton/java/example

            /*  Bloques estaticos: Ademas de variables y metodos estaticos, tambien hay bloques estaticos en Java.
                Estos son fragmentos de codigo que se ejecutan una sola vez cuando la clase se carga en la memoria,
                antes de que se cree cualquier instancia o se acceda a cualquier miembro estatico.
             */

    static {
        System.out.println("Banco inicializado con tasa de interes del 5%");
    }

    // Constructor privado para el patron Singleton
    private Banco() {
        System.out.println("Instancia unica del banco creada");
    }


    // Metodos estaticos (Metodos de la clase)
    /* No puede acceder directamente a variables o metodos de la instancia, ya que estos requieren una instancia
       especifica de la clase.
     */

    // Obtener la instancia unica del banco (patron Singleton)
    public static Banco getInstanica() {
        if (instanciaUnica == null) {
            instanciaUnica = new Banco();
        }
        return instanciaUnica;
    }

    // Cambiar la tasa de interes para todas las cuentas
    public static void setTasaInteres(double nuevaTasa) {
        tasaInteres = nuevaTasa;
        System.out.println("Tasa de interes actualizada a: " + (nuevaTasa*100) + "%");
    }

    public static double getTasaInteres() {
        return tasaInteres;
    }

    // Total cuentas creadas
    public static int getTotalCuentas() {
        return totalCuentas;
    }

    // Simular la creacion de una cuenta bancaria
    public void crearCuenta() {
        totalCuentas++;
        System.out.println("Cuenta creada. Total cuentas: " + totalCuentas);
    }

}
