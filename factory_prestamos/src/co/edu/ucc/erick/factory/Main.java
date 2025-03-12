/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.factory;

import java.time.LocalDateTime;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        // Mostrar encabezado
        System.out.println("=======================================");
        System.out.println("nombre: Erick Albornoz");
        System.out.println("campus: universidad cooperativa de colombia");
        System.out.println("fechayhora: " + LocalDateTime.now());
        System.out.println("repositorio git: https://github.com/erickcolin2005");
        System.out.println("=======================================\n");

        // Crear préstamos usando Factory
        Prestamo p1 = FabricaPrestamo.obtenerPrestamo("hipotecario");
        Prestamo p2 = FabricaPrestamo.obtenerPrestamo("automotriz");
        Prestamo p3 = FabricaPrestamo.obtenerPrestamo("personal");

        // Mostrar detalles de los préstamos
        p1.mostrarDetalles();
        p2.mostrarDetalles();
        p3.mostrarDetalles();

        // Mostrar identidad en Base64
        System.out.println("\nIdentidad (Base64): " + getIdentidad());
    }

    public static String getIdentidad() {
        String datos = "Erick Albornoz | universidad cooperativa de colombia";
        return Base64.getEncoder().encodeToString(datos.getBytes());
    }
}

