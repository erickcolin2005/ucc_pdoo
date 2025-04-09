/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.decoratornotificaciones;

public class NotificacionBasica implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Notificación básica: " + mensaje);
    }
}

