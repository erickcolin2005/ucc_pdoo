/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.simulacion.hilo;
import co.edu.ucc.erick.simulacion.flyweight.*;
import co.edu.ucc.erick.simulacion.observer.*;
public class BusHilo extends Thread{
    private final String placa; private final Observador obs; private final BusTipo tipo;
    public BusHilo(String placa,Observador o){
        this.placa=placa; this.obs=o;
        this.tipo=BusTipoFactory.get("Mercedes","O500",50);
    }
    @Override public void run(){
        try{
            while(!isInterrupted()){
                obs.actualizar(new EventoBus(placa,"LLEGADA","andén 3"));
                Thread.sleep(10000);
            }
        }catch(InterruptedException e){ /* final */ }
    }
}

