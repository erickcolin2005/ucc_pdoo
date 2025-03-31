/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.adapterfacturacion;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        encabezado();

        ReporteNuevo reporte = new AdaptadorReporte(new SistemaContableAntiguo());
        reporte.generar("Factura #123 - Total: $50.000");

        System.out.println("Identidad codificada: " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static void encabezado() {
        String hora = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("usuario git: erickcolin2005");
        System.out.println("ucc_pdoo");
        System.out.println("Hora actual: " + hora);
        System.out.println("UNIVERSIDAD COOPERATIVA DE COLOMBIA");
        System.out.println();
    }

    public static String getIdentidad() {
        String nombre = "Erick Collin Albornoz Hernández";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Adapter";
    }
}


