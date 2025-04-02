/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.rastreo;

public class PanelDesktop implements IPanel {

    @Override
    public void mostrarDatos(String ubicacion, String estado) {
        System.out.println("🖥️ Vista ESCRITORIO");
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Estado del vehículo: " + estado);
    }
}

