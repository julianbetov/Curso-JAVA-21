package G01_fundamentos.S08_clasesDateYCalendar;

// La clase Date y formatos de fecha
/* Notas:

 */

import java.text.SimpleDateFormat;
import java.util.Date; // Fechas standard de java

public class C76_claseDateYFormatosDeFecha {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println(fecha); // Fri Aug 23 14:40:17 COT 2024

        // Determinar un formato en concreto con el que se presente la variable fecha
        /* Siglas para el formateo de fecha: https://docs.oracle.com/javase/8/docs/api/  */
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println(dateFormat.format(fecha)); // 2024.08.23 AD at 15:04:23 COT

    }
}
