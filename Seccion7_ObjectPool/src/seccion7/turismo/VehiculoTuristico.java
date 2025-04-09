/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion7.turismo;

public class VehiculoTuristico {
    private String id;
    
    public VehiculoTuristico(String id) {
        this.id = id;
        System.out.println("Nuevo vehículo disponible: " + id);
    }
    
    public void asignarRecorrido(String recorrido) {
        System.out.println("Vehículo " + id + " asignado a " + recorrido);
    }
}

