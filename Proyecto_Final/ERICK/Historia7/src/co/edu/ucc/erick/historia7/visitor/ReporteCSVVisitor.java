/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia7.visitor;
import co.edu.ucc.erick.historia7.dominio.*;
public class ReporteCSVVisitor implements InformeVisitor {
    private final StringBuilder sb = new StringBuilder("TIPO;DATA\n");
    public void visit(Ruta r){ sb.append("Ruta;").append(r).append('\n'); }
    public void visit(Bus b){ sb.append("Bus;").append(b).append('\n'); }
    public void visit(Conductor c){ sb.append("Conductor;").append(c).append('\n'); }
    public void visit(Evento e){ sb.append("Evento;").append(e).append('\n'); }
    public String csv(){ return sb.toString(); }
}

