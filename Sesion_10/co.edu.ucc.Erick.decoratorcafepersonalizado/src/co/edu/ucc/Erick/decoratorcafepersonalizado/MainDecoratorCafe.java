/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * HORA ACTUAL: 11:20 - 08/04/2025
 * UNIVERSIDAD COOPERATIVA DE COLOMBIA
 * Erick Collin Albornoz Hernandez
 * usuario git: erickcolin2005
 * repositorio: ucc_pdoo
 * Historia de Usuario:
 * Como barista digital en una app de pedidos, necesito permitir a los usuarios
 * personalizar su café con azúcar, leche, sabores, sin modificar la clase base.
 */

package co.edu.ucc.Erick.decoratorcafepersonalizado;

import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainDecoratorCafe {
    public static void main(String[] args) {
        imprimirEncabezado();

        Cafe miCafe = new CafeBasico();
        miCafe = new ConLeche(miCafe);
        miCafe = new ConAzucar(miCafe);

        System.out.println("Pedido: " + miCafe.descripcion());
        System.out.println("Costo total: $" + miCafe.costo());

        System.out.println("\nIdentidad (Base64): " + getIdentidad());
        System.out.println("Patrón aplicado: " + getPatron());
    }

    public static void imprimirEncabezado() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm - dd/MM/yyyy");
        String horaActual = LocalDateTime.now().format(formatter);

        System.out.println("HORA ACTUAL: " + horaActual);
        System.out.println("UNIVERSIDAD COOPERATIVA DE COLOMBIA");
        System.out.println("Erick Collin Albornoz Hernandez");
        System.out.println("usuario git: erickcolin2005");
        System.out.println("repositorio: ucc_pdoo\n");
    }

    public static String getIdentidad() {
        String nombre = "Erick Collin Albornoz Hernandez";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón Decorator";
    }
}

