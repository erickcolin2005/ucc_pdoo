/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.factory;

public class PrestamoPersonal implements Prestamo {
    @Override
    public void mostrarDetalles() {
        System.out.println("Préstamo Personal: tasa 10%, plazo 3 años");
    }
}

