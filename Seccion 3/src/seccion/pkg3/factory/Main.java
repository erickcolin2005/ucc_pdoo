/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion.pkg3.factory;

public class Main {
    public static void main(String[] args) {
        Figura f1 = FiguraFactory.crearFigura("circulo");
        f1.dibujar();
    }
}
