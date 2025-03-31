/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.bridgefacturacion;

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
 * Como desarrollador de un sistema de facturación electrónica, necesito que el sistema
 * pueda emitir facturas tanto en formato PDF como en XML, dependiendo del cliente.
 */

public class Main {

    public static void main(String[] args) {
        encabezado();

        Factura factura1 = new FacturaElectronica(new FormatoPDF());
        factura1.emitir("Factura #789 - Total: $1.200.000");

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

