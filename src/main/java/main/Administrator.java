/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import aux.ResultIA;
import aux.SelectedCars;

/**
 *
 * @author JendersonQ
 */
public class Administrator {
    
    private final double probablyReview = 0.8;
    private int reviewCars;
    private final Enterprise bugatti;
    private final Enterprise lamborghini;
    private final IA ia;
    
    private final int[] listWinners;
    
    public Administrator(Enterprise bugatti, Enterprise lamborghini, IA ia) {
        this.reviewCars = 0;
        
        this.bugatti = bugatti;
        this.lamborghini = lamborghini;
        this.ia = ia;
        
        this.listWinners = new int[100];
        
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
            tempV2 = this.bugatti.getVehicle(1);
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
                    } else {
                        this.lamborghini.addRacerWin();
                    }
                }
                case "CARRERA INVALIDA" -> {}
                case "EMPATE" -> {}
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        
    }
    
}
