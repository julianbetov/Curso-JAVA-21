package G02_POO.S01_clasesYObjetos.C130;

// Metodo toString()
/* Nota:
- El metodo 'toString()' se toma por defecto al imprimir el objeto por si solo, no es necesario llamarlo.
 */

import java.util.Objects;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;

    public Automovil() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automovil automovil = (Automovil) o;
        return Double.compare(getCilindrada(), automovil.getCilindrada()) == 0 && Objects.equals(getFabricante(), automovil.getFabricante()) && Objects.equals(getModelo(), automovil.getModelo()) && Objects.equals(getColor(), automovil.getColor());
    }

    /*
        Tambien se hereda el metodo 'tostring()' de java.lang.Object:
            public String toString() { return getClass().getName() + "@" + Integer.toHexString(hashCode()); }
            - Retorna una representacion en String del objeto.

        Sobrescribiendo el metodo para obtener la informacion individual de los atributos de la instancia

     */

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }



}
