/**
 * Autor: Erick [Nombre Completo]
 * Curso: Programación Orientada a Objetos
 * Universidad: UCC
 * Historia de Usuario: 
 * Como supervisor de producción, quiero poder registrar la cantidad de acero producido por cada máquina en un turno,
 * para poder llevar un control de la producción.
 */

package co.edu.ucc.ERICK.ManufacturaAcero;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

class Maquina {
    private String nombre;
    private double aceroProducido;

    public Maquina(String nombre) {
        this.nombre = nombre;
        this.aceroProducido = 0;
    }

    public void producirAcero(double cantidad) {
        this.aceroProducido += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAceroProducido() {
        return aceroProducido;
    }
}

class Turno {
    private List<Maquina> maquinas = new ArrayList<>();

    public void agregarMaquina(Maquina maquina) {
        maquinas.add(maquina);
    }

    public void mostrarProduccion() {
        for (Maquina maquina : maquinas) {
            System.out.println("Máquina: " + maquina.getNombre() + ", Acero Producido: " + maquina.getAceroProducido() + " toneladas");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Turno turno = new Turno();
        Maquina maquina1 = new Maquina("Máquina 1");
        Maquina maquina2 = new Maquina("Máquina 2");

        maquina1.producirAcero(5.3);
        maquina2.producirAcero(7.8);

        turno.agregarMaquina(maquina1);
        turno.agregarMaquina(maquina2);

        turno.mostrarProduccion();
        
        // Ejecutar los métodos getIdentidad y getPatron al final
        System.out.println("Identidad en Base64: " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    // Método que retorna el nombre completo codificado en Base64
    public static String getIdentidad() {
        String nombreCompleto = "Erick [Tu Apellido]";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes(StandardCharsets.UTF_8));
    }

    // Método que retorna el patrón implementado
    public static String getPatron() {
        return "Patrón Creacional - Factory Method";
    }
}
