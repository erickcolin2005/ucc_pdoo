/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.rastreo;

import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RastreoApp {

    public static void main(String[] args) {

        // Dispositivos GPS adaptados
        IGPS garmin = new GarminAdapter();
        IGPS tomtom = new TomTomAdapter();
        IGPS huawei = new HuaweiAdapter();

        // Vistas disponibles
        IPanel vistaDesktop = new PanelDesktop();
        IPanel vistaMobile = new PanelMobile();

        // Paneles configurados
        PanelRastreo panelEscritorio = new PanelRastreoVehiculo(vistaDesktop);
        PanelRastreo panelMovil = new PanelRastreoVehiculo(vistaMobile);

        System.out.println("\n== Rastreo con Garmin ==");
        panelEscritorio.mostrar(garmin);
        panelMovil.mostrar(garmin);

        System.out.println("\n== Rastreo con TomTom ==");
        panelEscritorio.mostrar(tomtom);
        panelMovil.mostrar(tomtom);

        System.out.println("\n== Rastreo con Huawei ==");
        panelEscritorio.mostrar(huawei);
        panelMovil.mostrar(huawei);

        // Mostrar encabezado final solicitado
        imprimirEncabezado();
    }

    public static void imprimirEncabezado() {
        String horaActual = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("\n===============================");
        System.out.println("Definir Encabezado Personalizado del Programa");
        System.out.println();
        System.out.println("HORA ACTUAL: " + horaActual);
        System.out.println("UNIVERSIDAD COOPERATIVA DE COLOMBIA");
        System.out.println("Erick Collin Albornoz Hernandez");
        System.out.println("usuario git: erickcolin2005");
        System.out.println("repositorio: ucc_pdoo");
        System.out.println("Identidad (Base64): " + getIdentidad());
        System.out.println("Patrón Implementado: " + getPatron());
        System.out.println("===============================");
    }

    public static String getIdentidad() {
        String nombre = "Erick Collin Albornoz Hernandez";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Adapter + Bridge";
    }
}


