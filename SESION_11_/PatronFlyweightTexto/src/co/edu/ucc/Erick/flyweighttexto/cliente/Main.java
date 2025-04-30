/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.flyweighttexto.cliente;

import co.edu.ucc.Erick.flyweighttexto.interfaces.ILetra;
import co.edu.ucc.Erick.flyweighttexto.fabrica.FabricaLetras;
import java.time.LocalTime;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        System.out.println("usuario git: erickcolin2005");
        System.out.println("ucc_pdoo");
        System.out.println("HORA ACTUAL: " + LocalTime.now());
        System.out.println("UNIVERSIDAD COOPERATIVA DE COLOMBIA");

        System.out.println("--- Ejecutando historia de usuario ---");
        System.out.println("Como desarrollador, quiero ahorrar memoria en el editor de texto reutilizando las mismas letras en diferentes posiciones.");
        System.out.println("--------------------------------------------------------------------");

        ILetra letraA1 = FabricaLetras.obtenerLetra('A');
        ILetra letraA2 = FabricaLetras.obtenerLetra('A');
        ILetra letraB = FabricaLetras.obtenerLetra('B');

        letraA1.mostrar("1");
        letraA2.mostrar("2");
        letraB.mostrar("3");

        System.out.println(getIdentidad());
        System.out.println(getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Erick Collin Albornoz Hernández";
        return "Identidad codificada: " + Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón implementado: Flyweight";
    }
}
