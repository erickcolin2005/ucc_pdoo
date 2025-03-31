/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.bridgefacturacion;

public abstract class Factura {
    protected FormatoFactura formato;

    public Factura(FormatoFactura formato) {
        this.formato = formato;
    }

    public abstract void emitir(String datos);
}
