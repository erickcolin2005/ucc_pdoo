/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion7.hospital;

/**
 * Nombre: Erick Collin Albornoz Hernández
 * Universidad: [Tu Universidad]
 * Hora: [Hora actual]
 * Materia: Patrones de Diseño
 */

public class Main {
    public static void main(String[] args) {
        // Imprimir encabezado del programa
        System.out.println("=======================================");
        System.out.println("Nombre: Erick Collin Albornoz Hernández");
        System.out.println("Universidad: [Tu Universidad]");
        System.out.println("Hora: [Hora actual]");
        System.out.println("Materia: Patrones de Diseño");
        System.out.println("=======================================\n");
        
        // Implementación del Object Pool para camillas en un hospital
        PoolCamillas pool = new PoolCamillas(3);
        
        Camilla c1 = pool.obtenerCamilla();
        Camilla c2 = pool.obtenerCamilla();
        Camilla c3 = pool.obtenerCamilla();
        Camilla c4 = pool.obtenerCamilla(); // No hay más camillas disponibles
        
        if (c1 != null) {
            c1.asignarPaciente("María");
            pool.liberarCamilla(c1);
        }
        
        Camilla c5 = pool.obtenerCamilla(); // Ahora hay una camilla disponible
        if (c5 != null) {
            c5.asignarPaciente("Pedro");
        }
    }
}