package main;

import auxiliar.ResultIA;

/**
 *
 * @author JendersonQ
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Vehicle v1;
        Vehicle v2;
        Enterprise bug = new Enterprise();
        Enterprise lam = new Enterprise();
        
        IA procesador = new IA();
        
        for (int i = 0; i < 10; i++) {
            v1 = new Vehicle("B");
            v2 = new Vehicle("L");
            bug.addVehicle(v1);
            lam.addVehicle(v2);
        }
        
        System.out.println("BUGATTI");
        System.out.println(bug.getColaLevel1());
        System.out.println(bug.getColaLevel2());
        System.out.println(bug.getColaLevel3());
        
        System.out.println("LAMBORGHINI");
        System.out.println(lam.getColaLevel1());
        System.out.println(lam.getColaLevel2());
        System.out.println(lam.getColaLevel3());
        
        
        
    }
}
