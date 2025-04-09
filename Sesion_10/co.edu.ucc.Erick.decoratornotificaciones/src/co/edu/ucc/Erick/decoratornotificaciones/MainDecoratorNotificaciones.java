/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * HORA ACTUAL: 11:10 - 08/04/2025
 * UNIVERSIDAD COOPERATIVA DE COLOMBIA
 * Erick Collin Albornoz Hernandez
 * usuario git: erickcolin2005
 * repositorio: ucc_pdoo
 * Historia de Usuario:
 * Como responsable de comunicación, quiero que las notificaciones puedan enviarse
 * por email, SMS y notificaciones push sin modificar el código base.
 */

package co.edu.ucc.Erick.decoratornotificaciones;

import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainDecoratorNotificaciones {
    public static void main(String[] args) {
        imprimirEncabezado();

        Notificacion notificacion = new NotificacionBasica();
        notificacion = new NotificacionEmail(notificacion);
        notificacion = new NotificacionSMS(notificacion);

        notificacion.enviar("¡Bienvenido al sistema!");

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

