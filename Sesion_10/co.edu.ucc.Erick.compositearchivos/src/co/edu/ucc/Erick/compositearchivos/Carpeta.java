/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.compositearchivos;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements ArchivoComponent {
    private String nombre;
    private List<ArchivoComponent> elementos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ArchivoComponent componente) {
        elementos.add(componente);
    }

    @Override
    public void mostrar() {
        System.out.println("Carpeta: " + nombre);
        for (ArchivoComponent c : elementos) {
            c.mostrar();
        }
    }
}

