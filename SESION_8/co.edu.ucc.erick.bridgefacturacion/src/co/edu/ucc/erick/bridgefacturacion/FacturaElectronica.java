/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.bridgefacturacion;

public class FacturaElectronica extends Factura {

    public FacturaElectronica(FormatoFactura formato) {
        super(formato);
    }

    @Override
    public void emitir(String datos) {
        formato.generarFactura(datos);
    }
}

