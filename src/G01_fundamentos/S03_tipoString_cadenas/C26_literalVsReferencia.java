package G01_fundamentos.S03_tipoString_cadenas;

// Creando Objeto String en literal vs Operador new
/* Notas:
-
 */

public class C26_literalVsReferencia {
    public static void main(String[] args) {

        String curso = "Programacion Java"; // No es un primitivo, es un objeto. Se crea la referencia
        String curso2 = new String("Programacion Java");
        String curso3 = "Programacion Java"; // No se crea un nuevo espacio en memoria para la variable si no la referencia de 'curso', esto para optimizar

        System.out.println(curso == curso2);
        System.out.println(curso.equals(curso2));
        System.out.println(curso == curso3);


    }
}
