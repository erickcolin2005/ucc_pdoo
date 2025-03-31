/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.adapterfacturacion;

public class AdaptadorReporte implements ReporteNuevo {
    private SistemaContableAntiguo sistema;

    public AdaptadorReporte(SistemaContableAntiguo sistema) {
        this.sistema = sistema;
    }

    @Override
    public void generar(String datos) {
        sistema.exportar(datos);
    }
}


