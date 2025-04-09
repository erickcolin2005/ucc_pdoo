/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.compositemenuweb;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu {
    private String nombre;
    private List<ElementoMenu> elementos = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    @Override
    public void mostrar() {
        System.out.println("Menú: " + nombre);
        for (ElementoMenu e : elementos) {
            e.mostrar();
        }
    }
}
