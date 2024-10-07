package G02_POO.S01_clasesYObjetos.C146_enum;

import java.util.Arrays;

// Enum (Enumeracion)

public class Tarea {

    private String nombre;
    private Prioridad prioridad;

    public Tarea(String nombre, Prioridad prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public void mostrarInfo() {
        System.out.println("Tarea: " + nombre);
        System.out.println("Prioridad: " + prioridad.getDescripcion() + " (Nivel " + prioridad.getNivel() + ")");
        System.out.println("Importancia: " + importanciaTarea());
    }

    /* Switch-case in Java 21
    - https://www.baeldung.com/java-switch#switch-expressions
    - yield keyword: https://www.baeldung.com/java-yield-switch
    - https://softwaremill.com/java-21-switch-the-power-on/
     */

    public String importanciaTarea() {
        return switch (this.prioridad) {
            case BAJA, MEDIA -> "Aun hay tiempo de resolver la tarea";
            case ALTA -> "Es hora de resolver la tarea";
            case CRITICA -> {
                System.out.println("--------- PRESTAR ATENCION ---------");
                yield "No queda mucho tiempo para resolver la tarea, apurate";
            }
        };
    }

    public static void main(String[] args) {

        Tarea tarea1 = new Tarea("", Prioridad.MEDIA);
        Tarea tarea2 = new Tarea("", Prioridad.ALTA);
        Tarea tarea3 = new Tarea("Revisar servidor", Prioridad.CRITICA);

        tarea1.mostrarInfo();
        tarea2.mostrarInfo();
        tarea3.mostrarInfo();

        /* --------- Metodos de los Enums --------- */

        // .values() : Todos las constantes de tipo Prioridad
        System.out.println(Arrays.toString(Prioridad.values()));
        for (Prioridad p : Prioridad.values()) {
            System.out.println(p);
        }

        // .valueOf() : Encontrar un enum dado el nombre
        Prioridad p = Prioridad.valueOf("BAJA");
        System.out.println(p);

        // .name() : Obtener el nombre del enum
        System.out.println(p.name());

        // .ordinal() : Posicion del enum
        System.out.println(p.ordinal());

    }

}
