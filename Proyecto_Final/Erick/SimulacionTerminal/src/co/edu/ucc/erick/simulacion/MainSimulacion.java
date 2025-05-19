/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.simulacion;
import co.edu.ucc.erick.simulacion.hilo.BusHilo;
import co.edu.ucc.erick.simulacion.observer.*;
public class MainSimulacion {
    public static void main(String[] args) throws InterruptedException{
        Observador pantalla = e -> System.out.println(e);
        BusHilo bus = new BusHilo("ABC-123",pantalla);
        bus.start();
        Thread.sleep(30000);      // 30 s de simulación
        bus.interrupt();
    }
}

