package G01_fundamentos.S03_tipoString_cadenas;

/* Notas:
- Los Strings son objetos de java, del tipo de referencia:
            String nombre = new String("Andres");
            String tema = new String("Manejo de \"Strings\"");
- Aunque los Strings tambien se pueden representar con una sintaxis especialmente comoda.(recomendada)
            String nombre = "Andres";
            String tema = "Manejo de \"Strings\""
- Los caracteres de un String se codigican usando Unicode
- Son inmutables (No se pueden modificar los caracteres individuales de una cadena una vez que ha sido asignada)
    - Siempre retorna una nueva instancia, distinta a la original.
- Concatenar: Operador de suma +
- Comparar 2 Strings:
    - ==: Para comparar valor, el operador de igualdad solo se usa con los primitivos y 'String' no lo es.
           Al utilizar == con String, se compara es la referencia, osea, si 2 variables distintas apuntan a la misma referencia en memoria (mismo objeto)
    - Sting.equals(""): De esta manera si se compara el valor
    - String.equalsIgnoreCase(""): Comparar sin tener en cuenta las mayusculas y minusculas
- Metodos de la clase: (Mas usados)
    - lenght, equals, equalsIgnoreCase, startsWith, endsWith, trim, charAt, toCharArray, substring, indexOf, lastIndexOf, split
    - Recursos: https://docs.oracle.com/javase/8/docs/api/
 */

public class C25_introduccionStrings {
}
