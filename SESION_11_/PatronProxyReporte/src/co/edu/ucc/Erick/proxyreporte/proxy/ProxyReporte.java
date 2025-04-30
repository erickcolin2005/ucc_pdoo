/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.proxyreporte.proxy;

import co.edu.ucc.Erick.proxyreporte.interfaces.IReporte;
import co.edu.ucc.Erick.proxyreporte.implementacion.ReporteReal;

public class ProxyReporte implements IReporte {
    private ReporteReal reporteReal;
    private String rolUsuario;

    public ProxyReporte(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public void mostrar() {
        if ("gerente".equalsIgnoreCase(rolUsuario)) {
            if (reporteReal == null) {
                reporteReal = new ReporteReal();
            }
            reporteReal.mostrar();
        } else {
            System.out.println("Acceso denegado: " + rolUsuario);
        }
    }
}

