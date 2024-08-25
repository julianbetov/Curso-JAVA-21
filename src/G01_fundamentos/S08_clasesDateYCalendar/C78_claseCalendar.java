package G01_fundamentos.S08_clasesDateYCalendar;

// La clase Calendar
/* Notas:
- Sirve para asignar una fecha ya sea en el pasado o en el futuro
- Es una clase abstracta, por lo cual no permite crear la instancia con el operador new, esta la maneja la propia clase, invocando el metodo getInstance().
- Dependiendo de la ubicacion, crea una instancia con formato y hora para un idioma y estilo de calendario en particular (Ej. Japanese-Gregorian, Japanese-Traditional)
  Para Occidente, el calendario generado es: Gregorian Calendar
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C78_claseCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        System.out.println("calendario = " + calendario);

        Date fecha = calendario.getTime(); // Interno: getTime() { return new Date(getTimeInMillis()) }
        System.out.println("fecha = " + fecha);

        // Asignar una fecha concreta por completo
        calendario.set(2020, Calendar.SEPTEMBER, 25, 22, 32, 17);
        System.out.println(calendario.getTime());

        // Asignar valor a cada campo por separado en una fecha
        calendario.set(Calendar.YEAR, 2046);
        calendario.set(Calendar.DATE, 23);
        calendario.set(Calendar.HOUR_OF_DAY, 14); // 24 horas
        calendario.set(Calendar.MILLISECOND, 230);
            // Formato de 12 horas
            calendario.set(Calendar.HOUR, 10);
            calendario.set(Calendar.AM_PM, Calendar.AM); // Determinar AM o PM (Calendar.PM)

            // Es posible cambiar cada valor de la fecha: Calendar. YEAR, MONTH, DATE, HOUR_OF_DAY, MINUTE, SECOND, MILLISECONDS
        System.out.println(calendario.getTime());

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(calendario.getTime());
        System.out.println("fechaConFormato = " + fechaConFormato);

    }
}
