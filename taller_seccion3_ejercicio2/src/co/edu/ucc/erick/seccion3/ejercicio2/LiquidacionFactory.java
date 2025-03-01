/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.seccion3.ejercicio2;

public class LiquidacionFactory {
    public static LiquidacionPension getLiquidacion(String ley) {
        switch (ley) {
            case "Ley 78": return new Ley78();
            case "Ley 86": return new Ley86();
            case "Ley 98": return new Ley98();
            case "Ley 100": return new Ley100();
            case "Ley Petro": return new LeyPetro();
            default: throw new IllegalArgumentException("Ley no reconocida");
        }
    }
}

