package G02_POO.S05_herencia;

public class DemoShipment {
    public static void main(String[] args) {

        // -----------------------------------------------------------------------------------------------
        System.out.println("---- Main app ----");
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
            /* - output for shipment1:
                 Inside Box's constructor
                 Inside BoxWeight's constructor
                 Inside Shipment's constructor
               - Why?: A confirmation message has been implemented when calling the constructor that receives all
                 arguments in superclasses.
                 - The constructors complete their execution in order of derivation, from superclass to subclass.
             */

        double volume;
        volume = shipment1.volume();

        System.out.println("Volume of shipment1 is: " + volume);
        System.out.println("Weight of shipment1 is: " + shipment1.weight); // weight is public in BoxWeight class.
        System.out.println("Shipment cost: $" + shipment1.cost);
        System.out.println();


        // -----------------------------------------------------------------------------------------------
        // A superclass variable can reference a subclass object
        System.out.println("\n---- A superclass variable can reference a subclass object ----");

        Box plainBox = new Box();
            /* - output for plainBox: none. (A message was not implemented when calling the default constructor in
                 the Box class)
             */
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
            /* - output for wightBox:
                 Inside Box's constructor
                 Inside BoxWeight's constructor
             */

        System.out.println(weightBox.volume());
        System.out.println(weightBox.weight);

            // Assign BoxWeight reference to Box reference
        plainBox = weightBox;

        /* OK, volume() is defined in Box class
           Because 'volume()' is overridden, the actual version of the method that is called depends on the actual
           type of the object, in this case BoxWeight and not Box.
         */
        System.out.println(plainBox.volume()); // Help: Dynamic Method Dispatch in Java
        // System.out.println(plainBox.weight); // Error! plainBox does not define a weight member.

            /* ------
             System.out.println(weightBox instanceof BoxWeight); => true
             System.out.println(weightBox instanceof Box); => true
             System.out.println(plainBox.getClass().getSimpleName()); => BoxWeight
             System.out.println(plainBox.getClass().getSuperclass().getSimpleName()); => Box
             ----- */

        /*
            - Here, weightBox is a reference to BoxWeight objects, and plainBox is a
              reference to Box objects. Since BoxWeight is a subclass of Box, it is
              permissible to assign plainBox a reference to the weightBox object.
              It is important to understand that it is the type of the reference variable—not
              the type of the object that it refers to—that determines what members can be
              accessed. That is, when a reference to a subclass object is assigned to a
              superclass reference variable, you will have access only to those parts of the
              object defined by the superclass. This is why plainBox can’t access weight
              even when it refers to a BoxWeight object. If you think about it, this makes
              sense, because the superclass has no knowledge of what a subclass adds to it.
              This is why the last line of code in the preceding fragment is commented out. It
              is not possible for a Box reference to access the weight field, because Box does
              not define one.
              Although the preceding may seem a bit esoteric, it has some important
              practical applications.
         */

        // -----------------------------------------------------------------------------------------------

    }
}
