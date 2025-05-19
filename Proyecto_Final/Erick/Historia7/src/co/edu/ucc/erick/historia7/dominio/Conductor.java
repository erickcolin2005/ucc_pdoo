/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia7.dominio;
import co.edu.ucc.erick.historia7.visitor.InformeVisitor;
public record Conductor(String nombre,int aniosExperiencia) implements Visitable {
    @Override public void accept(InformeVisitor v){ v.visit(this); }
}
