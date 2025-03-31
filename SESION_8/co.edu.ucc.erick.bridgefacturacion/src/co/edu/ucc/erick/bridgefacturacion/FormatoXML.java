/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.bridgefacturacion;

public class FormatoXML implements FormatoFactura {
    @Override
    public void generarFactura(String datos) {
        System.out.println("Generando factura en XML: " + datos);
    }
}

