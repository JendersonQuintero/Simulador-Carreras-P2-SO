package main;

import java.util.Random;

/**
 *
 * @author JendersonQ
 */
public class Vehicle {
    
    private final int uId;
    private int priorityLevel;
    private int counterPriority;
    private final String enterprise;
    
    private final double betterQualityCarroceria = 0.6; // 60%
    private final double betterQualityChasis = 0.7; // 70%
    private final double betterQualityMotor = 0.5; // 50%
    private final double betterQualityRueda = 0.4; // 40%
    
    private final double renderVehicle;
    
    private final double umbralLevel1 = 0.80;
    private final double umbralLevel2 = 0.50;
    
    
    public Vehicle(String enterprise) {
        Random random = new Random();
        
        this.uId = random.nextInt(1000);
        this.enterprise = enterprise;
        
        double randomQualityCarroceria = random.nextDouble();
        double randomQualityChasis = random.nextDouble();
        double randomQualityMotor = random.nextDouble();
        double randomQualityRueda = random.nextDouble();
        
        double qualityCarroceria = 0;
        double qualityChasis = 0;
        double qualityMotor = 0;
        double qualityRueda = 0;
        
        if (randomQualityCarroceria >= betterQualityCarroceria) {
            qualityCarroceria += 0.35;
        } else if (randomQualityCarroceria >= (betterQualityCarroceria - 0.3) && randomQualityCarroceria < betterQualityCarroceria) {
            qualityCarroceria += 0.15;
        } else {
            qualityCarroceria += 0.1;
        }
        
        if (randomQualityChasis >= betterQualityChasis) {
            qualityChasis += 0.25;
        } else if (randomQualityChasis >= (betterQualityChasis - 0.3) && randomQualityChasis < betterQualityChasis) {
            qualityChasis += 0.1;
        } else {
            qualityChasis += 0.05;
        }
        
        if (randomQualityMotor >= betterQualityMotor) {
            qualityMotor += 0.35;
        } else if (randomQualityMotor >= (betterQualityMotor - 0.3) && randomQualityMotor < betterQualityMotor) {
            qualityMotor += 0.15;
        } else {
            qualityMotor += 0.1;
        }
        
        if (randomQualityRueda >= betterQualityRueda) {
            qualityRueda += 0.15;
        } else if (randomQualityRueda >= (betterQualityRueda - 0.3) && randomQualityRueda < betterQualityRueda) {
            qualityRueda += 0.1;
        } else {
            qualityRueda += 0.05;
        }
        
        this.renderVehicle = qualityCarroceria + qualityChasis + qualityMotor + qualityRueda;
        
        if (renderVehicle >= umbralLevel1) {
            this.priorityLevel = 1;
        } else if (renderVehicle >= umbralLevel2 && renderVehicle < umbralLevel1) {
            this.priorityLevel = 2;
        } else {
            this.priorityLevel = 3;
        }
    }
    
    
    public int getuId() {
        return uId;
    }
    
    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public int getCounterPriority() {
        return counterPriority;
    }

    public void addCounterPriority() {
        this.counterPriority++;
    }
    
    public void resetCounterPriority() {
        this.counterPriority = 0;
    }
    
    public String getEnterprise() {
        return enterprise;
    }

    public double getRenderVehicle() {
        return renderVehicle;
    }
    
    
}

    
