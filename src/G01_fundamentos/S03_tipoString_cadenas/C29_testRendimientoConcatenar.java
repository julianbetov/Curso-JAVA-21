package G01_fundamentos.S03_tipoString_cadenas;

// Test rendimiento concatenar con operador (+) vs metodo concat() vs StringBuilder
/* Notas:
- Prueba: concatenar cierta cantidad de veces un mismo texto haciendolo de distintas formas.
 */

public class C29_testRendimientoConcatenar {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(c); // Es mutable | append() = Metodo para concatenar

        long inicioTiempo = System.currentTimeMillis(); // Returns the current time in milliseconds

        for (int i = 0; i < 100000; i++) {            // Repeticiones, milisegundos
//            sb.append(a).append(b).append("\n");    // 500 = 0  | 1000 = 0  | 10000 = 1   | 100000 = 7
//            c += a + b + "\n";                      // 500 = 10 | 1000 = 11 | 10000 = 48  | 100000 = 2160
//            c = c.concat(a).concat(b).concat("\n"); // 500 = 1  | 1000 = 2  | 10000 = 144 | 100000 = 6132
        }

        long finTiempo = System.currentTimeMillis();  // Returns the current time in milliseconds
        System.out.println(finTiempo - inicioTiempo); // Tiempo total transcurrido

    }
}
