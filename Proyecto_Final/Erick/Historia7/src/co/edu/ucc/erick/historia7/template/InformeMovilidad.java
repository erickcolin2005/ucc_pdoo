/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia7.template;
import co.edu.ucc.erick.historia7.dominio.*;
import co.edu.ucc.erick.historia7.visitor.*;
import java.util.List;
public class InformeMovilidad extends GeneradorInforme {
    private String csv;
    @Override protected void recolectar(){
        var elementos = List.of(
            new Ruta("MIO01","Sur","Centro"),
            new Bus("VWX-123","Empresa CaliBus"),
            new Conductor("Lucas Pérez",8),
            new Evento("Retardo","15 min")
        );
        var vis = new ReporteCSVVisitor();
        elementos.forEach(e -> e.accept(vis));
        csv = vis.csv();
    }
    @Override protected void exportar(){ System.out.println(csv); }
}

