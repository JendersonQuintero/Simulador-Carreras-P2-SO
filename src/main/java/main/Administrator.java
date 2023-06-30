package main;

import auxiliar.ResultIA;
import auxiliar.SelectedCars;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author JendersonQ
 */
public class Administrator {
    
    private final double probablyReview = 0.8;
    private final double probablyRefor = 0.8;
    private int reviewCars;
    private final Enterprise bugatti;
    private final Enterprise lamborghini;
    private final IA ia;
    
    private final Random random = new Random();
    
    private final ArrayList listWinners;
    
    public Administrator(Enterprise bugatti, Enterprise lamborghini, IA ia) {
        this.reviewCars = 0;
        
        this.bugatti = bugatti;
        this.lamborghini = lamborghini;
        this.ia = ia;
        
        this.listWinners = new ArrayList();
        
    }
    
    public void loadCarsInit() {
        for (int i = 0; i < 10; i++) {
            Vehicle v1 = new Vehicle("B");
            Vehicle v2 = new Vehicle("L");
            this.bugatti.addVehicle(v1);
            this.lamborghini.addVehicle(v2);
        }
    }
    
    private SelectedCars selectCarsToRace() {
        Vehicle tempV1;
        Vehicle tempV2;
        if (!this.bugatti.getColaLevel1().isEmpty()) {
            tempV1 = this.bugatti.getVehicle(1);
        } else if (!this.bugatti.getColaLevel2().isEmpty()) {
            tempV1 = this.bugatti.getVehicle(2);
        } else {
            tempV1 = this.bugatti.getVehicle(3);
        }
        
        if (!this.lamborghini.getColaLevel1().isEmpty()) {
            tempV2 = this.lamborghini.getVehicle(1);
        } else if (!this.lamborghini.getColaLevel2().isEmpty()) {
            tempV2 = this.lamborghini.getVehicle(2);
        } else {
            tempV2 = this.lamborghini.getVehicle(3);
        }
        
        return new SelectedCars(tempV1, tempV2);
    }
    
    public void startRace() {
        try {
            SelectedCars cars = this.selectCarsToRace();
            ResultIA result = this.ia.racerResult(cars.getVehicle1(), cars.getVehicle2());
            
            switch (result.getResult()) {
                case "GANADOR" -> {
                    if (result.getVehicle1().getEnterprise().equals("B")) {
                        this.bugatti.addRacerWin();
                        this.listWinners.add(result.getVehicle1().getuId());
                    } else {
                        this.lamborghini.addRacerWin();
                        this.listWinners.add(result.getVehicle1().getuId());
                    }
                }
                case "CARRERA INVALIDA" -> {
                    if (result.getVehicle1().getEnterprise().equals("B")) {
                        this.bugatti.addVehicleRef(result.getVehicle1());
                        this.lamborghini.addVehicleRef(result.getVehicle2());
                    } else {
                        this.lamborghini.addVehicleRef(result.getVehicle1());
                        this.bugatti.addVehicleRef(result.getVehicle2());
                    }
                }
                case "EMPATE" -> {
                    if (result.getVehicle1().getEnterprise().equals("B")) {
                        this.bugatti.addPriority1Vehicle(result.getVehicle1());
                        this.lamborghini.addPriority1Vehicle(result.getVehicle2());
                    } else {
                        this.lamborghini.addPriority1Vehicle(result.getVehicle1());
                        this.bugatti.addPriority1Vehicle(result.getVehicle2());
                    }
                }
            }
            this.reviewCars += 2;
            
            if (this.reviewCars == 4) {
                double probablyNewVehicle = this.random.nextDouble();
                
                if (probablyNewVehicle <= probablyReview) {
                    Vehicle newVehicleB = new Vehicle("B");
                    Vehicle newVehicleL = new Vehicle("L");
                    this.bugatti.addVehicle(newVehicleB);
                    this.lamborghini.addVehicle(newVehicleL);
                }
                this.reviewCars = 0;
            }
            
            double probablyR = this.random.nextDouble();
            
            if (probablyR <= probablyRefor) {
                Vehicle vRefacB = this.bugatti.getVehicleRefac();
                Vehicle vRefacL = this.lamborghini.getVehicleRefac();
                
                this.bugatti.addPriority1Vehicle(vRefacB);
                this.lamborghini.addPriority1Vehicle(vRefacL);
            }
            
            
            
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        
    }
    
}
