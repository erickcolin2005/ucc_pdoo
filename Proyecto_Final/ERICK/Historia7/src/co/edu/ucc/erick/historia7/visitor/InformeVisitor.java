/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia7.visitor;
import co.edu.ucc.erick.historia7.dominio.*;
public interface InformeVisitor {
    void visit(Ruta r); void visit(Bus b);
    void visit(Conductor c); void visit(Evento e);
}
