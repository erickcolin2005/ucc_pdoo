/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.bridgereportevehiculo;

public class Consola implements ModoReporte {
    @Override
    public void imprimir(String contenido) {
        System.out.println("Reporte en consola: " + contenido);
    }
}
