package G02_POO.S01_clasesYObjetos.C144_finalKeyword;

// Final Variable
/* Notes:
- Final Keyword: https://www.geeksforgeeks.org/final-keyword-in-java/
 */

public class FinalVariable {

    /*
    - When a variable is declared with the final keyword, its value can't be changed,
      essentially, a constant. This also means that you must initialize a final variable.
    - If the final variable is a reference, this means that the variable cannot be
      rebound to reference another object, but the internal state of the object pointed
      by that reference variable can be changed.
    - Important: It's good practice to represent final variables in all uppercase, using
      underscore to separate words.
    - Remember: When a final variable is created inside a method/constructor/block, it's
      called local final variable, and it must initialize once where it's created.
     */

        // Different ways to Initializing a final variable

    // Direct initialize
    final double THRESHOLD = 5;

    // A blank final variable
    final int CAPACITY;

    // Another blank final variable
    final int MINIMUN;

    // A final static variable PI
    // Direct initialize
    final double PI = 3.14159265358979;

    // A blank final static variable
    static final double EULERCONSTAT;

    // Instance initializer blocks for initializing CAPACITY ⇾
    // (Se ejecuta cada que se crea una instancia nueva de la clase)
    {
        CAPACITY =  25;
    }

    // static initializer block for initializing EULERCONSTANT
    static {
        EULERCONSTAT = 2.3;
    }

    // Constructor for initializing MINIMUM
    // Note that if there are more than one
    // constructor, you must initialize MINIMUM
    // in them also
    public FinalVariable() {
        MINIMUN = -1;
    }

    /* Reference final Variable
    - When a final variable is a reference to an object, then this final variable
      is called the 'reference final variable'. For example, a final StringBuffer variable.
            final StringBuffer sb;
      As we know a final variable cannot be re-assign. But in the case of a reference
      final variable, the internal state of the object pointed by that reference variable
      can be changed. Note that this is not re-assigning.
      This property of the final is called 'non-transitivity'.
    * */

    public static void main(String[] args) {

        /* Reference final variable */
        final StringBuilder sb = new StringBuilder("Geeks");
        System.out.println(sb); // Geeks
        sb.append("ForGeeks");
        System.out.println(sb); // GeeksForGeeks

            /*
            The non-transitivity property also applies to arrays, because arrays are objects
            in Java. Arrays with the final keyword are also called final arrays.
             */

        /* final with foreach loop */
        int arr[] = {1,2,3};
        for (final int i : arr) {
            System.out.print(i + " ");
        } // Output: 1 2 3

            /*
            Explanation: Since the 'i' variable goes out of scope with each iteration of the
            loop, it is re-declared each iteration, allowing the same token (i) to be used to
            represent multiple variables.
             */

    }

}
