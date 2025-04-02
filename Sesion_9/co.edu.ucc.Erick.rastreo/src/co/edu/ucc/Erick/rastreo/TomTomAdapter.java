/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.rastreo;

public class TomTomAdapter implements IGPS {
    private TomTomAPI tomtom = new TomTomAPI();

    @Override
    public String obtenerUbicacion() {
        return tomtom.fetchCoordinates();
    }

    @Override
    public String obtenerEstadoVehiculo() {
        return tomtom.vehicleState();
    }
}
