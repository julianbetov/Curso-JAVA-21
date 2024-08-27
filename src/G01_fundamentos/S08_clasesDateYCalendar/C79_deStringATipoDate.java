package G01_fundamentos.S08_clasesDateYCalendar;

// Convertir una fecha String a objeto de tipo Date
/* Notas:
- Sirve para obtener cualquier fecha de tipo Date pero a partir de un String
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C79_deStringATipoDate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Establecer el formato en el que llega la fecha del String
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ingrese una fecha adecuada: ");

        // try catch por si el metodo format.parse() recibe algo distinto a una fecha. (Esto es obligatorio)
        try {
            // format.parse() para cambiar un string dado un formato en concreto a tipo Date
            Date fecha = format.parse(in.next()); // El string debe coincidir con lo estipulado
            System.out.println("fecha = " + fecha); // Fecha completa
            System.out.println("format = " + format.format(fecha)); // Aplicando formato para visualizar
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
