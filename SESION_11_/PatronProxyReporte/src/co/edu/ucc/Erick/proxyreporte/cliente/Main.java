/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.proxyreporte.cliente;

import co.edu.ucc.Erick.proxyreporte.interfaces.IReporte;
import co.edu.ucc.Erick.proxyreporte.proxy.ProxyReporte;
import java.time.LocalTime;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        System.out.println("usuario git: erickcolin2005");
        System.out.println("ucc_pdoo");
        System.out.println("HORA ACTUAL: " + LocalTime.now());
        System.out.println("UNIVERSIDAD COOPERATIVA DE COLOMBIA");

        System.out.println("--- Ejecutando historia de usuario ---");
        System.out.println("Como gerente, quiero visualizar reportes confidenciales solo si tengo permisos válidos.");
        System.out.println("----------------------------------------------------");

        IReporte reporte1 = new ProxyReporte("gerente");
        reporte1.mostrar();

        IReporte reporte2 = new ProxyReporte("empleado");
        reporte2.mostrar();

        System.out.println(getIdentidad());
        System.out.println(getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Erick Collin Albornoz Hernández";
        return "Identidad codificada: " + Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón implementado: Proxy";
    }
}

