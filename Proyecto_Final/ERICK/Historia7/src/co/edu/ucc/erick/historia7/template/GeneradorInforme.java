/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia7.template;
import co.edu.ucc.erick.historia7.util.*;
public abstract class GeneradorInforme {
    public final void generar(){
        HeaderPrinter.print();
        recolectar(); ordenar(); formatear(); firmar(); exportar();
        Identidad.printIdentidades();
    }
    protected abstract void recolectar();
    protected void ordenar(){} protected void formatear(){}
    protected void firmar(){ System.out.println("Firmado digitalmente…"); }
    protected abstract void exportar();
}

