package main;

import interfaz.Interfaz;

/**
 *
 * @author JendersonQ
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        java.awt.EventQueue.invokeLater(() -> {
            new Interfaz().setVisible(true);
        });
  
        
    }
}
