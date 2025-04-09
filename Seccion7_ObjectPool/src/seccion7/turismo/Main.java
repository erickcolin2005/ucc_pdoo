/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion7.turismo;

/**
 * Nombre: Erick Collin Albornoz Hernández
 * Universidad: [Tu Universidad]
 * Hora: [Hora actual]
 * Materia: Patrones de Diseño
 */

public class Main {
    public static void main(String[] args) {
        // Imprimir encabezado
        System.out.println("=======================================");
        System.out.println("Nombre: Erick Collin Albornoz Hernández");
        System.out.println("Universidad: [Tu Universidad]");
        System.out.println("Hora: [Hora actual]");
        System.out.println("Materia: Patrones de Diseño");
        System.out.println("=======================================\n");
        
        // Implementación del Object Pool
        PoolVehiculos pool = new PoolVehiculos(2);
        
        VehiculoTuristico v1 = pool.obtenerVehiculo();
        VehiculoTuristico v2 = pool.obtenerVehiculo();
        VehiculoTuristico v3 = pool.obtenerVehiculo(); // No hay vehículos disponibles
        
        if (v1 != null) {
            v1.asignarRecorrido("Tour por la ciudad");
            pool.liberarVehiculo(v1);
        }
        
        VehiculoTuristico v4 = pool.obtenerVehiculo(); // Ahora hay uno disponible
        if (v4 != null) {
            v4.asignarRecorrido("Visita a las montañas");
        }
    }
}






