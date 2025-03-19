/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion7.parquediversiones;

import java.util.Queue;
import java.util.LinkedList;

public class PoolEquiposVR {
    private Queue<EquipoVR> pool;
    private int limite;

    public PoolEquiposVR(int limite) {
        this.limite = limite;
        this.pool = new LinkedList<>();
        for (int i = 0; i < limite; i++) {
            pool.add(new EquipoVR("VR-" + (i + 1)));
        }
    }
    
    public EquipoVR obtenerEquipo() {
        if (!pool.isEmpty()) {
            return pool.poll();
        } else {
            System.out.println("No hay equipos VR disponibles, espere...");
            return null;
        }
    }
    
    public void liberarEquipo(EquipoVR equipo) {
        pool.offer(equipo);
    }
}

