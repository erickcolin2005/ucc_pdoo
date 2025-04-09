/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion.pkg3.singleton;

// Asegurar la importación de Logger
import seccion.pkg3.singleton.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        System.out.println("=== EJECUCIÓN INICIADA ==="); 
        System.out.flush(); // Forzar impresión inmediata

        // Mostrar información personalizada
        logger.mostrarInformacion();
        System.out.flush();

        // Imprimir logs
        logger.log("Inicio de sesión");
        System.out.flush();

        logger.log("Transacción realizada");
        System.out.flush();

        System.out.println("=== EJECUCIÓN FINALIZADA ===");
        System.out.flush();
    }
}




