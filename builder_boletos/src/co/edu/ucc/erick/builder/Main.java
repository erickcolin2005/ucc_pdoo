/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.builder;

import java.time.LocalDateTime;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        // Mostrar encabezado
        System.out.println("=======================================");
        System.out.println("nombre: Erick Albornoz");
        System.out.println("campus: universidad cooperativa de colombia");
        System.out.println("fechayhora: " + LocalDateTime.now());
        System.out.println("repositorio git: https://github.com/erickcolin2005");
        System.out.println("=======================================\n");

        // Crear boletos personalizados usando Builder
        Boleto boleto1 = new Boleto.BoletoBuilder("Económica")
                .agregarEquipajeExtra()
                .agregarComidaEspecial()
                .build();

        Boleto boleto2 = new Boleto.BoletoBuilder("Primera Clase")
                .agregarEquipajeExtra()
                .seleccionarAsiento()
                .agregarComidaEspecial()
                .build();

        // Mostrar detalles de los boletos
        boleto1.mostrarDetalles();
        boleto2.mostrarDetalles();

        // Mostrar identidad en Base64
        System.out.println("\nIdentidad (Base64): " + getIdentidad());
    }

    public static String getIdentidad() {
        String datos = "Erick Albornoz | universidad cooperativa de colombia";
        return Base64.getEncoder().encodeToString(datos.getBytes());
    }
}


    