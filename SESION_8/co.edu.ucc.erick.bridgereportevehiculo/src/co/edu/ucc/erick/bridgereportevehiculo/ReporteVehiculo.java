/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.bridgereportevehiculo;

public abstract class ReporteVehiculo {
    protected ModoReporte salida;

    public ReporteVehiculo(ModoReporte salida) {
        this.salida = salida;
    }

    public abstract void generar(String estado);
}
