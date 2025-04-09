/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.decoratornotificaciones;

public abstract class NotificacionDecorator implements Notificacion {
    protected Notificacion wrappee;

    public NotificacionDecorator(Notificacion n) {
        this.wrappee = n;
    }

    @Override
    public void enviar(String mensaje) {
        wrappee.enviar(mensaje);
    }
}

