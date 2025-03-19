/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion7.hospital;

import java.util.Queue;
import java.util.LinkedList;

/**
 * Nombre: Erick Collin Albornoz Hernández
 * Universidad: [Tu Universidad]
 * Hora: [Hora actual]
 * Materia: Patrones de Diseño
 */

public class PoolCamillas {
    private Queue<Camilla> pool;
    private int limite;

    public PoolCamillas(int limite) {
        this.limite = limite;
        this.pool = new LinkedList<>();
        for (int i = 0; i < limite; i++) {
            pool.add(new Camilla("Camilla-" + (i + 1)));
        }
    }
    
    public Camilla obtenerCamilla() {
        if (!pool.isEmpty()) {
            return pool.poll();
        } else {
            System.out.println("No hay camillas disponibles, espere...");
            return null;
        }
    }
    
    public void liberarCamilla(Camilla camilla) {
        pool.offer(camilla);
    }
}