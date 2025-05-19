/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia8.memento;
public class ModuloCritico {
    private String estado="{}";
    public EstadoModulo crearMemento(){ return new EstadoModulo(estado); }
    public void restaurar(EstadoModulo m){ estado=m.json(); }
    public void cancelarViaje(){ estado="{cancelado:true}"; }
}
