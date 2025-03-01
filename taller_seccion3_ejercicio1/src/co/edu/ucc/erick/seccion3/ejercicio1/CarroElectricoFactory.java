/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.seccion3.ejercicio1;

public class CarroElectricoFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new CarroElectrico();
    }
}
