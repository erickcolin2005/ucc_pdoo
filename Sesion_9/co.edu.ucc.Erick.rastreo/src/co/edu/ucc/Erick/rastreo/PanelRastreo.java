/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.rastreo;

public abstract class PanelRastreo {
    protected IPanel vista;

    public PanelRastreo(IPanel vista) {
        this.vista = vista;
    }

    public abstract void mostrar(IGPS gps);
}

