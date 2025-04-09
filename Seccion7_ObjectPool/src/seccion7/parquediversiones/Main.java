/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion7.parquediversiones;

public class Main {
    public static void main(String[] args) {
        // Imprimir encabezado
        System.out.println("=======================================");
        System.out.println("Nombre: Erick Collin Albornoz Hernández");
        System.out.println("Universidad: [Tu Universidad]");
        System.out.println("Hora: [Hora actual]");
        System.out.println("Materia: Patrones de Diseño");
        System.out.println("=======================================\n");
        
        PoolEquiposVR pool = new PoolEquiposVR(3);
        
        EquipoVR e1 = pool.obtenerEquipo();
        EquipoVR e2 = pool.obtenerEquipo();
        
        if (e1 != null) {
            e1.asignarUsuario("Carlos");
            pool.liberarEquipo(e1);
        }
        
        EquipoVR e3 = pool.obtenerEquipo();
        if (e3 != null) {
            e3.asignarUsuario("Ana");
        }
    }
}

