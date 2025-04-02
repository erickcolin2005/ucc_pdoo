/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.rastreo;

public class HuaweiAdapter implements IGPS {
    private HuaweiGPSAPI huawei = new HuaweiGPSAPI();

    @Override
    public String obtenerUbicacion() {
        return huawei.ubicacionActual();
    }

    @Override
    public String obtenerEstadoVehiculo() {
        return huawei.estadoActual();
    }
}

