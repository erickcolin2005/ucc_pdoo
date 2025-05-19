/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia8.facade;
import co.edu.ucc.erick.historia8.memento.*;
public class AuditoriaFacade {
    private final Historial h = new Historial();
    private final ModuloCritico ventas = new ModuloCritico();
    public void cancelarVenta(){
        h.guardar(ventas.crearMemento());
        ventas.cancelarViaje();
        System.out.println("✔ Venta cancelada");
    }
    public void deshacer(){
        ventas.restaurar(h.ultimo());
        System.out.println("✔ Operación revertida");
    }
}

