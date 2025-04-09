/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.seccion3.ejercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("\\n===== ENCABEZADO DEL PROGRAMA =====");
        System.out.println("Nombre: Erick");
        System.out.println("Campus: Universidad Cooperativa de Colombia");
        System.out.println("Fecha y Hora: " + obtenerFechaHoraActual());
        System.out.println("Repositorio Git: https://github.com/erickcolin2005");
        System.out.println("====================================\\n");

        LiquidacionPension pension = LiquidacionFactory.getLiquidacion("Ley 78");
        System.out.println("Pensión calculada Ley 78: " + pension.calcularPension(850000));
    }

    public static String obtenerFechaHoraActual() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}

