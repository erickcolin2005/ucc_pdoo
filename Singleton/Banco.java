package co.edu.ucc.ERICK.Singleton;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Banco {
    private static Banco instance;
    private String nombreBanco;

    // Constructor privado
    private Banco() {
        nombreBanco = "Banco Central";
    }

    // Método estático para obtener la instancia única
    public static Banco getInstance() {
        if (instance == null) {
            instance = new Banco();
        }
        return instance;
    }

    public void mostrarNombre() {
        System.out.println("Bienvenido al " + nombreBanco);
    }

    // Método que retorna el nombre completo codificado en Base64
    public static String getIdentidad() {
        String nombreCompleto = "Erick [Tu Apellido]";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes(StandardCharsets.UTF_8));
    }
}
