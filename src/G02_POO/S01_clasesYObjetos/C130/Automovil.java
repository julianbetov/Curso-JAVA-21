package G02_POO.S01_clasesYObjetos.C130;

// Sobrecarga de constructores
/* Notas:

Constructores
    - son métodos especiales que se utilizan para inicializar objetos de una clase. Tienen el mismo nombre que
    la clase y no tienen un valor de retorno. Un constructor es llamado automáticamente cuando se crea una
    instancia de la clase y puede ser utilizado para asignar valores iniciales a los atributos.

    Sobrecarga
    - Es la capacidad de definir múltiples métodos con el mismo nombre dentro de una clase, siempre y cuando tengan
    diferentes firmas (por tipo, número o ambos). Esto permite crear variantes de un método para manejar distintos
    tipos o cantidades de datos, mejorando la flexibilidad y legibilidad del código.
    Recurso: https://javamagician.com/java-sobrecarga-sobrescritura-metodos/

 */

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;

    // Constructores (Mismo metodo, diferentes firmas)

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {

        this(fabricante, modelo); // Debe ser la primera linea en el constructor que la contiene

        /*
            this() es una forma de invocar un constructor desde otro constructor dentro de la misma clase.
            Esta técnica se llama constructor chaining o encadenamiento de constructores. Se utiliza para evitar
            la duplicación de código y para inicializar objetos de manera más eficiente.
         */

        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    // Metodos Getter y Setter

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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
