/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.facadehotel.fachada;

import co.edu.ucc.Erick.facadehotel.interfaces.*;
import co.edu.ucc.Erick.facadehotel.servicios.*;

public class FacadeReservaHotel {
    private ISistemaReservas reservas;
    private ISistemaPagos pagos;
    private ISistemaFacturacion facturacion;

    public FacadeReservaHotel() {
        this.reservas = new SistemaReservas();
        this.pagos = new SistemaPagos();
        this.facturacion = new SistemaFacturacion();
    }

    public void reservar() {
        reservas.verificarDisponibilidad();
        pagos.procesarPago();
        facturacion.generarFactura();
        System.out.println("Reserva completada.");
    }
}

