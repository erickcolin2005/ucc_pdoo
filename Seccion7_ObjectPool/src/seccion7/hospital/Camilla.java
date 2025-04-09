/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion7.hospital;

/**
 * Nombre: Erick Collin Albornoz Hernández
 * Universidad: [Tu Universidad]
 * Hora: [Hora actual]
 * Materia: Patrones de Diseño
 */

public class Camilla {
    private String id;
    
    public Camilla(String id) {
        this.id = id;
        System.out.println("Nueva camilla disponible: " + id);
    }
    
    public void asignarPaciente(String paciente) {
        System.out.println("Camilla " + id + " asignada a paciente " + paciente);
    }
}

