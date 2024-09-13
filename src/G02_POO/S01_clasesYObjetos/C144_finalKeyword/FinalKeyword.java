package G02_POO.S01_clasesYObjetos.C144_finalKeyword;

// Final Keyword
/* Notes:
- Final Keyword: https://www.geeksforgeeks.org/final-keyword-in-java/
- The final method in Java is used as a non-access modifier applicable only to a variable,
  a method, or a class. It is used to restrict a user in java.
  The final keyword is used to indicate that a variable, method, or class cannot be modified
  or extended.
        Final Variable => To create constant variable
        Final Method   => Prevent method overriding
        Final Classes  => Prevent inheritance

- Characteristics of final keyword in Java:
  In Java, the final keyword is used to indicate that a variable, method, or class cannot
  be modified or extend. Here some of its characteristics.
    - Final variable: When a variable is declared as final, its value cannot be changed
      once it has been initialized. This is useful for declaring constants or other values
      that should not be modified.
    - Final methods: When a method is declared as final, it cannot bve overridden by a
      subclass. This is useful for methods that are part of a class's public API and should
      not be modified by subclasses.
    - Final classes: When a class is declared as final, it cannot be extended by a
      subclass. This is useful for classes that are intended to be used as is and should not
      be modified or extended.
    - Initialization: Final variables must be initialized either at the time of declaration
      or in the constructor of the class. This ensures that the value of the variable is
      set and cannot be changed.
    - Performance: The use of a final can sometimes improve performance, as the compiler
      can optimize the code more effectively when it knows that a variable or method
      cannot be changed
    - Security: The final can help improve security by preventing malicious code from
      modifying sensitive data or behavior.

- Overall, the final keyword is a useful tool for improving code quality and ensuring that
  certain aspects of a program cannot be modified or extended. By declaring variables, methods,
  and classes as final, developers can write code more secure, robust, and maintainable code.
 */

public class FinalKeyword {
}
