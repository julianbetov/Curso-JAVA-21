package G02_POO.S05_herencia;

// Here, Box is extended to include weight
/* Notes:
- BoxWeight inherits all the characteristics of Box and adds to them
  the weight component. It is not necessary for BoxWeight to re-create
  all the features found in Box. It can simply extend Box to meet its
  own purposes.
 */

public class BoxWeight extends Box {

    double weight;

    // Construct clone of an object
    BoxWeight(BoxWeight boxWeight) {

        // super() must always be the first statement in executed inside subclass' constructor.
        super(boxWeight); // Pass object to constructor in superclass

        /*
        - Notice that super() is passed an object of type BoxWeight—not of type
          Box. This still invokes the constructor Box(Box ob). Remember, a
          superclass variable can be used to reference any object derived from that class.
          Thus, we are able to pass a BoxWeight object to the Box constructor. Of
          course, Box only has knowledge of its own members.
        - If super( ) is not used, then the default or parameterless constructor of each
          superclass will be executed.
         */

        weight = boxWeight.weight;
    }

    // Constructor when all parameters are specified
    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
        System.out.println("Inside BoxWeight's constructor");
    }

    // Default constructor
    BoxWeight() {
        super();
        weight = -1;
    }

    // Constructor when cube is created
    BoxWeight(double length, double weight) {
        super(length);
        this.weight = weight;
    }

    @Override
    double volume() {
        System.out.println("Volume method from BoxWeight class");
        return super.volume();
    }

}
