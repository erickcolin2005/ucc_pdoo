/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion.pkg3.vehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = VehiculoFactory.crearVehiculo("electrico");
        v1.conducir();
    }
}
