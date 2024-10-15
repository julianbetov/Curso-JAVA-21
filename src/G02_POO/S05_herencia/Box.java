package G02_POO.S05_herencia;

// Superclass

public class Box {

    private double width;
    private double height;
    private double depth;

    // Construct clone of an object
    Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    // Constructor used when all dimensions specified
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        System.out.println("Inside Box's constructor");
    }

    // Constructor used when no dimensions specified
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor used when cube is created
    Box(double length) {
        width = height = depth = length;
    }

    // Compute and return volume
    double volume() {
        System.out.println("Volume method from Box class");
        return width * height * depth;
    }

}
