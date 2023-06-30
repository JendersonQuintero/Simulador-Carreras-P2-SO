/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auxiliar;

import main.Vehicle;

/**
 *
 * @author NorangelM
 */
public class ResultIA {
    
    private final Vehicle vehicle1;
    private final Vehicle vehicle2;
    private final String result;
    
    public ResultIA(Vehicle v1, Vehicle v2, String result) {
        this.vehicle1 = v1;
        this.vehicle2 = v2;
        this.result = result;
    }

    public Vehicle getVehicle1() {
        return vehicle1;
    }

    public Vehicle getVehicle2() {
        return vehicle2;
    }

    public String getResult() {
        return result;
    }
    
}
