/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion.pkg3.singleton;

import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Logger Singleton - Garantiza una única instancia de Logger en la aplicación.
 */
public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public String getIdentidad() {
        String nombre = "ERICK COLLIN ALBORNOZ HERNANDEZ";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public void mostrarInformacion() {
        System.out.println("\n* Nombre: ERICK COLLIN ALBORNOZ HERNANDEZ");
        System.out.println("* Campus: Cali, la Cooperativa de Colombia");

        // Obtener la fecha y hora actual
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("* Fecha y hora: " + formatter.format(now));

        System.out.println("* Repositorio Git: https://github.com/erickcolin2005/ucc_pdoo");
    }
}



