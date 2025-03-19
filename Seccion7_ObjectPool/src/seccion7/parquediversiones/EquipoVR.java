/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion7.parquediversiones;

public class EquipoVR {
    private String id;
    
    public EquipoVR(String id) {
        this.id = id;
        System.out.println("Nuevo equipo VR disponible: " + id);
    }
    
    public void asignarUsuario(String usuario) {
        System.out.println("Equipo VR " + id + " asignado a " + usuario);
    }
}