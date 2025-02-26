/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion.pkg3.pensiones;

public class Main {
    public static void main(String[] args) {
        LiquidacionPension pension = PensionFactory.obtenerMetodo("Ley78");
        System.out.println("Pensión calculada: " + pension.calcularPension(850000));
    }
}
