/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.factory;

public class PrestamoHipotecario implements Prestamo {
    @Override
    public void mostrarDetalles() {
        System.out.println("Préstamo Hipotecario: tasa 5%, plazo 30 años");
    }
}
