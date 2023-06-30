package main;

import auxiliar.ResultIA;
import java.util.Random;

/**
 *
 * @author JendersonQ
 */
public class IA {

    private final double probablyWin = 0.4;
    private final double probablyTie = 0.27;
    private final double probablyDontRacer = 0.33;
    
    private int timeToResultIA = 100; // 10000

    private ResultIA racerResult;

    public ResultIA racerResult(Vehicle v1, Vehicle v2) throws InterruptedException {
        try {
            Random random = new Random();
            double randomResult = random.nextDouble();
            if (randomResult <= probablyTie) {
                racerResult = new ResultIA(v1, v2, "EMPATE");
            } else if (randomResult <= (probablyDontRacer + probablyTie)) {
                racerResult = new ResultIA(v1, v2, "CARRERA INVALIDA");
            } else if (randomResult <= (probablyWin + probablyTie + probablyDontRacer)) {                
                if (v1.getRenderVehicle() > v2.getRenderVehicle()) {
                    System.out.println("Ganó el Vehiculo 1");
                    racerResult = new ResultIA(v1, v2, "GANADOR");
                } else {
                    System.out.println("Ganó el Vehiculo 2");
                    racerResult = new ResultIA(v2, v1, "GANADOR");
                }

            }
            Thread.sleep(this.timeToResultIA);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        return racerResult;
    }

    public int getTimeToResultIA() {
        return timeToResultIA;
    }

    public void setTimeToResultIA(int timeToResultIA) {
        this.timeToResultIA = timeToResultIA;
    }
    
    

}
