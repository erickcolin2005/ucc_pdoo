/**
 * Autor: Erick [Nombre Completo]
 * Curso: Programación Orientada a Objetos
 * Universidad: UCC
 * Historia de Usuario: 
 * Como gerente de planta, quiero poder calcular el costo total de producción de un lote de acero, 
 * para poder planificar el presupuesto.
 */

package co.edu.ucc.ERICK.ManufacturaCostos;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

class LoteAcero {
    private double cantidad; // en toneladas
    private double costoPorTonelada;

    public LoteAcero(double cantidad, double costoPorTonelada) {
        this.cantidad = cantidad;
        this.costoPorTonelada = costoPorTonelada;
    }

    public double calcularCostoTotal() {
        return cantidad * costoPorTonelada;
    }
}

public class Main {
    public static void main(String[] args) {
        LoteAcero lote = new LoteAcero(50.0, 1200.0);
        System.out.println("Costo total del lote: $" + lote.calcularCostoTotal());
        
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
        return "Patrón Creacional - Simple Factory";
    }
}
