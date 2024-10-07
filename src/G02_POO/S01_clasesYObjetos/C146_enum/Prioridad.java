package G02_POO.S01_clasesYObjetos.C146_enum;

// Enum (Enumeracion)
/* Notas:
- enum es tipo especial de clase que representa un grupo fijo de constantes. Un enum define un conjunto de
  valores posibles para un variable, lo que hace que el codigo sea mas legible y menos propenso a errores,
  ya que limita las opciones a valores predefinidos.
- Los tipos enum no pueden ser instanciados
- Un enum puede tener metodos, constructores y variables como una clase normal.
- Como buena practica, todos los enumeradores se escriben en mayuscula.
 */

public enum Prioridad {

    BAJA(1, "Prioridad baja"),
    MEDIA(2, "Prioridad media"),
    ALTA(3, "Prioridad alta"),
    CRITICA(4, "Prioridad critica");

    // Atributos
    /* Importante:
    - Cada atributo definido se tiene que pasar como parametro a las constantes definidas al principio.
    - Los atributos deben ser de tipo private y final para asegurar que el valor de las constantes no sea alterado. */
    private final int nivel;
    private final String descripcion;

    // Constructor
    /* Importante: El modificador de acceso aqui establecido solo puede ser private.*/
    Prioridad(int nivel, String descripcion) {
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    // Metodos

    public int getNivel() {
        return nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Prioridad{");
        sb.append("nivel=").append(nivel);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
