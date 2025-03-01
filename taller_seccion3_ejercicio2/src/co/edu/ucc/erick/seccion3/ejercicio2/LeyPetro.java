/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.seccion3.ejercicio2;

public class LeyPetro implements LiquidacionPension {
    @Override
    public double calcularPension(double salarioBase) {
        double topeMaximo = 3.5 * 1400000;
        double montoCalculado = salarioBase * 0.7;
        return Math.min(montoCalculado, topeMaximo);
    }
}

