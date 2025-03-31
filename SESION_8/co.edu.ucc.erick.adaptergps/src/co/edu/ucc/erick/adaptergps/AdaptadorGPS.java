/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.adaptergps;

public class AdaptadorGPS implements LocalizadorWeb {
    private GPSCamion gps;

    public AdaptadorGPS(GPSCamion gps) {
        this.gps = gps;
    }

    @Override
    public void mostrarUbicacion(String coordenadas) {
        String ubicacion = gps.obtenerUbicacion();
        System.out.println("Ubicación del camión: " + ubicacion);
    }
}

