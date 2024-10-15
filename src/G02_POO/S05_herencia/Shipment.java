package G02_POO.S05_herencia;

/* Notes:
- Shipment inherits all aspects of BoxWeight and Box
- Shipments adds the cost component
 */

public class Shipment extends BoxWeight {

    double cost;

    // Construct clone of an object
    Shipment(Shipment shipment) {
        super(shipment);
        this.cost = shipment.cost;
    }

    // Constructor when all parameters are specified
    Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
        System.out.println("Inside Shipment's constructor");
    }

    // Default constructor
    Shipment() {
        super();
        this.cost = -1;
    }

}
