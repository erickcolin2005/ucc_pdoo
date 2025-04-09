/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion.pkg3.factory;

interface Figura {
    void dibujar();
}

class Circulo implements Figura {
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}

class Cuadrado implements Figura {
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}

class FiguraFactory {
    public static Figura crearFigura(String tipo) {
        if (tipo.equalsIgnoreCase("circulo")) return new Circulo();
        else if (tipo.equalsIgnoreCase("cuadrado")) return new Cuadrado();
        return null;
    }
}

