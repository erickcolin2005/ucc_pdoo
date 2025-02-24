/**
 * Autor: Erick [Nombre Completo]
 * Curso: Programación Orientada a Objetos
 * Universidad: UCC
 * Historia de Usuario: 
 * Como pasajero, quiero poder comprar un boleto de autobús para un viaje específico,
 * para poder viajar a mi destino.
 */

package co.edu.ucc.ERICK.Transporte;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

class Boleto {
    private String viaje;
    private String pasajero;

    public Boleto(String viaje, String pasajero) {
        this.viaje = viaje;
        this.pasajero = pasajero;
    }

    public void mostrarBoleto() {
        System.out.println("Viaje: " + viaje + ", Pasajero: " + pasajero);
    }
}

class Autobus {
    public Boleto comprarBoleto(String viaje, String pasajero) {
        return new Boleto(viaje, pasajero);
    }
}

public class Main {
    public static void main(String[] args) {
        Autobus autobus = new Autobus();
        Boleto boleto = autobus.comprarBoleto("Ciudad A - Ciudad B", "Juan Pérez");
        boleto.mostrarBoleto();
        
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
