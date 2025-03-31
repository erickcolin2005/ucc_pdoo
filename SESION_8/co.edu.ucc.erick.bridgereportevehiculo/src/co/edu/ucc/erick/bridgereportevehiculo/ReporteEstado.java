/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.bridgereportevehiculo;

public class ReporteEstado extends ReporteVehiculo {

    public ReporteEstado(ModoReporte salida) {
        super(salida);
    }

    @Override
    public void generar(String estado) {
        salida.imprimir("Estado del vehículo: " + estado);
    }
}

