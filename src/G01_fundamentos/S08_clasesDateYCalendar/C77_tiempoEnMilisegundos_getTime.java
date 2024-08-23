package G01_fundamentos.S08_clasesDateYCalendar;

// Tiempo en milisegundos con metodo getTime()

import java.util.Date;

public class C77_tiempoEnMilisegundos_getTime {
    public static void main(String[] args) {

            // Primera variable
        Date fecha = new Date();

        // Determinar cuanto tiempo se demora en finalizar el ciclo for
        for (int i = 0; i < 100000; i++) {
            System.out.println("jbdres");
        }

        /* Date.getTime() : Tiempo en milisegundos desde: January 1, 1970, 00:00:00 GMT*/

            // Segunda variable
        Date fecha2 = new Date();
        System.out.println("\nTiempo transcurrido para finalizar el ciclo: " + (fecha2.getTime() - fecha.getTime()));

        /* IMPORTANTE: El metodo getTime() devuelve la cantidiad de milisegundos desde 01-01-1970 hasta el momento
        en el que se inicializa la variable de tipo Date y no hasta cuando se llama dicho metodo. */

        System.out.println("fecha 1 (milisegundos): " + fecha.getTime());
        System.out.println("fecha 2 (milisegundos): " + fecha2.getTime());


    }
}
