/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.ejercicio7;

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

        // Crear historial original
        MedicalRecord original = new MedicalRecord("Juan Pérez");
        original.agregarNota("Ingreso hospitalario: 2025-04-20");
        original.agregarNota("Diagnóstico: Afección respiratoria");

        // Clonar y modificar sin alterar el original
        MedicalRecord copia = original.clone();
        copia.agregarNota("Nota adicional: Nueva prescripción médica");

        System.out.println("=== Historial Original ===");
        System.out.println(original);
        System.out.println();
        System.out.println("=== Historial Clonado Modificado ===");
        System.out.println(copia);
    }
}

