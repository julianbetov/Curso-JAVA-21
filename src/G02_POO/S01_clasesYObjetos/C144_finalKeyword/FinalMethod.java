package G02_POO.S01_clasesYObjetos.C144_finalKeyword;

// Final Variable
/* Notes:
- Final Keyword: https://www.geeksforgeeks.org/final-keyword-in-java/
- Overriding: https://www.geeksforgeeks.org/overriding-in-java/
 */

public class FinalMethod {

    /*
    - When a method is declared with final keyword, it's called a final method
      in Java. A final method cannot be overriden.
    - The Object class does this - a number of its methods are final. We must
      declare methods with the final keyword for which we are required to follow
      the same implementation throughout all the derived classes.
     */

    final void firstMethod() {
        System.out.println("This is a final method");
    }

}

class B extends FinalMethod {
    void firstMethod() {
        System.out.println("Illegal");
    }
}
