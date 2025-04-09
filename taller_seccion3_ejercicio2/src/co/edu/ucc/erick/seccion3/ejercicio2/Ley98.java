/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.seccion3.ejercicio2;

public class Ley98 implements LiquidacionPension {
    @Override
    public double calcularPension(double salarioBase) {
        return salarioBase * 2.5;
    }
}

