/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.rastreo;

public class PanelRastreoVehiculo extends PanelRastreo {

    public PanelRastreoVehiculo(IPanel vista) {
        super(vista);
    }

    @Override
    public void mostrar(IGPS gps) {
        String ubicacion = gps.obtenerUbicacion();
        String estado = gps.obtenerEstadoVehiculo();
        vista.mostrarDatos(ubicacion, estado);
    }
}

