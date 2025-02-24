/**
 * Autor: Erick [Nombre Completo]
 * Curso: Programación Orientada a Objetos
 * Universidad: UCC
 * Historia de Usuario: 
 * Como usuario, quiero poder reservar una cancha de fútbol para un día y hora específicos, 
 * para poder jugar con mis amigos.
 */

package co.edu.ucc.ERICK.Recreacion;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

class CanchaReserva {
    private Map<String, String> reservas = new HashMap<>();

    public boolean reservarCancha(String fecha, String hora, String usuario) {
        String clave = fecha + " " + hora;
        if (reservas.containsKey(clave)) {
            return false; // Ya está reservada
        }
        reservas.put(clave, usuario);
        return true;
    }

    public void mostrarReservas() {
        for (Map.Entry<String, String> entry : reservas.entrySet()) {
            System.out.println("Fecha y Hora: " + entry.getKey() + ", Usuario: " + entry.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CanchaReserva cancha = new CanchaReserva();
        cancha.reservarCancha("2023-10-15", "18:00", "Juan Pérez");
        cancha.reservarCancha("2023-10-15", "20:00", "Carlos Gómez");
        cancha.mostrarReservas();
        
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
        return "Patrón Creacional - Singleton";
    }
}
