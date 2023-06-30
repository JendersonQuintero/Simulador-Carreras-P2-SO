
package main;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Norangel marin
 */
public class Enterprise {
    
    private final Queue<Vehicle> colaLevel1;
    private final Queue<Vehicle> colaLevel2;
    private final Queue<Vehicle> colaLevel3;
    private final Queue<Vehicle> refuerzo;
    
    private int racersWin;
    
    public Enterprise() {
        this.colaLevel1 = new LinkedList();
        this.colaLevel2 = new LinkedList();
        this.colaLevel3 = new LinkedList();
        this.refuerzo = new LinkedList();
        this.racersWin = 0;
    }
    
    public Vehicle getVehicle(int priority) {
        return switch (priority) {
            case 1 -> this.colaLevel1.poll();
            case 2 -> this.colaLevel2.poll();
            default -> this.colaLevel3.poll();
        };
    }
    
    public void addVehicle(Vehicle vehicle) {
        switch (vehicle.getPriorityLevel()) {
            case 1 -> this.colaLevel1.add(vehicle);
            case 2 -> this.colaLevel2.add(vehicle);
            default -> this.colaLevel3.add(vehicle);
        }
    }
    
    public void addVehicleRef(Vehicle vehicle) {
        this.refuerzo.add(vehicle);
    }
    
    public void deleteVehicle(Vehicle vehicle) {
        switch (vehicle.getPriorityLevel()) {
            case 1 -> this.colaLevel1.removeIf(vh -> vh.getuId() == vehicle.getuId());
            case 2 -> this.colaLevel2.removeIf(vh -> vh.getuId() == vehicle.getuId());
            default -> this.colaLevel3.removeIf(vh -> vh.getuId() == vehicle.getuId());
        }
    }

    public Queue<Vehicle> getColaLevel1() {
        return colaLevel1;
    }

    public Queue<Vehicle> getColaLevel2() {
        return colaLevel2;
    }

    public Queue<Vehicle> getColaLevel3() {
        return colaLevel3;
    }

    public Queue<Vehicle> getRefuerzo() {
        return refuerzo;
    }

    public int getRacersWin() {
        return racersWin;
    }

    public void addRacerWin() {
        this.racersWin++;
    }
    
    
    
}