
package auxiliar;

import main.Vehicle;

/**
 *
 * @author Norangel Marin
 */
public class SelectedCars {
    private final Vehicle vehicle1;
    private final Vehicle vehicle2;
    
    public SelectedCars(Vehicle v1, Vehicle v2) {
        this.vehicle1 = v1;
        this.vehicle2 = v2;
    }

    public Vehicle getVehicle1() {
        return vehicle1;
    }

    public Vehicle getVehicle2() {
        return vehicle2;
    }
    
    
}
