/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.seccion3.ejercicio1;

import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Mostrar encabezado personalizado en la terminal
        System.out.println("\n===== ENCABEZADO DEL PROGRAMA =====");
        System.out.println("Nombre: Erick");
        System.out.println("Campus: Universidad Cooperativa de Colombia");
        System.out.println("Fecha y Hora: " + obtenerFechaHoraActual());
        System.out.println("Repositorio Git: https://github.com/erickcolin2005");
        System.out.println("====================================\n");
        
        // Uso del Factory Method
        VehiculoFactory factory1 = new CarroElectricoFactory();
        VehiculoFactory factory2 = new CarroGasolinaFactory();
        
        Vehiculo v1 = factory1.crearVehiculo();
        Vehiculo v2 = factory2.crearVehiculo();
        
        v1.conducir();
        v2.conducir();
        
        // Métodos requeridos
        System.out.println("Identidad codificada: " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }
    
    public static String getIdentidad() {
        String nombre = "Erick";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
    
    public static String getPatron() {
        return "Factory Method";
    }
    
    public static String obtenerFechaHoraActual() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}


