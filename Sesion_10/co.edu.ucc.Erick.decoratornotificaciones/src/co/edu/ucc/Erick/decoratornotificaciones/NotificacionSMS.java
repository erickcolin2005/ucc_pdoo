/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.decoratornotificaciones;

public class NotificacionSMS extends NotificacionDecorator {
    public NotificacionSMS(Notificacion n) {
        super(n);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando SMS: " + mensaje);
    }
}

