package G02_POO.S01_clasesYObjetos.C144_finalKeyword;

// Final Class
/* Notes:
- Final Keyword: https://www.geeksforgeeks.org/final-keyword-in-java/
- Inheritance: https://www.geeksforgeeks.org/inheritance-in-java/
- Wrapper Classes: https://www.geeksforgeeks.org/wrapper-classes-java/
- Create an Inmutable Class: https://www.geeksforgeeks.org/create-immutable-class-java/
 */

public final class FinalClass {

    /*
    - When a class is declared with the final keyword in Java, it's called a
      final class. A final class cannot be extended (inherited).
     There are two uses of a final class:
      - Usage 1: One is definitely to prevent inheritance, as final classes
        cannot be extended. Fo example, all Wrapper Classes like Integer, Float,
        etc. are final classes. We cannot extend them.
      - Usage 2: The other use of final with classes is to create an inmutable
        class like the predefined String class. One can not make a class inmutable
        without making it final.
     */

    // Methods and fields

}

/* -- Descomentar.
class SecondClass extends FinalClass {
    // COMPILE-ERROR! Can't subclass A
}
*/
