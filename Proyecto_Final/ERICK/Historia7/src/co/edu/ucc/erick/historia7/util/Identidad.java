/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia7.util;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
public class Identidad {
    private static final String[] NOMBRES = {
        "Erick Collin Albornoz Hernandez"
    };
    public static void printIdentidades() {
        System.out.println("\nIdentidades (Base64):");
        for (String n : NOMBRES) {
            System.out.println("· " + Base64.getEncoder()
                    .encodeToString(n.getBytes(StandardCharsets.UTF_8)));
        }
    }
}

