/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia7.dominio;
import co.edu.ucc.erick.historia7.visitor.InformeVisitor;
public record Ruta(String codigo,String origen,String destino) implements Visitable {
    @Override public void accept(InformeVisitor v){ v.visit(this); }
}

