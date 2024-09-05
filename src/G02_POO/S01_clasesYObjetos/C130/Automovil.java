package G02_POO.S01_clasesYObjetos.C130;

// Metodo equals()
/* Nota:
- Todos los objetos en java son unicos y distintos, aunque tenga la misma informacion en sus atributos.
- El metodo equals
- java.lang.Object: La clase Object es la raiz de la jerarquia de clases. Cada clase tiene Object como superclase. Todos los objetos,
                    incluidas las matrices, implementan los metodos de esta clase. => Herencia implicita
                    Resource: https://docs.oracle.com/javase/8/docs/api/index.html?java/lang/Object.html
 */

import java.util.Objects;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;

    public Automovil() {}

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

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

    /*
        Por defecto, Automovil hereda el metodo 'equals()' de la super clase Object:
            public boolean equals(Object obj) { return (this == obj); } // Retorna true si y solo si el objeto es el mismo que el del argumento
                                                                        // No compara los valores unicos de los atributos de los objetos

        Sobrescribiendo el metodo equals de java.lang.Object.

     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Exactamente el mismo objeto
        if (o == null || getClass() != o.getClass()) return false; // Validando si el argumento es null o pertenece a una clase distinta que la instancia.
        Automovil automovil = (Automovil) o; // Casting explicito: Convetir el argumento a un objeto de tipo Automovil | Resource: https://www.arquitecturajava.com/java-casting-y-como-usarlo/
        // Comparar los valores individuales de la instancia con los del argumento
        return Double.compare(getCilindrada(), automovil.getCilindrada()) == 0 && Objects.equals(getFabricante(), automovil.getFabricante()) && Objects.equals(getModelo(), automovil.getModelo()) && Objects.equals(getColor(), automovil.getColor());
    }

}
