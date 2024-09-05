package G02_POO.S01_clasesYObjetos.C130;

// Encapsulamiento
/* Notas:
  - Encapsulamiento: consiste en ocultar los detalles internos de un objeto y controlar el acceso a sus datos
  mediante métodos públicos. Esto protege la integridad del objeto al evitar modificaciones directas a sus atributos
  desde fuera de la clase.
  - Modificadores de acceso: https://javamagician.com/java-modificadores-de-acceso/
 */

public class Automovil {

    // Ocultando los atributos
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;

    /* Nota:
    - Los metodos tambien pueden ser privados y ser solo accesibles desde la clase en la que se declaran.
     */

    // Metodos Getter y Setter (Uno de cada uno para cada atributo privado de la clase)
    // Funcion: Controlar el acceso seguro a los atributos y la forma en la que se cambian sus valores

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;

        /* Operador this:
        - "Within an instance method or a constructor, 'this' is a reference to the current object — the object whose
          method or constructor is being called. You can refer to any member of the current object from within an
          instance method or a constructor by using this."
        - Es útil cuando hay ambigüedad entre los nombres de variables locales y los atributos de la clase, o para
          pasar la instancia actual a otro método o constructor. Aquí tienes un ejemplo:
         */

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

}
