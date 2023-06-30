package main;

import auxiliar.ResultIA;
import interfaz.Interfaz;
import java.util.Random;

/**
 *
 * @author JendersonQ
 */
public class IA {

    private final double probablyWin = 0.4;
    private final double probablyTie = 0.27;
    private final double probablyDontRacer = 0.33;
    private long timeToResultIA; // 10000
    
    private String statusIA;

    private ResultIA racerResult;
    
    public IA() {
        this.statusIA = "Esperando...";
    }

    public ResultIA racerResult(Vehicle v1, Vehicle v2, Interfaz view, long timeSimulation) throws InterruptedException {
        Random random = new Random();
        double randomResult = random.nextDouble();
        this.statusIA = "Decidiendo el resultado...";
        view.updateDataView();
        Thread.sleep(timeSimulation/2);
        if (randomResult <= probablyTie) {
            racerResult = new ResultIA(v1, v2, "EMPATE");
        } else if (randomResult <= (probablyDontRacer + probablyTie)) {
            racerResult = new ResultIA(v1, v2, "CARRERA INVALIDA");
        } else if (randomResult <= (probablyWin + probablyTie + probablyDontRacer)) {
            if (v1.getRenderVehicle() > v2.getRenderVehicle()) {
                racerResult = new ResultIA(v1, v2, "GANADOR");
            } else {
                racerResult = new ResultIA(v2, v1, "GANADOR");
            }
            
        }
        this.statusIA = "Anunciando el resultado...";
        view.updateDataView();
        Thread.sleep(timeSimulation);
        this.statusIA = "Esperando...";
        view.updateDataView();
        return racerResult;
    }
    
    public void updateTimeDuration(long newTime) {
        this.timeToResultIA = newTime;
    }
    
    public String getStatusIA() {
        return this.statusIA;
    }

}
