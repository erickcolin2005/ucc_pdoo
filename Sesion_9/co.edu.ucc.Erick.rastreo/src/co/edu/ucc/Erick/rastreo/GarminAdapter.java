/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.rastreo;

public class GarminAdapter implements IGPS {
    private GarminAPI garmin = new GarminAPI();

    @Override
    public String obtenerUbicacion() {
        return garmin.getLocation();
    }

    @Override
    public String obtenerEstadoVehiculo() {
        return garmin.getStatus();
    }
}

