/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.ejercicio5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("usuario git erickcolin2005");
        System.out.println("ucc_pdoo");
        String ahora = LocalDateTime.now()
                      .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(ahora);
        System.out.println("UNIVERSIDAD COOPERATIVA DE COLOMBIA");
        System.out.println();

        Auto autoPremium = new Auto.Builder()
                                .conMotor("eléctrico")
                                .conAudio("premium")
                                .conSensoresProximidad(true)
                                .build();

        System.out.println("=== Detalle del Auto Configurado ===");
        System.out.println(autoPremium);
    }
}
