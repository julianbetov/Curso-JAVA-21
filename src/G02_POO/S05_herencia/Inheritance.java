package G02_POO.S05_herencia;

public class Inheritance {

    // Inheritance
    /*
    - A major advantage of inheritance is that once you have created a superclass
      that defines the attributes common to a set of objects, it can be used to create
      any number of more specific subclasses. Each subclass can precisely tailor its
      own classification.
      Remember, once you have created a superclass that defines the general aspects of
      an object, that superclass can be inherited to form specialized classes. Each
      subclass simply adds its own unique attributes. This is the essence of inheritance.
     */


    // Using super to call superclass constructors: super()
    /*
    - A subclass can call a constructor defined by its superclass by user of the
      following form of super: super(arg-list).
      Here, arg-list specifies any arguments needed by the constructor in the
      superclass. super() must always be the first statement executed inside a
      subclass' constructor.
    - Since constructors can be overloaded, super() can be called using any form
      defined by the superclass. The constructor executed will be the one that
      matches the arguments.
     */


    // When constructors are executed
    /*
    - When a class hierarchy is created, in what order are the constructors for the
      classes that make up the hierarchy executed? For example, given a subclass
      called B and a superclass called A, is A’s constructor executed before B’s, or
      vice versa? The answer is that in a class hierarchy, constructors complete their
      execution in order of derivation, from superclass to subclass. Further, since
      super( ) must be the first statement executed in a subclass’ constructor, this
      order is the same whether or not super( ) is used. If super( ) is not used, then
      the default or parameterless constructor of each superclass will be executed.
    - Note: In a class hierarchy, if a superclass constructor requires arguments, then
      all subclasses must pass those arguments “up the line.” This is true whether or
      not a subclass needs arguments of its own.
     */


    // Method Overriding
    /*
    - In a class hierarchy, when a method in a subclass has the same name and type
      signature as a method in its superclass, then the method in the subclass is said
      to override the method in the superclass. When an overridden method is called
      from within its subclass, it will always refer to the version of that method
      defined by the subclass. The version of the method defined by the superclass
      will be hidden.
    - To access the superclass version of an overridden method, we can use super, like
      this: super.method().
     */

}
