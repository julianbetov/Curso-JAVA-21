package G01_fundamentos.S01_introduccion;

/* Notas:
* Que son los primitivos?: Son tipos de datos escalares que contienen un solo valor.
* - Java es un lenguaje con tipado estatico, es decir, se define el tipo de dato de la variable a la hora de definir esta.
* - Cada tipo de datos posee una clase wrapper: Boolean, Character, Byte, Short, Integer, Long, Float y Double
* */

public class C11_introduccionPrimitivos {
    public static void main(String[] args) {

        /* Tipos de datos primitivos */
        /* Boolean
        - Este es el tipo mas simple de un solo bit.
        - Un boolean expresa un valor de verdad, puede ser VERDADERO O FALSO.
        - Para especificar un literal boolean, se usan las palabras clave true o false. Ambas escritas en minuscula
        - Valor por defecto: false
         */
        boolean a = true;
        boolean b = false;

        /* char
        - Usa el codigo UNICODE y ocupa cada caracter 16 bits
        - Resources: https://en.wikipedia.org/wiki/List_of_Unicode_characters
        - Valor por defect: u0000
         */
        char charA = 'a'; // Comillas simples y un solo caracter.
        char char1 = '1';
        char charUnicode = '\u0040'; // Mas de un caracter con un codigo unicode
        char myChar = 64;
        int myInt = '@';
        System.out.println(charUnicode);
        System.out.println(myChar);
        System.out.println(myInt);

        /* Numeros enteros
        - Son 4 tipos: byte, short, int, long
        - Difieren de las precisiones y pueden ser positivos o negativos
         */

        // Byte: 1 byte | Valor defect: 0
        byte minValueOfByteNumber = Byte.MIN_VALUE;
        byte maxValueOfByteNumber = Byte.MAX_VALUE;
        System.out.println(minValueOfByteNumber); // output
        System.out.println(maxValueOfByteNumber);

        // short: 2 bytes | Valor defect: 0
        short minValueOfShortNumber = Short.MIN_VALUE;
        short maxValueOfShortNumber = Short.MAX_VALUE;
        System.out.println(minValueOfShortNumber);
        System.out.println(maxValueOfShortNumber);

        // int: 4 bytes | Valor defect: 0
        int minValueOfIntegerNumber = Integer.MIN_VALUE;
        int maxValueOfIntegerNumber = Integer.MAX_VALUE;
        System.out.println(minValueOfIntegerNumber);
        System.out.println(maxValueOfIntegerNumber);

        // long: 8 bytes | Valor defect: 0L
        long minValueOfLongNumber = Long.MIN_VALUE;
        long maxValueOfLongNumber = Long.MAX_VALUE;
        System.out.println(minValueOfLongNumber);
        System.out.println(maxValueOfLongNumber);

        /* Numeros reales
        - Es un tipo de dato para guardar numero reales en coma flotante con presicion simple y doble.
        - Poseen notacion cientifica
         */

        // float: 4 bytes | Valor defect: 0.0f
        float minValueOfFloatNumber = Float.MIN_VALUE;
        float maxValueOfFloatNumber = Float.MAX_VALUE;
        System.out.println(minValueOfFloatNumber);
        System.out.println(maxValueOfFloatNumber);

        // double: 8 bytes | Valor defect: 0.0d
        double minValueOfDoubleNumber = Double.MIN_VALUE;
        double maxValueOfDoubleNumber = Double.MAX_VALUE;
        System.out.println(minValueOfDoubleNumber);
        System.out.println(maxValueOfDoubleNumber);

    }
}