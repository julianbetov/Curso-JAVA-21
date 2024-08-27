package G01_fundamentos.S08_clasesDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C80_compararFechas {
    public static void main(String[] args) {

        /*
        Comparar fechas: Saber si una fecha va antes o despues de otra y si son iguales.
         */

        Date fecha1 = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {

            Date fecha2 = formato.parse("2020-08-27");
            System.out.println("Fecha 1: " + fecha1);
            System.out.println("Fecha 2: " + fecha2);

            if (fecha1.before(fecha2)) {
                System.out.println("La fecha 1 esta antes que la fecha 2");
            } else if (fecha1.after(fecha2)) {
                System.out.println("La fecha 1 esta despues que la fecha 2");
            } else if (fecha1.equals(fecha2)) {
                System.out.println("La fecha 1 es la misma que la fecha 2");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
