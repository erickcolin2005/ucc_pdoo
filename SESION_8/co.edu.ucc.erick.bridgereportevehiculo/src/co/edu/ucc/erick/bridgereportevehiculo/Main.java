/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.bridgereportevehiculo;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

/**
 * Usuario Git: erickcolin2005
 * Proyecto: ucc_pdoo
 * Hora de ejecución: generada automáticamente
 * UNIVERSIDAD COOPERATIVA DE COLOMBIA
 *
 * Historia de Usuario:
 * Como supervisor de mantenimiento, quiero que el sistema de monitoreo pueda generar reportes del estado de los vehículos
 * con distintas salidas: en pantalla, archivo de texto o correo electrónico, sin modificar la lógica de captura de datos.
 */

public class Main {

    public static void main(String[] args) {
        encabezado();

        ReporteVehiculo reporte = new ReporteEstado(new Consola());
        reporte.generar("Motor funcionando, llantas en buen estado");

        System.out.println("Identidad codificada: " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static void encabezado() {
        String hora = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("usuario git: erickcolin2005");
        System.out.println("ucc_pdoo");
        System.out.println("Hora actual: " + hora);
        System.out.println("UNIVERSIDAD COOPERATIVA DE COLOMBIA\n");
    }

    public static String getIdentidad() {
        String nombre = "Erick Collin Albornoz Hernández";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Bridge";
    }
}

