/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.facadehotel.cliente;

import co.edu.ucc.Erick.facadehotel.fachada.FacadeReservaHotel;
import java.time.LocalTime;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        System.out.println("usuario git: erickcolin2005");
        System.out.println("ucc_pdoo");
        System.out.println("HORA ACTUAL: " + LocalTime.now());
        System.out.println("UNIVERSIDAD COOPERATIVA DE COLOMBIA");

        System.out.println("--- Ejecutando historia de usuario ---");
        System.out.println("Como usuario, quiero reservar un hotel en línea sin tener que interactuar con reservas, pagos y facturación manualmente.");
        System.out.println("-------------------------------------");

        FacadeReservaHotel facade = new FacadeReservaHotel();
        facade.reservar();

        System.out.println(getIdentidad());
        System.out.println(getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Erick Collin Albornoz Hernández";
        return "Identidad codificada: " + Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón implementado: Facade";
    }
}
